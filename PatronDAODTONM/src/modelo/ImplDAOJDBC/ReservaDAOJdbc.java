package modelo.ImplDAOJDBC;

import java.time.LocalDate;
import java.util.Collection;

import control.services.ReservaServiceImpl;
import modelo.AbstractDAO.ReservaDAO;
import modelo.Entity.Hotel;
import modelo.Entity.Persona;
import modelo.Entity.Reserva;
import modelo.acceso.AccessJdbc;

public class ReservaDAOJdbc implements ReservaDAO {
	private AccessJdbc accessJdbc;
	private ReservaServiceImpl reservaService;
	
	
	public ReservaDAOJdbc(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public void create(Reserva entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Reserva> findAll() {
		return null;
	}

	@Override
	public Reserva findById(LocalDate id) {
		return null;
	}

	@Override
	public Hotel findHotelbyId(Long hotelId) {
		return reservaService.findHotelbyId(hotelId);
	}

	@Override
	public Persona findPersonabyId(Long personaId) {
		return reservaService.findPersonabyId(personaId);
	}

}
