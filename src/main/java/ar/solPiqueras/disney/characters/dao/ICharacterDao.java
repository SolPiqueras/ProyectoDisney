package ar.solPiqueras.disney.characters.dao;

import org.springframework.data.repository.CrudRepository;

//Interfaz para generar operaciones CRUD de la clase Character
public interface ICharacterDao extends CrudRepository<Character, Long> {

}
