package aula2528.ap.Persistencia;

import aula2528.ap.Modelos.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class VeiculoRepositoryImpl implements VeiculoRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.murilloandrade.aula2528jpa");
    private EntityManager em;

    public VeiculoRepositoryImpl(){
        em = emf.createEntityManager();
    }

    @Override
    public Veiculo create(Veiculo veiculo) {
        em.getTransaction().begin();
        em.persist(veiculo);
        em.getTransaction().commit();
        return veiculo;
    }

    @Override
    public Veiculo read(Long id) {
        //em.getTransaction().begin();
        Veiculo veiculo = em.find(Veiculo.class, id);
        //em.getTransaction().commit();
        return veiculo;
    }

    @Override
    public List<Veiculo> findByModelo(String modelo) {
        Query query = em.createQuery("Select p from Veiculo p where p.modelo like :modelo");
        query.setParameter("modelo", modelo);
        return query.getResultList();
    }

    @Override
    public Veiculo update(Veiculo veiculo) {
        em.getTransaction().begin();
        veiculo = em.merge(veiculo);
        em.getTransaction().commit();
        return veiculo;
    }

    @Override
    public void delete(Veiculo veiculo) {
        em.getTransaction().begin();
        em.remove(veiculo);
        em.getTransaction().commit();
    }

    @Override
    public void close() {
        emf.close();
    }
}
