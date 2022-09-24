package cl.bootcamp.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bootcamp.modelo.Curso;
import cl.bootcamp.modelo.Estudiante;
import cl.bootcamp.modelo.Region;
import cl.bootcamp.service.CursoImplement;
import cl.bootcamp.service.EstudianteImplement;
import cl.bootcamp.service.RegionImplement;

@RestController
@RequestMapping("/api/v1")
public class ApiControl {
	
	@Autowired
	private EstudianteImplement estudianteImplement;
	
	@GetMapping("/estudiantes")
	public List<Estudiante> lista() {
		ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) estudianteImplement.listarEstudiantes();


		return estudiantes;
		
	}

}
