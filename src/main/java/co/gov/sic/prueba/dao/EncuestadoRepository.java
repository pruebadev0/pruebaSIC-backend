package co.gov.sic.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.gov.sic.prueba.entities.Encuestado;

@Repository
public interface EncuestadoRepository extends JpaRepository<Encuestado, Long> {

	Encuestado findByNombreUsuario(String nombreUsuario);
	
}
