package ar.solPiqueras.disney.characters.dao;

import org.springframework.data.repository.CrudRepository;
import ar.solPiqueras.disney.characters.entity.Character;

//Interfaz para generar operaciones CRUD de la clase Character
public interface ICharacterDao extends CrudRepository<Character, Long> {

}
