package ar.solPiqueras.disney.casting.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "elenco_peliculas")
public class Casting implements Serializable{
	
	@Id
	private long idPelicula;
	
	@Id
	private long idPersonaje;
	
	private static final long serialVersionUID = 1L;
}
