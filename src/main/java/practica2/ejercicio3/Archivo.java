package practica2.ejercicio3;

import java.time.LocalDate;

public class Archivo implements FileSystem{
	private String nombre;
	private LocalDate fecha;
	private int tamano;
	
	/**
	* Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
	* y en la fecha <fecha>.
	*/
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}

	public int getTamano() {
		return this.tamano;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean esArchivo() {
		return true;
	}
}
