package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.insert;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Lotacao;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class PersisteLotacao extends PersistenciaJdbc {

    public boolean persisteLotacao(Lotacao lotacao) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO LOTACOES " +
                "VALUES('" + lotacao.getId() +
                "','" + lotacao.getDataInicial() +
                "','" + lotacao.getDataFinal() +
                "','" + lotacao.getCargo().getId() +
                "','" + lotacao.getDepartamento().getId() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("A Lotacao foi persistida corretamente!");
        stmt.close();
        connection.close();

        return true;
    }
}
