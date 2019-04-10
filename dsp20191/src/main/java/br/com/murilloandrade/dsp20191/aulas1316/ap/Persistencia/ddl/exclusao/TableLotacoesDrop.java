package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.ddl.exclusao;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;

public class TableLotacoesDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Lotacoes");

        String sql = "DROP TABLE IF EXISTS LOTACOES";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacoes excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }

}
