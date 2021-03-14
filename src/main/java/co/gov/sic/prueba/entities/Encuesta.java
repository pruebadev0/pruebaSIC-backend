package co.gov.sic.prueba.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "encuesta")
public class Encuesta {

	@Id
	@SequenceGenerator(name = "seqEncuesta", sequenceName = "seq_encuesta", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEncuesta")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "numero_documento")
	private String numeroDocumento;

	@Column(name = "email")
	private String email;
	
	@Column(name = "comentarios")
	private String comentarios;
	
	@Column(name = "fecha_encuesta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEncuesta;
	
	@ManyToOne
	@JoinColumn(name = "id_encuestado", nullable = false)
	private Encuestado encuestado;

	@OneToOne
	@JoinColumn(name = "id_pc_favorito", nullable = false)
	private Computador computadorFavorito;
	
}
