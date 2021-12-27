package ar.solPiqueras.disney.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.solPiqueras.disney.security.entities.User;
import ar.solPiqueras.disney.security.entities.UserPrivileges;

// Servicio que implementa la interfaz UserDetailsService propia de Spring Securtity
// Se usa para cargar un usuario por su nombre a través del servicio de usuario y construir su autorización

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserService usuarioService;
	
	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		User usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
		return UserPrivileges.build(usuario);
	}

}
