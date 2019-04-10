package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class TableCargosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Cargos");

        String sql = "CREATE TABLE IF NOT EXISTS CARGOS(\n" +
                "ID_CARGO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL,\n" +
                "SALARIO DOUBLE NOT NULL" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargos criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }

}
