package co.edu.usbcali.demoSpringBoot.services;

import co.edu.usbcali.demoSpringBoot.model.TipoDocumento;

public interface TipoDocumentoService {
	
	void save(TipoDocumento tipoDocumento) throws Exception;
	
	TipoDocumento findbyId(Integer id) throws Exception;

}
