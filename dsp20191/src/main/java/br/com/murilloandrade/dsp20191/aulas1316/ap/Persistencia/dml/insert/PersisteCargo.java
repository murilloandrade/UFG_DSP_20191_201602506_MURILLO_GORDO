package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Cargo;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class PersisteCargo extends PersistenciaJdbc {

    Cargo cargo;

    public PersisteCargo(){
        cargo = new Cargo();
    }

    public boolean persisteCargo(Cargo cargo) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO CARGOS " +
                "VALUES('" + cargo.getId() +
                "','" + cargo.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Cargo foi persistido corretamente!");
        stmt.close();
        connection.close();

        return true;
    }

}
