package ar.solPiqueras.disney.genres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.solPiqueras.disney.genres.entity.Genre;
import ar.solPiqueras.disney.genres.services.IGenreService;

//Clase controlador del CRUD de géneros

//Permite recibir las peticiones (request) del front
//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Disney")
public class GenreController {
	
	@Autowired
	private IGenreService genreService;
	
	//Metodo para listar todos generos 	
	@GetMapping("/generos")
	public List<Genre> index(){
		
		return genreService.findAll();
	}
	
	//Metodo para mostar un perfil 
	@GetMapping("/generos/{id}")
	public ResponseEntity<?> show(@PathVariable long id){
		Genre genero = genreService.findById(id);
		return new ResponseEntity<Genre> (genero, HttpStatus.OK);
	}
}
