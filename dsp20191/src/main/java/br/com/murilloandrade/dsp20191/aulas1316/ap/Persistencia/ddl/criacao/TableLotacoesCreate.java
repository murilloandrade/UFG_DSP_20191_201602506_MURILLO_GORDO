package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class TableLotacoesCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Lotacoes");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACOES(\n" +
                "ID_LOTACAO LONG NOT NULL PRIMARY KEY,\n" +
                "DATA_INICIAL DATE NOT NULL," +
                "DATA_FINAL DATE," +
                "CARGO LONG NOT NULL, " +
                "DEPARTAMENTO LONG NOT NULL, " +
                "FUNCIONARIO LONG NOT NULL" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacoes criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
