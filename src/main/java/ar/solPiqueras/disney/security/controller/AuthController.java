package ar.solPiqueras.disney.security.controller;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.solPiqueras.disney.security.dto.JwtDto;
import ar.solPiqueras.disney.security.dto.Login;
import ar.solPiqueras.disney.security.dto.Message;
import ar.solPiqueras.disney.security.dto.SignIn;
import ar.solPiqueras.disney.security.entities.Role;
import ar.solPiqueras.disney.security.entities.User;
import ar.solPiqueras.disney.security.enums.RoleName;
import ar.solPiqueras.disney.security.jwt.JwtProvider;
import ar.solPiqueras.disney.security.services.RoleService;
import ar.solPiqueras.disney.security.services.UserService;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleService rolService;
	
	@Autowired
	JwtProvider jwtProvider;
	
	@PostMapping("/registro")
	public ResponseEntity<?> registro(@Valid @RequestBody SignIn nuevoUsuario, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return new ResponseEntity(new Message("Campos mal puestos o email inválido"), HttpStatus.BAD_REQUEST);
		}
		
		if(userService.existsByNombreUsuario(nuevoUsuario.getNombreUsuario())) {
			return new ResponseEntity(new Message("El nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);
		}
		
		if(userService.existsByEmail(nuevoUsuario.getEmail())) {
			return new ResponseEntity(new Message("El email ya existe"), HttpStatus.BAD_REQUEST);
		}
		
		User usuario = new User(nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(), nuevoUsuario.getEmail(), passwordEncoder.encode(nuevoUsuario.getPassword()));
		
		Set<Role> roles = new HashSet<>();
		roles.add(rolService.getByRolNombre(RoleName.ROLE_USER).get());
		if(nuevoUsuario.getRoles().contains("admin")) {
			roles.add(rolService.getByRolNombre(RoleName.ROLE_ADMIN).get());
		}
		usuario.setRoles(roles);
		
		userService.save(usuario);
		
		return new ResponseEntity<>(new Message("Usuario guardado"), HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<JwtDto> login(@Valid @RequestBody Login loginUsuario, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return new ResponseEntity(new Message("Nombre de usuario o contraseña incorrectos"), HttpStatus.BAD_REQUEST);
		}
		
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		String jwt = jwtProvider.generateToken(authentication);
				
		JwtDto jwtDto = new JwtDto(jwt);
		
		return new ResponseEntity(jwtDto, HttpStatus.OK);		
	}
	
	@PostMapping("/refresh")
	public ResponseEntity<JwtDto> refresh(@RequestBody JwtDto jwtDto) throws ParseException {
		
		String token = jwtProvider.refreshToken(jwtDto);
		JwtDto jwt = new JwtDto(token);
		
		return new ResponseEntity(jwt, HttpStatus.OK);
	}
}