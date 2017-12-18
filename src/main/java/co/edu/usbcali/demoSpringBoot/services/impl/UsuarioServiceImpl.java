package co.edu.usbcali.demoSpringBoot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usbcali.demoSpringBoot.model.Usuario;
import co.edu.usbcali.demoSpringBoot.repository.UsuarioRepository;
import co.edu.usbcali.demoSpringBoot.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void save(Usuario usuario) throws Exception {
		usuarioRepository.save(usuario);

	}

	@Override
	public Usuario findbyId(Integer id) throws Exception {
		return usuarioRepository.findOne(id);
	}

}
