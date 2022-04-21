package practica5.ejercicio1;

import java.util.*;
import java.util.stream.Collectors;

public class Album {

	private String nombre;
	private List<Tema> temas;
	
	public Album(String nombre) {
		super();
		this.nombre = nombre;
		this.temas = new ArrayList<Tema>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Tema> getTemas() {
		return temas;
		//return temas.stream().collect(Collectors.toList());
	}
	
	public List<Tema> getTemasConTexto(String texto){
		return this.temas.stream()
				.filter(a -> a.getNombre().toLowerCase().contains(texto.toLowerCase()))
				.collect(Collectors.toList());
	}
	
	public void addTemas(Tema t) {
		this.temas.add(t);
	}
}
