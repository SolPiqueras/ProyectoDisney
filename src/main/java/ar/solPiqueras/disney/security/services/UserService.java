package ar.solPiqueras.disney.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.solPiqueras.disney.security.dao.IUserDAO;
import ar.solPiqueras.disney.security.entities.User;

@Service
@Transactional
public class UserService {

	@Autowired
	IUserDAO userDAO;

	public Optional<User> getByNombreUsuario(String nombreUsuario) {

		return userDAO.findByNombreUsuario(nombreUsuario);
	}

	public boolean existsByNombreUsuario(String nombreUsuario) {

		return userDAO.existsByNombreUsuario(nombreUsuario);
	}

	public boolean existsByEmail(String email) {

		return userDAO.existsByEmail(email);
	}
	
	public void save(User usuario) {
		userDAO.save(usuario);
	}
}
