package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uniovi.entities.Proffesor;
import com.uniovi.services.ProffesorsService;

@Controller
public class ProffesorsController{
	
	@Autowired
	private ProffesorsService proffesorService;

	@RequestMapping("/proffesor/list")
	public String getList(Model model) {
		model.addAttribute("proffesorList", proffesorService.getProffesors());
		return "proffesor/list";
	}
	
	@RequestMapping(value="/proffesor/add")
	public String getProffesor() {
		return "proffesor/add";
	}
	
	@RequestMapping(value = "/proffesor/add", method=RequestMethod.POST)
	public String setProffesor(@ModelAttribute Proffesor proffesor) {
		proffesorService.addProffesor(proffesor);
		return "redirect:/proffesor/list";
	}
	
	@RequestMapping("/proffesor/details/{dni}" )
	public String getDetail(Model model, @PathVariable Long dni) {
		model.addAttribute("proffesor", proffesorService.getProffesor(dni));
		return "proffesor/details";
	}
	
	@RequestMapping("/proffesor/delete/{dni}" )
	public String deleteProffesor(@PathVariable Long dni) {
		proffesorService.deleteProffesor(dni);
		return "redirect:/proffesor/list";
	}

}
