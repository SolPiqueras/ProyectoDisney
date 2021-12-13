package ar.solPiqueras.disney.movies.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

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
		
	private static final long serialVersionUID = 1L;
}
