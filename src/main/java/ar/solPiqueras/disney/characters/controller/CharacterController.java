package ar.solPiqueras.disney.characters.controller;

import ar.solPiqueras.disney.characters.entity.Character;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.solPiqueras.disney.characters.services.ICharacterService;

//Clase controlador del CRUD de personajes

//Permite recibir las peticiones (request)
@CrossOrigin
@RestController
@RequestMapping("/disney")
public class CharacterController {

	@Autowired
	private ICharacterService personajeService;

	@PreAuthorize("hasRole('USER')")
	@GetMapping(value = { "/characters", "/characters{param}" })
	public List<String> index(@PathVariable(value = "param", required = false) String param) {

		List<String> listaPersonajes = new ArrayList<String>();
		ArrayList<Character> personajes = new ArrayList<Character>();

		if (param != null) {

			switch (param) {
				case "name":
					personajes = (ArrayList<Character>) personajeService.findByNombrePersonajeStartsWith(param);
					break;
				case "age":
					personajes = (ArrayList<Character>) personajeService.findByEdad(Integer.parseInt(param));
					break;
				case "movies":
					personajes = (ArrayList<Character>) personajeService.findByPeliculas(Long.parseLong(param));
					break;
			}

		} else {

			personajes = (ArrayList<Character>) personajeService.findAll();

		}
		
		for (Character personaje : personajes) {
			listaPersonajes.add(personaje.toString());
		}

		return listaPersonajes;
	}

	@PreAuthorize("hasRole('USER')")
	@GetMapping("/characters/{id}")
	public ResponseEntity<Character> show(@PathVariable Long id) {

		Character personaje = personajeService.findById(id);

		return new ResponseEntity<Character>(personaje, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/characters")
	public ResponseEntity<?> create(@Valid @RequestBody Character personaje, BindingResult result) {

		Character nuevoPersonaje = null;
		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {
			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);

			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		try {

			nuevoPersonaje = personajeService.save(personaje);

		} catch (DataAccessException e) {

			response.put("mensaje", "¡Error al guardar el personaje en la base de datos!");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		}

		response.put("mensaje", "¡El personaje ha sido guardado con éxito!");
		response.put("personaje", nuevoPersonaje);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/characters/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Character personaje, BindingResult result,
			@PathVariable Long id) {

		Character per = personajeService.findById(id);
		Character actualizado = null;

		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {
			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);

			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		if (per == null) {
			response.put("mensaje", "Error al editar: El personaje con ID "
					.concat(id.toString().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		try {
			per.setEdad(personaje.getEdad());
			per.setHistoria(personaje.getHistoria());
			per.setImagenPersonaje(personaje.getImagenPersonaje());
			per.setNombrePersonaje(personaje.getNombrePersonaje());
			per.setPeso(personaje.getPeso());

			actualizado = personajeService.save(per);

		} catch (DataAccessException e) {

			response.put("mensaje", "¡Error al actualizar el personaje en la base de datos!");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "¡El personaje ha sido editado con éxito!");
		response.put("personaje", actualizado);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/characters/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {

		Map<String, Object> response = new HashMap<>();

		try {

			personajeService.deleteById(id);

		} catch (DataAccessException e) {

			response.put("mensaje", "¡Error al eliminar el personaje en la base de datos!");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		}

		response.put("mensaje", "Personaje eliminado con éxito");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
}
