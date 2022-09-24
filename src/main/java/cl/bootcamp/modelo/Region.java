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
@Table(name = "region")
public class Region {

	@Id
	private Integer codigoRegion;
	private String nombre; 
	
	@OneToMany(mappedBy = "region")
	@JsonIgnore
	private List<Comuna> comunas;
	
}
