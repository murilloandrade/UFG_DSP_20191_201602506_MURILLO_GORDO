package br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.delete;

import br.com.murilloandrade.dsp20191.aulas1316.ap.Objetos.Departamento;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.base.PersistenciaJdbc;
import br.com.murilloandrade.dsp20191.aulas1316.ap.Persistencia.dml.query.ConsultaDepartamento;

import java.sql.PreparedStatement;

public class DeletaDepartamento extends PersistenciaJdbc {

    public boolean deletaDepartamento(Long id){
        boolean result = false;
        try {
            Departamento departamento = new ConsultaDepartamento().consultaPorId(id);
            if (departamento.getId() != null){
                preparaPersistencia();

                String sql = "DELETE FROM DEPARTAMENTOS WHERE ID_DEPARTAMENTO = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1,id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Departamento foi excluido corretamente!");
                pstmt.close();
            }else{
                System.out.println("Não foi encontrado departamento com id = " + id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
