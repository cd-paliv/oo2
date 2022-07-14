package practica2.ejercicio3;

import java.time.LocalDate;
import java.util.*;

public class Directorio implements FileSystem{

	private String nombre;
	private LocalDate fecha;
	private List<FileSystem> contenido;
	
	/**
	* Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	*/
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.contenido = new ArrayList<FileSystem>();
	}
	
	/**
	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
	public int tamanoTotalOcupado() {
		return this.getTamano() + this.contenido.stream().mapToInt(f -> f.getTamano()).sum();
	}

	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	* filesystem contenido por directorio receptor
	*/
	public Archivo archivoMasGrande() {
		return (Archivo)this.contenido.stream()
										.filter(a -> a.esArchivo())
										.max(Comparator.comparing(FileSystem::getTamano))
										.orElse(null);
	}
	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	* del filesystem contenido por directorio receptor.
	*/
	public Archivo archivoMasNuevo() {
		return (Archivo)this.contenido.stream()
										.filter(a -> a.esArchivo())
										.max(Comparator.comparing(FileSystem::getFecha))
										.orElse(null);
	}
	
	public void agregar(FileSystem e) {
		this.contenido.add(e);
	}
	
	public int getTamano() {
		return 32;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean esArchivo() {
		return false;
	}
}
