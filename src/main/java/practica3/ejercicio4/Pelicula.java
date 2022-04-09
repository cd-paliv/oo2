package practica3.ejercicio4;

import java.util.*;

public class Pelicula {

	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, double puntaje, int anioEstreno) {
		super();
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		similares = new ArrayList<Pelicula>();
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	public void setPeliculaSimilar(Pelicula p) {
		similares.add(p);
	}
	
	protected List<Pelicula> getSimilares() {
		return similares;
	}
	
	
}
