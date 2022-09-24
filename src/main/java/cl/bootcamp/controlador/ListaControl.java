package cl.bootcamp.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.bootcamp.modelo.Curso;
import cl.bootcamp.modelo.Estudiante;
import cl.bootcamp.modelo.Region;
import cl.bootcamp.service.CursoImplement;
import cl.bootcamp.service.EstudianteImplement;
import cl.bootcamp.service.RegionImplement;


@Controller
@RequestMapping("/")
public class ListaControl {
	
	@Autowired
	private EstudianteImplement estudianteImplement;
	
	@Autowired
	private CursoImplement cursoRepository;
	
	@Autowired
	private RegionImplement regionImplement;
	
	@GetMapping("/estudiantes")
	public String lista(Model model) {
		ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) estudianteImplement.listarEstudiantes();
		ArrayList<Curso> cursos = cursoRepository.listarCursos();
		ArrayList<Region> regiones = regionImplement.listarRegion();
		model.addAttribute("estudiantes", estudiantes);
		model.addAttribute("cursos", cursos);
		model.addAttribute("regiones", regiones);
		return "lista";
		
	}
	
	@PostMapping("/buscar")
	public String buscar(Model model, @RequestParam(value = "codigoCurso") String codigoCurso, @RequestParam(value ="codigoRegion") Integer codigoRegion) {
		ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) estudianteImplement.listarEstudiantesCursos(codigoCurso);
		ArrayList<Estudiante> estudiantesRegiones = (ArrayList<Estudiante>) estudianteImplement.listarEstudiantesRegiones(codigoRegion);
		ArrayList<Estudiante> estudiantesRC = (ArrayList<Estudiante>) estudianteImplement.listarEstudiantesRC(codigoRegion, codigoCurso);
		ArrayList<Curso> cursos = cursoRepository.listarCursos();
		ArrayList<Region> regiones = regionImplement.listarRegion();
		
		
		if(codigoCurso.equals("0")) {
			model.addAttribute("estudiantes", estudiantesRegiones);
		}else if(codigoRegion == 0){
			model.addAttribute("estudiantes", estudiantes);
		}else{
			model.addAttribute("estudiantes", estudiantesRC);
		}
	
		//	model.addAttribute("estudiantes", estudiantes);
		//	model.addAttribute("estudiantes", estudiantesRegiones);
		model.addAttribute("cursos", cursos);
		model.addAttribute("regiones", regiones);


		return "lista";
	}
	}
