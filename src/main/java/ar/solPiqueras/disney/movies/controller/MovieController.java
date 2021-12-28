package ar.solPiqueras.disney.movies.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.solPiqueras.disney.movies.entity.Movie;
import ar.solPiqueras.disney.movies.services.IMovieService;

//Clase controlador del CRUD de películas

//Permite recibir las peticiones (request) del front
//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/disney")
public class MovieController {

	@Autowired
	private IMovieService peliculaService;
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/movies")
	public List<Movie> index() {

		return peliculaService.findAll();
	}

	@PreAuthorize("hasRole('USER')")
	@GetMapping("/movies/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {

		Movie pelicula = peliculaService.findById(id);

		return new ResponseEntity<Movie>(pelicula, HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/movies")
	public ResponseEntity<?> create(@Valid @RequestBody Movie pelicula, BindingResult result) {

		Movie nuevaPelicula = null;
		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {
			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);

			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		try {

			nuevaPelicula = peliculaService.save(pelicula);

		} catch (DataAccessException e) {

			response.put("mensaje", "¡Error al guardar la pelicula en la base de datos!");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		}

		response.put("mensaje", "¡La pelicula ha sido guardada con éxito!");
		response.put("pelicula", nuevaPelicula);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/movies/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Movie pelicula, BindingResult result,
			@PathVariable Long id) {

		Movie peli = peliculaService.findById(id);
		Movie actualizado = null;

		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {
			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);

			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		if (peli == null) {
			response.put("mensaje", "Error al editar: La pelicula con ID "
					.concat(id.toString().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		try {
			peli.setImagenPelicula(pelicula.getImagenPelicula());
			peli.setTitulo(pelicula.getTitulo());
			peli.setFecha(pelicula.getFecha());
			peli.setCalificacion(pelicula.getCalificacion());

			actualizado = peliculaService.save(peli);

		} catch (DataAccessException e) {

			response.put("mensaje", "¡Error al actualizar la película en la base de datos!");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "¡La pelicula ha sido editado con éxito!");
		response.put("pelicula", actualizado);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

}
