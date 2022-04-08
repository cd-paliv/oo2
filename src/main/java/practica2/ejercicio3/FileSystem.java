package practica2.ejercicio3;

import java.time.LocalDate;

public abstract class FileSystem {

	private String nombre;
	private LocalDate fechaCreacion;
	protected int tamanio;
	
	public FileSystem(String nombre, LocalDate fechaCreacion, int tamanio) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public int tamanoTotalOcupado() {
		return tamanio;
	}
	
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();

	
}
