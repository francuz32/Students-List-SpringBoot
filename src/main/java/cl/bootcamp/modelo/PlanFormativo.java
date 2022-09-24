package cl.bootcamp.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "plan_formativo")
public class PlanFormativo {
	
	@Id
	private String codigoPlanFormativo;
	private String descripcion;
	
	@OneToMany(mappedBy = "planFormativo")
	@JsonIgnore
	private List<Curso> cursos;
	
	

}
