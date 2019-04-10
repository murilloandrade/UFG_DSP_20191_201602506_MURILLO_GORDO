package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.query;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Funcionario;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaFuncionario extends PersistenciaJdbc {

    private Funcionario funcionario;

    public ConsultaFuncionario(){
        funcionario = new Funcionario();
    }

    public Funcionario consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM FUNCIONARIOS WHERE ID_FUNCIONARIO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            funcionario.setId(rs.getLong("ID_FUNCIONARIO"));
            funcionario.setMatricula(rs.getLong("MATRICULA"));
            funcionario.setNome(rs.getString("NOME"));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return funcionario;
    }
}
