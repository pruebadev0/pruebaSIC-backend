package co.gov.sic.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.gov.sic.prueba.entities.Computador;

@Repository
public interface ComputadorRepository extends JpaRepository<Computador, Long> {

}
