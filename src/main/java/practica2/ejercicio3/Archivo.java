package practica2.ejercicio3;

import java.time.LocalDate;

public class Archivo extends FileSystem{
	/**
	* Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
	* y en la fecha <fecha>.
	*/
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		super(nombre, fecha, tamano);
	}

	@Override
	public Archivo archivoMasGrande() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return this;
	}
}
