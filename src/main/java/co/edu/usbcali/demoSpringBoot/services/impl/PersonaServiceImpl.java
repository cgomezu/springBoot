package co.edu.usbcali.demoSpringBoot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usbcali.demoSpringBoot.model.Persona;
import co.edu.usbcali.demoSpringBoot.repository.PersonaRepository;
import co.edu.usbcali.demoSpringBoot.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	private PersonaRepository personaRepository;

	@Autowired
	public void setPersonaRepository(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	@Override
	public void save(Persona persona) throws Exception{

		/*if(persona.getEmail().isEmpty() || persona.getEmail() == null) {
			throw new Exception("El email es obligatorio");
		}*/
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
		if(persona.getUsername().isEmpty() || persona.getUsername() == null) {
			throw new Exception("El usuario es obligatorio");
		}
		if(persona.getPassword().isEmpty() || persona.getPassword() == null) {
			throw new Exception("El password es obligatorio");
		}

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
		if(persona.getUsername().isEmpty() || persona.getUsername() == null) {
			throw new Exception("El usuario es obligatorio");
		}
		if(persona.getPassword().isEmpty() || persona.getPassword() == null) {
			throw new Exception("El password es obligatorio");
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
