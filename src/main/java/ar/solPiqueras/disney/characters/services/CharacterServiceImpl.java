package ar.solPiqueras.disney.characters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ar.solPiqueras.disney.characters.entity.Character;

public class CharacterServiceImpl implements ICharacterService {

	@Autowired
	private ICharacterService personajeDao;
	
	// Método que ejecuta la consulta a la base de datos SELECT *
	@Override
	@Transactional(readOnly = true)
	public List<Character> findAll() {
		
		return personajeDao.findAll();
	}
	
	// Método que realiza la consulta a base de datos y devuelve un género con un determinado ID
	@Override
	@Transactional(readOnly = true)
	public Character findById(long idPersonaje) {
		
		return personajeDao.findById(idPersonaje);
	}

	// Método que guarda un género en la base de datos
	@Override
	@Transactional
	public Character save(Character personaje) {
		
		return personajeDao.save(personaje);
	}
	
	// Método que elimina un género con un determinado ID de la base de datos
	@Override
	@Transactional
	public void delete(long idPersonaje) {
		
		personajeDao.delete(idPersonaje);
	}

}
