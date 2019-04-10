package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.query;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Cargo;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Departamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Lotacao;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaLotacao extends PersistenciaJdbc {

    private Lotacao lotacao;

    public ConsultaLotacao(){

        lotacao = new Lotacao();
    }

    public Lotacao consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM LOTACOES WHERE ID_LOTACAO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        Cargo cargo = new Cargo();
        Departamento departamento = new Departamento();
        while(rs.next()){
            lotacao.setId(rs.getLong("ID_LOTACAO"));
            lotacao.setDataInicial(rs.getDate("DATAINICIAL"));
            lotacao.setDataFinal(rs.getDate("DATAFINAL"));
            cargo.setId(rs.getLong("CARGO"));
            lotacao.setCargo(cargo);
            departamento.setId(rs.getLong("DEPARTAMENTO"));
            lotacao.setDepartamento(departamento);
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return lotacao;
    }
}
