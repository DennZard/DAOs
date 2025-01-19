package control.services;

import control.abstracServices.ReservaService;
import modelo.AbstractDAO.HotelDAO;
import modelo.AbstractDAO.PersonaDAO;
import modelo.Entity.Hotel;
import modelo.Entity.Persona;
import lombok.Data;

@Data
public class ReservaServiceImpl implements ReservaService {
	private HotelDAO hotelDAO;
	private PersonaDAO personaDAO;
	
	public Hotel findHotelbyId(Long hotelId) {
		return hotelDAO.findById(hotelId);
	}

	public Persona findPersonabyId(Long personaId) {
		return personaDAO.findById(personaId);
	}
}
