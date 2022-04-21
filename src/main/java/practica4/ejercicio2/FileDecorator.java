package practica4.ejercicio2;

import java.time.LocalDate;

public abstract class FileDecorator implements File{

	protected File component;
	
	public FileDecorator(File component) {
		super();
		this.component = component;
	}

	public String prettyPrint(String print) {
		// TODO Auto-generated method stub
		return print + " - " + this.component.prettyPrint();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.component.getExtension();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.component.getPermisos();
	}

	@Override
	public LocalDate getCreacion() {
		// TODO Auto-generated method stub
		return this.component.getCreacion();
	}

	@Override
	public double getTamaño() {
		// TODO Auto-generated method stub
		return this.component.getTamaño();
	}
	
	
}
