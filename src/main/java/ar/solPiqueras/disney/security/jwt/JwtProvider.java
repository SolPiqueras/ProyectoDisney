package ar.solPiqueras.disney.security.jwt;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;

import ar.solPiqueras.disney.security.dto.JwtDto;
import ar.solPiqueras.disney.security.entities.UserPrivileges;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

// Clase para generar y validar el token (comprueba que esté bien formado y no haya expirado)

@Component
public class JwtProvider {

	private final static Logger log = LoggerFactory.getLogger(JwtProvider.class);

	@Value("${jwt.secret}")
	private String secret;

	@Value("${jwt.expiration}")
	private int expiration;

	// Generar el token
	public String generateToken(Authentication authentication) {

		UserPrivileges userPrivileges = (UserPrivileges) authentication.getPrincipal();

		List<String> roles = userPrivileges.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
		
		return Jwts.builder()
				.setSubject(userPrivileges.getUsername()).setIssuedAt(new Date())
				.claim("roles", roles)
				.setExpiration(new Date(new Date().getTime() + expiration * 1000))
				.signWith(SignatureAlgorithm.HS512, secret.getBytes()).compact();
	}

	// Obtener el nombre del usuario
	public String getNombreUsuarioFromToken(String token) {

		return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token).getBody().getSubject();

	}

	// Validar el token
	public boolean validateToken(String token) {
		try {

			Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token);
			return true;

		} catch (MalformedJwtException e) {
			log.error("Token mal formado");
		} catch (UnsupportedJwtException e) {
			log.error("Token no soportado");
		} catch (ExpiredJwtException e) {
			log.error("Token expirado");
		} catch (IllegalArgumentException e) {
			log.error("Token vacío");
		} catch (SignatureException e) {
			log.error("Error al fimar el token");
		}

		return false;
	}
	
	public String refreshToken(JwtDto jwtDto) throws ParseException {
		
		JWT jwt = JWTParser.parse(jwtDto.getToken());
		JWTClaimsSet claims = jwt.getJWTClaimsSet();
		
		String nombreUsuario = claims.getSubject();
		List<String> roles = (List<String>) claims.getClaim("roles");
		
		
		return Jwts.builder()
				.setSubject(nombreUsuario)
				.claim("roles", roles)
				.setExpiration(new Date(new Date().getTime() + expiration * 1000))
				.signWith(SignatureAlgorithm.HS512, secret.getBytes()).compact();		
	}
}