package modelo.AbstractDAO;

import modelo.Entity.Hotel;
import modelo.Entity.Persona;

public interface HotelDAO extends GenericDAO<Hotel, Long> {
	public Hotel findByName(String name);
}
