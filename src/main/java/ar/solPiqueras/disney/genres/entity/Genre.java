package ar.solPiqueras.disney.genres.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ar.solPiqueras.disney.movies.entity.Movie;

@Entity
@Table(name = "generos")
public class Genre implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idGenero;
	
	@NotEmpty
	@Column(nullable = false)
	private String imagenGenero;
	
	@NotEmpty
	@Column(nullable = false)
	private String nombreGenero;
	
	@OneToMany(mappedBy = "genero")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Set<Movie> peliculas;
	
	
	//Constructores
	public Genre() {
		super();
	}

	public Genre(long idGenero, @NotEmpty String imagenGenero, @NotEmpty String nombreGenero, Set<Movie> peliculas) {
		super();
		this.idGenero = idGenero;
		this.imagenGenero = imagenGenero;
		this.nombreGenero = nombreGenero;
		this.peliculas = peliculas;
	}

	//Getters y Setters
	public long getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(long idGenero) {
		this.idGenero = idGenero;
	}

	public String getImagenGenero() {
		return imagenGenero;
	}

	public void setImagenGenero(String imagenGenero) {
		this.imagenGenero = imagenGenero;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	public Set<Movie> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<Movie> peliculas) {
		this.peliculas = peliculas;
	}
	
	//ToString 
	@Override
	public String toString() {
		return "Genre [idGenero=" + idGenero + ", imagenGenero=" + imagenGenero + ", nombreGenero=" + nombreGenero
				+ ", peliculas=" + peliculas + "]";
	}

	private static final long serialVersionUID = 1L;

}
