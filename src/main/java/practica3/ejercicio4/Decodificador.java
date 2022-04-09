package practica3.ejercicio4;

import java.util.*;

public class Decodificador {

	private List<Pelicula> disponibles;
	private List<Pelicula> reproducidas;
	private Recommend peliculasRecomendadas;
	
	public Decodificador(List<Pelicula> disponibles, List<Pelicula> reproducidas, Recommend peliculasRecomendadas) {
		super();
		this.disponibles = disponibles;
		this.reproducidas = reproducidas;
		this.peliculasRecomendadas = peliculasRecomendadas;
	}

	public void setCriterio(Recommend r) {
		this.peliculasRecomendadas = r;
	}
	
	public List<Pelicula> getRecomendaciones(){
		return peliculasRecomendadas.getRecomendaciones(disponibles, reproducidas);
	}

	public List<Pelicula> getDisponibles() {
		return disponibles;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}

	public Recommend getPeliculasRecomendadas() {
		return peliculasRecomendadas;
	}
	
	
}
