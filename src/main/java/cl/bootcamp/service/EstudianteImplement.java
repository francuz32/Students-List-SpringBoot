package cl.bootcamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bootcamp.modelo.Estudiante;

@Service
public class EstudianteImplement implements EstudianteService{
	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public List<Estudiante> listarEstudiantes() {
		return (List<Estudiante>) estudianteRepository.findAll();
	}

	@Override
	public List<Estudiante> listarEstudiantesCursos(String codigoCurso) {
		return estudianteRepository.listarEstudiantesCursos(codigoCurso);
	}

	@Override
	public List<Estudiante> listarEstudiantesRegiones(Integer codigoRegion) {
		return estudianteRepository.listarEstudiantesRegiones(codigoRegion);
	}

	@Override
	public List<Estudiante> listarEstudiantesRC(Integer codigoRegion, String codigoCurso) {
		return estudianteRepository.listarEstudiantesRC(codigoRegion, codigoCurso);
	}



	


}
