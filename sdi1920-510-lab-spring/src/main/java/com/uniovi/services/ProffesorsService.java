package com.uniovi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.Proffesor;
import com.uniovi.repositories.ProffesorsRepository;

@Service
public class ProffesorsService {
	@Autowired
	private ProffesorsRepository proffesorsRepository;
	
	public List<Proffesor> getProffesors() {
		List<Proffesor> proffesors = new ArrayList<Proffesor>();
		proffesorsRepository.findAll().forEach(proffesors::add);
		return proffesors;
	}

	public Proffesor getProffesor(Long dni) {
		return proffesorsRepository.findById(dni).get();
	}

	public void addProffesor(Proffesor proffesor) {
		proffesorsRepository.save(proffesor);
	}

	public void deleteProffesor(Long dni) {
		proffesorsRepository.deleteById(dni);
	}


}
