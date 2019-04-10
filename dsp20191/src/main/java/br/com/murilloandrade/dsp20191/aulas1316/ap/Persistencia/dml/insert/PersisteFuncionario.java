package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Funcionario;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class PersisteFuncionario extends PersistenciaJdbc {

    public boolean persisteFuncionario(Funcionario funcionario) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO FUNCIONARIOS " +
                "VALUES('" + funcionario.getId() +
                "','" + funcionario.getMatricula() +
                "','" + funcionario.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Funcionario foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }
}
