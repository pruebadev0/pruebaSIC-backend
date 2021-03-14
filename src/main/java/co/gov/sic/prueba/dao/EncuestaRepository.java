package co.gov.sic.prueba.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.gov.sic.prueba.entities.Encuesta;
import co.gov.sic.prueba.entities.Encuestado;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Long> {

	List<Encuesta> findByEncuestado(Encuestado encuestado);
	
}
