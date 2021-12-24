package ar.solPiqueras.disney.movies.dao;

import org.springframework.data.repository.CrudRepository;

import ar.solPiqueras.disney.movies.entity.Movie;

//Interfaz para generar operaciones CRUD de la clase Movie
public interface IMovieDao extends CrudRepository <Movie, Long> {

}
