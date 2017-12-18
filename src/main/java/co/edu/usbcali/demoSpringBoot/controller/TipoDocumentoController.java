package co.edu.usbcali.demoSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.demoSpringBoot.model.TipoDocumento;
import co.edu.usbcali.demoSpringBoot.services.TipoDocumentoService;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoController {
	
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@RequestMapping(method =RequestMethod.POST, value="/save")
	public String save (@RequestBody TipoDocumento tipoDocumento) throws Exception {
		tipoDocumentoService.save(tipoDocumento);
		return "Tipo documento guardado correctamente";
	}

}
