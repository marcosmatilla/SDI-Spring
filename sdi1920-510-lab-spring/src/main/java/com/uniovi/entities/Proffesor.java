package com.uniovi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proffesor {
	@Id
	private Long dni;
	private String nombre;
	private String apellido;
	private String categoria;

	public Proffesor(Long dni, String nombre, String apellido, String categoria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
	}

	public Proffesor() {

	}

	@Override
	public String toString() {
		return "Proffesor [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", categoria=" + categoria
				+ "]";
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
