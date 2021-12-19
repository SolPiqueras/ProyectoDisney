package ar.solPiqueras.disney.characters.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import ar.solPiqueras.disney.movies.entity.Movie;


//Clase entidad para mapear los personajes en la bd

@Entity
@Table(name = "personajes")
public class Character implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPersonaje;
	
	@NotEmpty
	@Column(nullable = false)
	private String imagenPersonaje;
	
	@NotEmpty
	@Column(nullable = false)
	private String nombrePersonaje;

	@Column
	private int edad;
	
	@Column
	private double peso;
	
	@NotEmpty
	@Column(nullable = false)
	private String historia;
	
	@ManyToMany(mappedBy = "personajes")
    private Set<Movie> peliculas;
	
	private static final long serialVersionUID = 1L;
}
