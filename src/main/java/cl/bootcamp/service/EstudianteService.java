package cl.bootcamp.service;

import java.util.List;

import cl.bootcamp.modelo.Estudiante;

public interface EstudianteService {

	public List<Estudiante> listarEstudiantes();
	public List<Estudiante> listarEstudiantesCursos(String codigoCurso);
	public List<Estudiante> listarEstudiantesRegiones(Integer codigoRegion);
	public List<Estudiante> listarEstudiantesRC(Integer codigoRegion, String codigoCurso);

}
