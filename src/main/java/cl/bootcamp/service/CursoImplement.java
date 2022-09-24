package cl.bootcamp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bootcamp.modelo.Curso;

@Service
public class CursoImplement implements CursoService{

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public ArrayList<Curso> listarCursos() {
		return (ArrayList<Curso>) cursoRepository.findAll();
	}

}
