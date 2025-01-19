package modelo.ImplDAOJDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;

import mapper.PersonaAdapter;
import mapper.PersonaMapper;
import modelo.AbstractDAO.PersonaDAO;
import modelo.Entity.Persona;
import modelo.acceso.AccessJdbc;

public class PersonaDAOJdbc implements PersonaDAO {

	private AccessJdbc accessJdbc;

	public PersonaDAOJdbc(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public void create(Persona entidad) {
		String sql = "INSERT INTO ejemplo.persona (nombre, apellidos,alta) VALUES ( ?, ?, ?)";
		accessJdbc.update(sql,new PersonaAdapter(entidad));
	}

	@Override
	public Collection<Persona> findAll() {
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM persona");
		Collection<Persona> personas = new ArrayList<>();
		try {
			while (conjuntoResultados.next()) {
				personas.add(new PersonaMapper().map(conjuntoResultados));
			} 
		} catch (Exception e) {
			return null;
		}
		return personas;
	}

	@Override
	public Persona findById(Long id) {
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM persona where id = " + id);
		Persona persona = null;
		try {
			while (conjuntoResultados.next()) {
				persona = new PersonaMapper().map(conjuntoResultados);
			} 
		} catch (Exception e) {
			return null;
		}
		return persona;
	}

	@Override
	public Persona findByName(String name) {
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM persona where nombre = '" + name + "'");
		Persona persona = null;
		try {
			while (conjuntoResultados.next()) {
				persona = new PersonaMapper().map(conjuntoResultados);
			} 
		} catch (Exception e) {
			return null;
		}
		return persona;
	}

}
