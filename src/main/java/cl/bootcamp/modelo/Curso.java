package cl.bootcamp.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {

	@Id
	private String codigoCurso;
	
	@OneToMany(mappedBy = "curso")
	@JsonIgnore
	private List<Estudiante> estudiantes;
	
	@ManyToOne
	@JoinColumn(name = "codigoPlanFormativo")
	private PlanFormativo planFormativo;
	
	
	
}
