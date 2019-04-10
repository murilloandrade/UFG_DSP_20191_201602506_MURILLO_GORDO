package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.delete;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Cargo;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.query.ConsultaCargo;

import java.sql.PreparedStatement;

public class DeletaCargo extends PersistenciaJdbc {
    public boolean deletaCargo(Long id){
        boolean result = false;
        try {
            Cargo cargo = new ConsultaCargo().consultaPorId(id);
            if (cargo.getId() != null){
                preparaPersistencia();

                String sql = "DELETE FROM ALUNOS WHERE ID_ALUNO = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1,id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Cargo foi excluido corretamente!");
                pstmt.close();
            }else{
                System.out.println("Não foi encontrado cargo com id = " + id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
