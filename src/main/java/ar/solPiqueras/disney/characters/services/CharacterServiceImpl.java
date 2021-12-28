package ar.solPiqueras.disney.characters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.solPiqueras.disney.characters.dao.ICharacterDao;
import ar.solPiqueras.disney.characters.entity.Character;

//Clase servicio que implementa todos los métodos necesarios del CRUD de personajes
@Service
public class CharacterServiceImpl implements ICharacterService {

	@Autowired
	private ICharacterDao personajeDao;
	
	// Método que ejecuta la consulta a la base de datos SELECT *
	@Override
	@Transactional(readOnly = true)
	public List<Character> findAll() {
		
		return (List<Character>) personajeDao.findAll();
	}
	
	// Método que realiza la consulta a base de datos y devuelve un personaje con un determinado ID
	@Override
	@Transactional(readOnly = true)
	public Character findById(long idPersonaje) {
		
		return personajeDao.findById(idPersonaje).orElse(null);
	}

	// Método que guarda un personaje en la base de datos
	@Override
	@Transactional
	public Character save(Character personaje) {
		
		return personajeDao.save(personaje);
	}
	
	// Método que elimina un personaje con un determinado ID de la base de datos
	@Override
	@Transactional
	public void deleteById(long idPersonaje) {
		
		personajeDao.deleteById(idPersonaje);
	}

}
