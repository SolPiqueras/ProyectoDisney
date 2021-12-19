package ar.solPiqueras.disney.movies.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import ar.solPiqueras.disney.characters.entity.Character;

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
	
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
	@JoinTable(
	        name = "casting",
	        joinColumns = {@JoinColumn(name = "idPelicula", nullable = false)},
	        inverseJoinColumns = {@JoinColumn(name="idPersonaje", nullable = false)}
	    )	
    private Set<Character> personajes;
	
	private static final long serialVersionUID = 1L;
}
