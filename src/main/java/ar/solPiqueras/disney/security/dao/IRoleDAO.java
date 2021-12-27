package ar.solPiqueras.disney.security.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.solPiqueras.disney.security.entities.Role;
import ar.solPiqueras.disney.security.enums.RoleName;

@Repository
public interface IRoleDAO extends CrudRepository<Role, Long>{
	Optional<Role> findByRolNombre(RoleName rolnombre);
}
