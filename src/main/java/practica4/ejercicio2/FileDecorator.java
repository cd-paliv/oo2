package practica4.ejercicio2;

import java.time.LocalDate;

public abstract class FileDecorator implements FileOO2{

	protected FileOO2 component;
	
	public FileDecorator(FileOO2 component) {
		super();
		this.component = component;
	}

	public String prettyPrint(String print) {
		// TODO Auto-generated method stub
		String pretty = this.component.prettyPrint();
		if(! pretty.isEmpty())
			return print + " - " + pretty;
		return print;
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
