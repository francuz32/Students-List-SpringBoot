package cl.bootcamp.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comuna")
public class Comuna {

	@Id
	private int codigoComuna;
	private String nombre; 
	
	@ManyToOne
	@JoinColumn(name = "codigo_region")
	@JsonIgnore
	private Region region;
}
