package co.edu.usbcali.demoSpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.edu.usbcali.demoSpringBoot.model.Persona;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface PersonaRepository extends JpaRepository<Persona, Integer> {
	
	List<Persona> findByName(String name);
	
	

}
