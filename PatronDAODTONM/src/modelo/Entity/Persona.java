package modelo.Entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	// esta es la clave
	private Long id;
	private String nombre;
	
public Persona(String string) {
	this.nombre = string;	
	}
}
