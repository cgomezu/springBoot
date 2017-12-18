package co.edu.usbcali.demoSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.demoSpringBoot.model.Usuario;
import co.edu.usbcali.demoSpringBoot.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public String save(@RequestBody Usuario usuario) throws Exception {
		usuarioService.save(usuario);
		return "Usuario guardo correctamente";
	}

}
