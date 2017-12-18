package co.edu.usbcali.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.demoSpringBoot.model.Persona;
import co.edu.usbcali.demoSpringBoot.services.PersonaService;

//@Controller
@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	

	@RequestMapping(method=RequestMethod.POST, value="/save")
	public String save(@RequestBody Persona persona) throws Exception {
		this.personaService.save(persona);
		return "Persona guardado satisfactoriamente";
	}
	

	@RequestMapping(method=RequestMethod.POST, value="/update")
	public String update(@RequestBody Persona persona) throws Exception {
		personaService.update(persona);
		return "Persona modificada satisfactoriamente";
	}
	
	@RequestMapping(value = "/{id}", method= RequestMethod.GET)
	public Persona getById(@PathVariable("id") Integer id) throws Exception{
		return this.personaService.findById(id);
	}
	
	@RequestMapping(value = "/getAll", method= RequestMethod.GET)
	public List<Persona> getAll() throws Exception{
		return this.personaService.findAll();
	}
	

}
