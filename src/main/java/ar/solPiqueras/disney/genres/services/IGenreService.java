package ar.solPiqueras.disney.genres.services;

import java.util.List;

import ar.solPiqueras.disney.genres.entity.Genre;

//Interfaz que contiene los métodos que se implementarán en GenreServiceImpl
public interface IGenreService {
	public List<Genre> findAll(); 
	public Genre findById(long idGenero);
	public Genre save(Genre genero);
	public void delete(long idGenero);	
}
