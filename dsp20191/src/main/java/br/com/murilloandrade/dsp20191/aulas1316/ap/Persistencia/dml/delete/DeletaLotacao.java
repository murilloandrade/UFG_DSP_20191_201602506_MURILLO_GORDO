package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.delete;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Lotacao;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.query.ConsultaLotacao;

import java.sql.PreparedStatement;

public class DeletaLotacao extends PersistenciaJdbc {

    public boolean deletaLotacao(Long id){
        boolean result = false;
        try {
            Lotacao lotacao = new ConsultaLotacao().consultaPorId(id);
            if (lotacao.getId() != null){
                preparaPersistencia();

                String sql = "DELETE FROM LOTACOES WHERE ID_LOTACAO = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1,id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("A Lotacao foi excluida corretamente!");
                pstmt.close();
            }else{
                System.out.println("Não foi encontrada lotacao com id = " + id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
