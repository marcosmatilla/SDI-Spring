package com.uniovi.services;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import com.uniovi.entities.Proffesor;

@Service
public class ProffesorsService {
	private List<Proffesor> proffesorList = new LinkedList<Proffesor>();

	@PostConstruct
	public void init() {
		proffesorList.add(new Proffesor("1", "Lucas", "Vazquez", "Matemáticas"));
		proffesorList.add(new Proffesor("2", "Enrique", "Casemiro", "Lengua"));
	}

	public List<Proffesor> getProffesors() {
		return proffesorList;
	}

	public Proffesor getProffesor(String dni) {
		return proffesorList.stream().filter(x -> x.getDni().equals(dni)).findFirst().get();
	}

	public void addProffesor(Proffesor proffesor) {
		if (proffesor.getDni() == null) {
			proffesor.setDni("");
		}
		proffesorList.add(proffesor);
	}

	public void deleteProffesor(String dni) {
		proffesorList.removeIf(x -> x.getDni().equals(dni));
	}

	public void updateProffesor(Proffesor proffesor) {
		if (getProffesor(proffesor.getDni()) != null) {
			deleteProffesor(proffesor.getDni());
			addProffesor(proffesor);
		}
	}

}
