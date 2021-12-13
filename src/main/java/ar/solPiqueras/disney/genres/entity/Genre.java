package ar.solPiqueras.disney.genres.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

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
	
	private static final long serialVersionUID = 1L;
}
