package com.uniovi.entities;

public class Proffesor {
	private String dni;
	private String nombre;
	private String apellido;
	private String categoria;

	public Proffesor(String dni, String nombre, String apellido, String categoria) {
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
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
