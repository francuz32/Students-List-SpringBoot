package cl.bootcamp.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estudiante")
public class Estudiante {

	@Id
	private Integer idEstudiante;
	private String rut;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	
	@ManyToOne
	@JoinColumn(name = "codigo_curso")
	private Curso curso;
	
	
	
	
	
}
