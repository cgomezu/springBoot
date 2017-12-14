package co.edu.usbcali.demoSpringBoot.services;

import java.util.List;

import co.edu.usbcali.demoSpringBoot.model.Persona;

public interface PersonaService {
	
	void save(Persona persona);
	
	void delete(Integer id);
	
	void update(Persona persona);
	
	Persona findById(Integer id);
	
	List<Persona> findAll();

}
