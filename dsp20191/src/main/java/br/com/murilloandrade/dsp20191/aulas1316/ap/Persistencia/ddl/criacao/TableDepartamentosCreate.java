package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class TableDepartamentosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Departamentos");

        String sql = "CREATE TABLE IF NOT EXISTS DEPARTAMENTOS(\n" +
                "ID_DEPARTAMENTO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamentos criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
