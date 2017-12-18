package co.edu.usbcali.demoSpringBoot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usbcali.demoSpringBoot.model.Persona;
import co.edu.usbcali.demoSpringBoot.model.TipoDocumento;
import co.edu.usbcali.demoSpringBoot.model.Usuario;
import co.edu.usbcali.demoSpringBoot.repository.PersonaRepository;
import co.edu.usbcali.demoSpringBoot.services.PersonaService;
import co.edu.usbcali.demoSpringBoot.services.TipoDocumentoService;
import co.edu.usbcali.demoSpringBoot.services.UsuarioService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private TipoDocumentoService tipoDocumentoService;


	@Override
	public void save(Persona persona) throws Exception{

		Usuario usuario = usuarioService.findbyId(persona.getUsuario().getId());
		if(usuario == null) {
			throw new Exception("La usuario no existe");
		}
		
		TipoDocumento tipoDocumento = tipoDocumentoService.findbyId(persona.getTipoDocumento().getId());
		if(tipoDocumento == null) {
			throw new Exception("La tipo documento no existe");
		}
		
		persona.setUsuario(usuario);
		persona.setTipoDocumento(tipoDocumento);
		this.personaRepository.save(persona);

	}

	@Override
	public void delete(Integer id) throws Exception{
		if(id == 0 || id == null) {
			throw new Exception("El id es obligatorio");
		}
		personaRepository.delete(id);
	}

	@Override
	public void update(Persona persona) throws Exception{
		if(persona.getId() == 0 || persona.getId() == null) {
			throw new Exception("El id es obligatorio");
		}
		if(persona.getEmail().isEmpty() || persona.getEmail() == null) {
			throw new Exception("El email es obligatorio");
		}
		if(persona.getName().isEmpty() || persona.getName() == null) {
			throw new Exception("El nombre es obligatorio");
		}
		if(persona.getLastname().isEmpty() || persona.getLastname() == null) {
			throw new Exception("El nombre es obligatorio");
		}
		if(persona.getCellphone().isEmpty() || persona.getCellphone() == null) {
			throw new Exception("El celular es obligatorio");
		}
		if(persona.getAddress().isEmpty() || persona.getAddress() == null) {
			throw new Exception("La direcciòn es obligatorio");
		}
		this.personaRepository.save(persona);
	}

	@Override
	public Persona findById(Integer id) throws Exception{
		if(id == 0 || id == null) {
			throw new Exception("El id es obligatorio");
		}
		return personaRepository.findOne(id);
	}

	@Override
	public List<Persona> findAll() throws Exception{
		return (List<Persona>) this.personaRepository.findAll();
	}

}
