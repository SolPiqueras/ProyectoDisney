package ar.solPiqueras.disney.movies.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ar.solPiqueras.disney.characters.entity.Character;
import ar.solPiqueras.disney.genres.entity.Genre;

//Clase entidad para mapear las peliculas en la bd 

@Entity
@Table(name="peliculas")
public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPelicula;
	
	@NotEmpty
	@Column(nullable = false)
	private String imagenPelicula;
	
	@NotEmpty
	@Column(nullable = false)
	private String titulo;
	
	@NotEmpty
	@Column(nullable = false)
	private Date fecha;
	
	@NotEmpty
	@Column(nullable = false)
	private int calificacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idGenero", nullable=false)
	private Genre genero;
	
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, fetch = FetchType.LAZY)
	@JoinTable(
	        name = "casting",
	        joinColumns = {@JoinColumn(name = "idPelicula", nullable = false)},
	        inverseJoinColumns = {@JoinColumn(name="idPersonaje", nullable = false)}
	    )
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<Character> personajes;
	
	
	//Constructores
	public Movie() {
		super();
	}

	public Movie(long idPelicula, @NotEmpty String imagenPelicula, @NotEmpty String titulo, @NotEmpty Date fecha,
			@NotEmpty int calificacion, Genre genero, Set<Character> personajes) {
		super();
		this.idPelicula = idPelicula;
		this.imagenPelicula = imagenPelicula;
		this.titulo = titulo;
		this.fecha = fecha;
		this.calificacion = calificacion;
		this.genero = genero;
		this.personajes = personajes;
	}

	//Getters y Setters
	public long getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getImagenPelicula() {
		return imagenPelicula;
	}

	public void setImagenPelicula(String imagenPelicula) {
		this.imagenPelicula = imagenPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Genre getGenero() {
		return genero;
	}

	public void setGenero(Genre genero) {
		this.genero = genero;
	}

	public Set<Character> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(Set<Character> personajes) {
		this.personajes = personajes;
	}
	
	//To String
	@Override
	public String toString() {
		return "Movie [idPelicula=" + idPelicula + ", imagenPelicula=" + imagenPelicula + ", titulo=" + titulo
				+ ", fecha=" + fecha + ", calificacion=" + calificacion + ", genero=" + genero + ", personajes="
				+ personajes + "]";
	}

	private static final long serialVersionUID = 1L;
}
