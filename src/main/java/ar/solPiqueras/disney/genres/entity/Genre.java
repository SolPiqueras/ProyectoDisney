package ar.solPiqueras.disney.genres.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

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
	private Set<Movie> peliculas;
	
	private static final long serialVersionUID = 1L;
}
