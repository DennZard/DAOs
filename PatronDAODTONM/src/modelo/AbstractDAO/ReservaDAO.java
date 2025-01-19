package modelo.AbstractDAO;

import java.time.LocalDate;

import modelo.Entity.Hotel;
import modelo.Entity.Persona;
import modelo.Entity.Reserva;

public interface ReservaDAO extends GenericDAO<Reserva, LocalDate> {
	public Hotel findHotelbyId(Long hotelId);
	public Persona findPersonabyId(Long personaId);
}
