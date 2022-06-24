package practica4.ejercicio2;

import java.time.LocalDate;

public class File implements FileOO2 {

	private String nombre;
	private String extension;
    private String permisos;
    private double tamaño;
    private LocalDate fechaCreacion;
	
    
	public File(String nombre, String extension, String permisos, double tamaño) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.tamaño = tamaño;
		this.fechaCreacion = LocalDate.now();
	}

	@Override
	public String prettyPrint() {
		return "";
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.permisos;
	}

	@Override
	public double getTamaño() {
		// TODO Auto-generated method stub
		return this.tamaño;
	}

	@Override
	public LocalDate getCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

	
	
}
