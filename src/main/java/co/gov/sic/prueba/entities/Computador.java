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
@Table(name = "computador")
public class Computador {

	@Id
	@SequenceGenerator(name = "seqComputador", sequenceName = "seq_computador", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqComputador")
	@Column(name = "id")
	private Long id;

	@Column(name = "marca")
	private String marca;

	@Column(name = "referencia")
	private String referencia;

	public Computador() {}
	
	public Computador(String marca) {
		this.marca = marca;
	}
	
	public Computador(String marca, String referencia) {
		this.referencia = referencia;
	}
	
}
