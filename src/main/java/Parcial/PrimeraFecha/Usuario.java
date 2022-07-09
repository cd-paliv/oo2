package Parcial.PrimeraFecha;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String apellido;
	private String mail;
	private List<Excursion> excursiones;
	
	public Usuario(String nombre, String apellido, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.excursiones = new ArrayList<Excursion>();
	}
	
	public void inscribirse(Excursion e) {
		this.excursiones.add(e);
		e.inscribir(this);
	}
	
	public String getMail() {
		return this.mail;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public List<Excursion> getExcursiones() {
		return excursiones;
	}
	
	
}
