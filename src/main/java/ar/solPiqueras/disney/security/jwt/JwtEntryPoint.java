package ar.solPiqueras.disney.security.jwt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

// Clase para comprobar si existe un token de acceso válido al intentar acceder a un recurso
// Si no lo encuentra devuelve un response code(código de respuesta) 401 (No autorizado) 

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint{

private final static Logger log = LoggerFactory.getLogger(JwtEntryPoint.class);
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		
		// Mostrar error por consola
		log.error("Error: No existe un token de acceso válido" );
		
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Acceso no autorizado");
		
	}

}
