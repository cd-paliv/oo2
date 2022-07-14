package practica2.ejercicio3;

import java.time.LocalDate;

public interface FileSystem {

	public int getTamano();

	public LocalDate getFecha();
	
	public String getNombre();
	
	public boolean esArchivo();

	
}
