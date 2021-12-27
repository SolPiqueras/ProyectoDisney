package ar.solPiqueras.disney.security.dto;

// Clase que devuelve el responseEntity con el token cuando el usuario hace login

public class JwtDto {

	private String token;
	
	public JwtDto(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
