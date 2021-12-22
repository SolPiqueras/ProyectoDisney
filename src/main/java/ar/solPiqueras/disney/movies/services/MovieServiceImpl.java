package ar.solPiqueras.disney.movies.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ar.solPiqueras.disney.movies.dao.IMovieDao;
import ar.solPiqueras.disney.movies.entity.Movie;

public class MovieServiceImpl implements IMovieService {

	@Autowired
	private IMovieDao peliculaDao;
	
	// Método que ejecuta la consulta a la base de datos SELECT *
	@Override
	@Transactional(readOnly = true)
	public List<Movie> findAll() {
		
		return (List<Movie>) peliculaDao.findAll();
	}

	// Método que realiza la consulta a base de datos y devuelve un género con un determinado ID
	@Override
	@Transactional(readOnly = true)
	public Movie findById(long idPelicula) {
		
		return peliculaDao.findById(idPelicula).orElse(null);
	}

	// Método que guarda un género en la base de datos
	@Override
	@Transactional
	public Movie save(Movie pelicula) {
		
		return peliculaDao.save(pelicula);
	}

	// Método que elimina un género con un determinado ID de la base de datos
	@Override
	@Transactional
	public void delete(long idPelicula) {
		peliculaDao.deleteById(idPelicula);
		
	}

}
