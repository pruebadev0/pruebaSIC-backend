package co.gov.sic.prueba.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "encuestado")
public class Encuestado {

	@Id
	@SequenceGenerator(name = "seqEncuestado", sequenceName = "seq_encuestado", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEncuestado")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	
}
