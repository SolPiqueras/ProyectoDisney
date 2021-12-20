package ar.solPiqueras.disney.genres.dao;

import org.springframework.data.repository.CrudRepository;

import ar.solPiqueras.disney.genres.entity.Genre;


//Interfaz para generar operaciones CRUD de la clase Genre
public interface IGenreDao extends CrudRepository<Genre, Long>{
	
}
