package cl.bootcamp.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.modelo.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Integer> {

	@Query(value="SELECT * FROM estudiante WHERE estudiante.codigo_curso = ?1", nativeQuery = true)
	List<Estudiante> listarEstudiantesCursos(String codigoCurso);
	
	@Query(value="SELECT * FROM estudiante\r\n"
			+ "JOIN comuna ON estudiante.codigo_comuna = comuna.codigo_comuna\r\n"
			+ "JOIN region ON comuna.codigo_region = region.codigo_region\r\n"
			+ "WHERE region.codigo_region = ?1", nativeQuery = true)
	List<Estudiante> listarEstudiantesRegiones(Integer codigoRegion);
	
	@Query(value="SELECT * FROM estudiante\r\n"
			+ "JOIN comuna ON estudiante.codigo_comuna = comuna.codigo_comuna\r\n"
			+ "JOIN region ON comuna.codigo_region = region.codigo_region\r\n"
			+ "WHERE region.codigo_region = ?1\r\n"
			+ "AND estudiante.codigo_curso = ?2", nativeQuery = true)
	List<Estudiante> listarEstudiantesRC(Integer codigoRegion, String codigoCurso);
}
