package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Departamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class PersisteDepartamento extends PersistenciaJdbc {

    Departamento departamento;

    public PersisteDepartamento(){
        departamento = new Departamento();
    }

    public boolean persisteDepartamento(Departamento departamento) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO DEPARTAMENTOS " +
                "VALUES('" + departamento.getId() +
                "','" + departamento.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Departamento foi persistido corretamente!");
        stmt.close();
        connection.close();

        return true;
    }

}
