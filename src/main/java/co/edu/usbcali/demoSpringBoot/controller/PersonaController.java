package co.edu.usbcali.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usbcali.demoSpringBoot.model.Persona;
import co.edu.usbcali.demoSpringBoot.repository.PersonaRepository;
import co.edu.usbcali.demoSpringBoot.services.PersonaService;
import co.edu.usbcali.demoSpringBoot.services.impl.PersonaServiceImpl;

//@Controller
@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	/*@Autowired
	private PersonaRepository pr;*/

	/*@Autowired
	public void setPersonaService(PersonaService personaService) {
		this.personaService = personaService;
	}*/

	@RequestMapping(method=RequestMethod.POST, value="/save")
	//@ResponseBody
	public String save(@RequestBody Persona persona) throws Exception {
		this.personaService.save(persona);
		return "Persona agregada satisfactoriamente";
	}
	

	@RequestMapping(method=RequestMethod.POST, value="/update")
	//@ResponseBody
	public String update(@RequestBody Persona persona) throws Exception {
		personaService.update(persona);
		return "Persona modificada satisfactoriamente";
	}
	
	@RequestMapping(value = "/{id}", method= RequestMethod.GET)
	//@ResponseBody
	public Persona getById(@PathVariable("id") Integer id) throws Exception{
		return this.personaService.findById(id);
	}
	
	@RequestMapping(value = "/getAll", method= RequestMethod.GET)
	//@ResponseBody
	public List<Persona> getAll() throws Exception{
		return this.personaService.findAll();
	}
	

}
