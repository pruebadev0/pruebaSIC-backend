package co.gov.sic.prueba.services;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import co.gov.sic.prueba.dao.ComputadorRepository;
import co.gov.sic.prueba.dao.EncuestaRepository;
import co.gov.sic.prueba.dao.EncuestadoRepository;
import co.gov.sic.prueba.entities.Computador;
import co.gov.sic.prueba.entities.Encuesta;
import co.gov.sic.prueba.entities.Encuestado;

@RestController
@RequestMapping("/api/pruebaSIC")
@CrossOrigin({"http://localhost:4200", "http://localhost:3000"})
public class EncuestaService {

	@Autowired
	private EncuestaRepository repository;
	
	@Autowired 
	private EncuestadoRepository encuestadoRepository;
	
	@Autowired 
	private ComputadorRepository computadorRepository;
	
	@GetMapping("/encuestas/{username}")
	public List<Encuesta> getEncuestas(@PathVariable String username) {
		Encuestado encuestado = encuestadoRepository.findByNombreUsuario(username);
		List<Encuesta> encuestas = repository.findByEncuestado(encuestado);
		return encuestas;
	}
	
	@PostMapping("/encuestas")
	public ResponseEntity<Void> crearEncuesta(@RequestBody Encuesta encuesta) {
		Encuestado encuestado = encuestadoRepository.findByNombreUsuario(encuesta.getEncuestado().getNombreUsuario());
		Optional<Computador> computador = computadorRepository.findById(encuesta.getComputadorFavorito().getId());
		
		encuesta.setId(null);
		encuesta.setEncuestado(encuestado);
		encuesta.setComputadorFavorito(computador.get());
		encuesta.setFechaEncuesta(new Date());
		
		Encuesta nuevaEncuesta = repository.save(encuesta);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(nuevaEncuesta.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/encuestas/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
