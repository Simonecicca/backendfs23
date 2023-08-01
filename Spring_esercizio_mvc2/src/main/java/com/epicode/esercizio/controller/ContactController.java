package com.epicode.esercizio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.epicode.esercizio.model.Contact;
import com.epicode.esercizio.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired ContactService contactService;
	
//	@GetMapping("/")
//	public @ResponseBody String getHomeTest () {
//		return "Home page test!!!";
//	}
	
	@GetMapping("/")
	public String getHome () {
		return "index";
	}
	
	
	
	@GetMapping("/rubrica")
	public ModelAndView getRubrica () {
		List<Contact> listaContatti = contactService.getAllContacts();
		//System.out.println(listaContatti.size());
		//listaContatti.forEach(c -> System.out.println(c));
			ModelAndView model = new ModelAndView("rubrica"); //nome della pagina html che voglio richiamare
			model.addObject("rubrica", listaContatti);
			return model;
		}
	
	@GetMapping("/rubrica/{id}")
	public @ResponseBody String getRubrica(@PathVariable String id) {
			return "Contatto" + id;
		}
		
	}


