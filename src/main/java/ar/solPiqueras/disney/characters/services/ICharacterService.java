package ar.solPiqueras.disney.characters.services;

import java.util.List;
import ar.solPiqueras.disney.characters.entity.Character;

//Interfaz que contiene los métodos que se implementarán en CharacterServiceImpl
public interface ICharacterService {
	public List<Character> findAll(); 
	public Character findById(long idPersonaje);
	public Character save(Character personaje);
	public void deleteById(long idPersonaje);
}
