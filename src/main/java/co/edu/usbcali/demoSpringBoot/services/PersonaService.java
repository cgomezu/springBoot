package co.edu.usbcali.demoSpringBoot.services;

import java.util.List;

import co.edu.usbcali.demoSpringBoot.model.Persona;

public interface PersonaService {
	
	void save(Persona persona) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	void update(Persona persona) throws Exception;
	
	Persona findById(Integer id) throws Exception;
	
	List<Persona> findAll() throws Exception;

}
