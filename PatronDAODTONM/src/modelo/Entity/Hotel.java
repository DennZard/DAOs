package modelo.Entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
}
