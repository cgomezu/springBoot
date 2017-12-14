package co.edu.usbcali.demoSpringBoot.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.usbcali.demoSpringBoot.model.Engine;


@Controller
public class GreetingController {
	
	@RequestMapping(method = RequestMethod.GET, value="/greetingQueryParam")
	public String greetingQueryParam(@RequestParam(value = "name", required = false, defaultValue = "World") 
		String name, Model model){
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/greetingPath/{name}")
	public String greetingPath(@PathVariable("name")
		String name, Model model){
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/add")
	@ResponseBody
	public String greetingPost(@RequestBody Engine engine){	
		System.out.println(engine.getCilindraje() + " - " + engine.getMarca());
		return "greeting";
	}


}
