package co.gov.sic.prueba.security.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.gov.sic.prueba.dao.UsuarioRepository;
import co.gov.sic.prueba.entities.Usuario;

@Service
public class JwtInDatabaseUserDetailsService implements UserDetailsService {

	List<JwtUserDetails> inMemoryUserList = new ArrayList<>();
		
	@Autowired
	public JwtInDatabaseUserDetailsService(UsuarioRepository respository) {
		List<Usuario> usuarios = respository.findAll();
		for (Usuario usuario : usuarios) {
			inMemoryUserList.add(
					new JwtUserDetails(usuario.getId(), 
					usuario.getEncuestado().getNombreUsuario(),
			        usuario.getPassword(), 
			        usuario.getRol().getRol()));
		}
	} 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
				.filter(user -> user.getUsername().equals(username)).findFirst();
		if (!findFirst.isPresent()) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}
		return findFirst.get();
	}

}
