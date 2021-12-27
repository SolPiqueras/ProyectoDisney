package ar.solPiqueras.disney.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.solPiqueras.disney.security.dao.IRoleDAO;
import ar.solPiqueras.disney.security.enums.RoleName;
import ar.solPiqueras.disney.security.entities.Role;

@Service
@Transactional
public class RoleService {

	@Autowired
	IRoleDAO rolDAO;
	
	public Optional<Role> getByRolNombre(RoleName rolNombre) {
		return rolDAO.findByRolNombre(rolNombre);
	}
}
