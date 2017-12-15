package co.edu.usbcali.demoSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.usbcali.demoSpringBoot.model.Persona;
import co.edu.usbcali.demoSpringBoot.services.PersonaService;

@Controller
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(method=RequestMethod.POST, value="/save")
	@ResponseBody
	public String save(@RequestBody Persona persona) throws Exception {
		personaService.save(persona);
		return "Persona agregada satisfactoriamente";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/update")
	@ResponseBody
	public String update(@RequestBody Persona persona) throws Exception {
		personaService.update(persona);
		return "Persona modificada satisfactoriamente";
	}

}
