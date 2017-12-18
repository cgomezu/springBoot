package co.edu.usbcali.demoSpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.usbcali.demoSpringBoot.model.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Integer> {
	
	List<Persona> findByName(String name);
	
	

}
