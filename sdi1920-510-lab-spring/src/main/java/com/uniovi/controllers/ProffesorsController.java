package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniovi.entities.Proffesor;
import com.uniovi.services.ProffesorsService;

@RestController
public class ProffesorsController{
	
	@Autowired
	private ProffesorsService proffesorService;

	@RequestMapping("/proffesor/list")
	public String getList() {
		return proffesorService.getProffesors().toString();
	}
	
	@RequestMapping(value = "/proffesor/add", method=RequestMethod.POST)
	public String setProffesor(@ModelAttribute Proffesor proffesor) {
		proffesorService.addProffesor(proffesor);
		return "Proffesor added";
	}
	
	@RequestMapping("/proffesor/details/{dni}" )
	public String getDetail(@PathVariable Long dni) {
		return proffesorService.getProffesor(dni).toString();
	}
	
	@RequestMapping("/proffesor/delete/{dni}" )
	public String deleteProffesor(@PathVariable Long dni) {
		proffesorService.deleteProffesor(dni);
		return "Proffesor deleted";
	}

}
