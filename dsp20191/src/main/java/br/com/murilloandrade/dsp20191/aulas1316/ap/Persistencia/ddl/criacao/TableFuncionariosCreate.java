package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.criacao;


import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class TableFuncionariosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Funcionarios");

        String sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIOS(\n" +
                "ID_FUNCIONARIO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL," +
                "MATRICULA LONG NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionarios criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
