package co.edu.usbcali.demoSpringBoot.repository;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.edu.usbcali.demoSpringBoot.model.Persona;

import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
	
	List<Persona> findByName(String name);

}
