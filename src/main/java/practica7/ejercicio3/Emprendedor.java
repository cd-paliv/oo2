package practica7.ejercicio3;

import java.util.*;

public class Emprendedor {
	private List<Proyecto> proyectos;

	public Emprendedor() {
		super();
		proyectos = new ArrayList<Proyecto>();
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	public void createProyecto(Proyecto p) {
		proyectos.add(p);
	}
}
