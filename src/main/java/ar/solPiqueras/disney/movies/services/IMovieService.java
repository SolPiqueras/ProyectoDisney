package ar.solPiqueras.disney.movies.services;

import java.util.List;
import ar.solPiqueras.disney.movies.entity.Movie;

//Interfaz que contiene los métodos que se implementarán en MovieServiceImpl
public interface IMovieService {
		public List<Movie> findAll(); 
		public Movie findById(long idPelicula);
		public Movie save(Movie pelicula);
		public void delete(long idPelicula);	
}

