package control.abstracServices;

import modelo.Entity.Hotel;
import modelo.Entity.Persona;

public interface ReservaService {
	public Hotel findHotelbyId(Long hotelId);
	public Persona findPersonabyId(Long personalId); 
}
