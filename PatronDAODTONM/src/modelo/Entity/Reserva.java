package modelo.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idPersona;
	private Long idHotel;
	private LocalDate fecha;
}
