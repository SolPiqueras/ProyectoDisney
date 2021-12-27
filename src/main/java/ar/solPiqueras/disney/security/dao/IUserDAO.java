package ar.solPiqueras.disney.security.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.solPiqueras.disney.security.entities.User;

@Repository
public interface IUserDAO extends CrudRepository<User, Long>{
	Optional<User> findByNombreUsuario(String nombreUsuario);
	boolean existsByNombreUsuario(String nombreUsuario);
	boolean existsByEmail(String email);
}
