package br.com.inteligate.carga.repository;


import br.com.inteligate.carga.model.Registro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistroRepository extends MongoRepository<Registro, String> {
}
