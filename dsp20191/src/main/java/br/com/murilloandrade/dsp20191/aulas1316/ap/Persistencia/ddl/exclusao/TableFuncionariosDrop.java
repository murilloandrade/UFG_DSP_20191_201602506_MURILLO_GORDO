package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.exclusao;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class TableFuncionariosDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Funcionarios");

        String sql = "DROP TABLE IF EXISTS FUNCIONARIOS";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionarios excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
