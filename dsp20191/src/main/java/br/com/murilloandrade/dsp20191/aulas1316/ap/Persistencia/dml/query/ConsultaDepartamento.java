package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.query;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Departamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDepartamento extends PersistenciaJdbc {

    private Departamento departamento;

    public ConsultaDepartamento(){
        departamento = new Departamento();
    }

    public Departamento consultaPorId(long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM DEPARTAMENTOS WHERE ID_DEPARTAMENTO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,new Long(id));

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            departamento.setId(rs.getLong("ID_DEPARTAMENTO"));
            departamento.setNome(rs.getString("NOME"));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return departamento;
    }

    public List<Departamento> consultaPorNome(String nomeDepartamento) throws Exception{
        List<Departamento> departamentos = new ArrayList<Departamento>();
        preparaPersistencia();

        String sql = "SELECT * FROM DEPARTAMENTOS WHERE NOME = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1,nomeDepartamento);

        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            departamentos.add(new Departamento(rs.getLong("ID_DEPARTAMENTO"),rs.getString("NOME")));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();

        return departamentos;
    }
}
