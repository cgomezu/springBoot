package co.edu.usbcali.demoSpringBoot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.usbcali.demoSpringBoot.model.Persona;
import co.edu.usbcali.demoSpringBoot.repository.PersonaRepository;
import co.edu.usbcali.demoSpringBoot.services.PersonaService;

public class PersonaServiceImpl implements PersonaService {
	
	private PersonaRepository personaRepository;
	
	@Autowired
	public void setPersonaRepository(PersonaRepository personaRepository) {
		personaRepository = personaRepository;
	}

	@Override
	public void save(Persona persona) {
		this.personaRepository.save(persona);
		
	}
	
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub

	}

	@Override
	public Persona findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAll() {
		return (List<Persona>) this.personaRepository.findAll();
	}

}
