package co.gov.sic.prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.gov.sic.prueba.dao.ComputadorRepository;
import co.gov.sic.prueba.entities.Computador;

@RestController
@RequestMapping("/api/pruebaSIC")
@CrossOrigin({"http://localhost:4200", "http://localhost:3000"})
public class ComputadorService {

	@Autowired
	private ComputadorRepository repository;
	
	@GetMapping("/computadores")
	public List<Computador> getComputadores() {
		List<Computador> computadores = repository.findAll();
		return computadores;
	}
	
}
