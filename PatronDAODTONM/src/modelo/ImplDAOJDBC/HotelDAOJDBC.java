package modelo.ImplDAOJDBC;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import mapper.HotelMapper;
import mapper.PersonaMapper;
import modelo.AbstractDAO.HotelDAO;
import modelo.Entity.Hotel;
import modelo.Entity.Persona;
import modelo.acceso.AccessJdbc;

public class HotelDAOJDBC implements HotelDAO {

	private AccessJdbc accessJdbc;
	
	public HotelDAOJDBC(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public void create(Hotel entidad) {
		
	}

	@Override
	public Collection<Hotel> findAll() {
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM hotel");
		Collection<Hotel> hoteles = new ArrayList<>();
		try {
			while (conjuntoResultados.next()) {
				hoteles.add(new HotelMapper().map(conjuntoResultados));
			} 
		} catch (Exception e) {
			return null;
		}
		return hoteles;
	}

	@Override
	public Hotel findById(Long id) {
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM hotel where id = " + id);
		Hotel hotel = null;
		try {
			while (conjuntoResultados.next()) {
				hotel = new HotelMapper().map(conjuntoResultados);
			} 
		} catch (Exception e) {
			return null;
		}
		return hotel;
	}

	@Override
	public Hotel findByName(String name) {
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM hotel where nombre = '" + name + "'");
		Hotel hotel = null;
		try {
			while (conjuntoResultados.next()) {
				hotel = new HotelMapper().map(conjuntoResultados);
			} 
		} catch (Exception e) {
			return null;
		}
		return hotel;
	}

}
