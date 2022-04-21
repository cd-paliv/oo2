package practica4.ejercicio2;

import java.time.LocalDate;

public interface File {

	public String prettyPrint();
	public String getNombre();
    public String getExtension();
    public String getPermisos();
    public LocalDate getCreacion();
    public double getTamaño();
    
    
}
