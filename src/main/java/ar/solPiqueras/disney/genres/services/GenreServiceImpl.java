package ar.solPiqueras.disney.genres.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.solPiqueras.disney.genres.dao.IGenreDao;
import ar.solPiqueras.disney.genres.entity.Genre;

//Clase servicio que implementa todos los métodos necesarios del CRUD de génerod
@Service
public class GenreServiceImpl implements IGenreService {

	@Autowired
	private IGenreDao generoDao;
	
	// Método que ejecuta la consulta a la base de datos SELECT *
	@Override
	@Transactional(readOnly = true)
	public List<Genre> findAll() {
		
		return (List<Genre>) generoDao.findAll();
	}

	// Método que realiza la consulta a base de datos y devuelve un género con un determinado ID
	@Override
	@Transactional(readOnly = true)
	public Genre findById(long idGenero) {
		
		return generoDao.findById(idGenero).orElse(null);
	}

	// Método que guarda un género en la base de datos
	@Override
	@Transactional
	public Genre save(Genre genero) {
		
		return generoDao.save(genero);
	}

	// Método que elimina un género con un determinado ID de la base de datos
	@Override
	@Transactional
	public void delete(long idGenero) {
		generoDao.deleteById(idGenero);
	}

}
