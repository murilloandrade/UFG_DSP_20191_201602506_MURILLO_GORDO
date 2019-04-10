package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.exclusao;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class TableDepartamentosDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Departamentos");

        String sql = "DROP TABLE IF EXISTS DEPARTAMENTOS";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamentos excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }

}
