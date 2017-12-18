package co.edu.usbcali.demoSpringBoot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usbcali.demoSpringBoot.model.TipoDocumento;
import co.edu.usbcali.demoSpringBoot.repository.TipoDocumentoRepository;
import co.edu.usbcali.demoSpringBoot.services.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public void save(TipoDocumento tipoDocumento) throws Exception {
		tipoDocumentoRepository.save(tipoDocumento);
	}

	@Override
	public TipoDocumento findbyId(Integer id) throws Exception {
		return tipoDocumentoRepository.findOne(id);
	}

}
