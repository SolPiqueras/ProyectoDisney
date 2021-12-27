package ar.solPiqueras.disney.security.entities;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

// Esta clase NO crea una tabla en la base de datos
// Implenta la interfaz UserDetails propia de Spring Security
// Se usa para crear los privilegios de acceso de un usuario

public class UserPrivileges implements UserDetails {

// Los atributos son los mismos de la clase Usuario, pero en vez de roles se le asignan autorizaciones
	private String nombre;
	private String nombreUsuario;
	private String email;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;

	// Constructor
	public UserPrivileges(String nombre, String nombreUsuario, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}

	// Método para construir los privilegios de un usuario
	public static UserPrivileges build(User usuario) {
		// Convertir la clase Role a la clase GrantedAuthority
		List<GrantedAuthority> authorities = usuario.getRoles().stream()
				.map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
		
		// Devolvemos un objeto con los datos del usuario y su nivel de autorización 
		return new UserPrivileges(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmail(),
				usuario.getPassword(), authorities);
	}

	// Getters y setters
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authorities;
	}

	@Override
	public String getPassword() {

		return password;
	}

	@Override
	public String getUsername() {

		return nombreUsuario;
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
