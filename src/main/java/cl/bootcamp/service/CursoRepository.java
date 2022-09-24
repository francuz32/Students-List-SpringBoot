package cl.bootcamp.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.modelo.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, String> {

}
