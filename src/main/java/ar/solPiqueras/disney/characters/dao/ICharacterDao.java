package ar.solPiqueras.disney.characters.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ar.solPiqueras.disney.characters.entity.Character;

//Interfaz para generar operaciones CRUD de la clase Character
public interface ICharacterDao extends CrudRepository<Character, Long> {
	
	public List<Character> findByNombrePersonajeStartsWith(String nombrePersonaje);
	public List<Character> findByEdad(Integer edad);
	
	@Query("select p from Character p inner join p.peliculas where id_pelicula=?1")
	public List<Character> findByPeliculas(long idPelicula);
}
