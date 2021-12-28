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
	private Integer edad;
	
	@Column
	private Double peso;
	
	@NotEmpty
	@Column(nullable = false)
	private String historia;
	
	@ManyToMany(mappedBy = "personajes")
    private Set<Movie> peliculas;
	
	//Constructores
	public Character() {
		super();
	}

	public Character(long idPersonaje, @NotEmpty String imagenPersonaje, @NotEmpty String nombrePersonaje, Integer edad,
			Double peso, @NotEmpty String historia, Set<Movie> peliculas) {
		super();
		this.idPersonaje = idPersonaje;
		this.imagenPersonaje = imagenPersonaje;
		this.nombrePersonaje = nombrePersonaje;
		this.edad = edad;
		this.peso = peso;
		this.historia = historia;
		this.peliculas = peliculas;
	}
	
	//Getters y Setters
	public long getIdPersonaje() {
		return idPersonaje;
	}

	public void setIdPersonaje(long idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	public String getImagenPersonaje() {
		return imagenPersonaje;
	}

	public void setImagenPersonaje(String imagenPersonaje) {
		this.imagenPersonaje = imagenPersonaje;
	}

	public String getNombrePersonaje() {
		return nombrePersonaje;
	}

	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Set<Movie> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<Movie> peliculas) {
		this.peliculas = peliculas;
	}

	//To String
	@Override
	public String toString() {
		return "Character [idPersonaje=" + idPersonaje + ", imagenPersonaje=" + imagenPersonaje + ", nombrePersonaje="
				+ nombrePersonaje + ", edad=" + edad + ", peso=" + peso + ", historia=" + historia + ", peliculas="
				+ peliculas + "]";
	}

	private static final long serialVersionUID = 1L;

}
