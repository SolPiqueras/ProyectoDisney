package ar.solPiqueras.disney.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import ar.solPiqueras.disney.security.services.UserDetailsServiceImpl;

// Clase que se ejecuta por cada request (petición)
// Se usa para filtrar el acceso a los recursos (permite o no el acceso si la clase JwtProvider valida el token)

public class JwtTokenFilter extends OncePerRequestFilter {

	private final static Logger log = LoggerFactory.getLogger(JwtTokenFilter.class);

	@Autowired
	JwtProvider jwtProvider;

	@Autowired
	UserDetailsServiceImpl userDetailService;

	// Filtro del contexto de autenticación que confirma la autorización del usuario y la validez del token
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		try {
			String token = getToken(request);

			if (token != null && jwtProvider.validateToken(token)) {

				String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token);
				UserDetails userDetails = userDetailService.loadUserByUsername(nombreUsuario);
				UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null,
						userDetails.getAuthorities());
				SecurityContextHolder.getContext().setAuthentication(auth);

			}

		} catch (Exception e) {

			log.error("Error al validar la autorización: " + e.getMessage());

		}

		filterChain.doFilter(request, response);
	}

	// Obtener token sin cabecera
	private String getToken(HttpServletRequest request) {
		String header = request.getHeader("Authorization");
		if (header != null && header.startsWith("Bearer")) {
			return header.replace("Bearer ", "");
		}
		return null;
	}

}
