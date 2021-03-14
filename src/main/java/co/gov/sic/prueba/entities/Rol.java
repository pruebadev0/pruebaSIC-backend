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
@Table(name = "rol")
public class Rol {

	@Id
	@SequenceGenerator(name = "seqRol", sequenceName = "seq_rol", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqRol")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "rol")
	private String rol;
	
}
