package practica2.ejercicio3;

import java.time.LocalDate;
import java.util.*;

public class Directorio extends FileSystem{

	private List<FileSystem> contenido;
	
	/**
	* Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	*/
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
		this.contenido = new ArrayList<FileSystem>();
	}

	/**
	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
	public int tamanoTotalOcupado() {
		return this.tamanio +
			this.contenido.stream().mapToInt(a -> a.tamanoTotalOcupado()).sum();
	}

	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	* filesystem contenido por directorio receptor
	*/
	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(a -> a.archivoMasGrande())
						.max(Comparator.comparing(Archivo::tamanoTotalOcupado)).orElse(null);
	}
	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	* del filesystem contenido por directorio receptor.
	*/
	public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(a -> a.archivoMasNuevo())
						.max(Comparator.comparing(Archivo::getFechaCreacion)).orElse(null);
	}
	
	
	public void agregar(FileSystem f) {
    	this.contenido.add(f);
    }
}
