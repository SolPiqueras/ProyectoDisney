package ar.solPiqueras.disney.security.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ar.solPiqueras.disney.security.enums.RoleName;

//Clase entidad para mapear los roles de usuario en la bd 

@Entity
@Table(name="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRol;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private RoleName rolNombre;

	public Role() {
	}

	public Role(@NotNull RoleName rolNombre) {
		this.rolNombre = rolNombre;
	}

	public long getIdRol() {
		return idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public RoleName getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RoleName rolNombre) {
		this.rolNombre = rolNombre;
	}
}
