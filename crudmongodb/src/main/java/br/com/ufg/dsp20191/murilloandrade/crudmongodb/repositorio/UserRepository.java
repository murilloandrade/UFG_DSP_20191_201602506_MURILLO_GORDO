package br.com.ufg.dsp20191.murilloandrade.crudmongodb.repositorio;

import br.com.ufg.dsp20191.murilloandrade.crudmongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}