package co.edu.usbcali.demoSpringBoot.services;

import co.edu.usbcali.demoSpringBoot.model.Usuario;

public interface UsuarioService {
	
	void save(Usuario usuario) throws Exception;
	
	Usuario findbyId(Integer id) throws Exception;

}
