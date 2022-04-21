package practica5.ejercicio1;

import java.util.*;
import java.util.stream.Collectors;

public class Autor {

	private String nombre;
	private List<Album> albumes;

	public Autor(String nombre) {
		super();
		this.nombre = nombre;
		this.albumes = new ArrayList<Album>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addAlbum(Album a) {
		this.albumes.add(a);
	}

	public List<Tema> getTemasDeAutor(){
		return this.albumes.stream()
				.map(a -> a.getTemas())
				.flatMap(a -> a.stream())
				.collect(Collectors.toList());
	}
	
	public List<Tema> getAlbumesConTexto(String texto) {
		return this.albumes.stream()
				.filter(a -> a.getNombre().toLowerCase().contains(texto.toLowerCase()))
				.map(a -> a.getTemas())
				.flatMap(temas -> temas.stream())
				.collect(Collectors.toList());
	}
	
	public List<Tema> getTemasConTexto(String texto){
		return this.albumes.stream()
				.map(a -> a.getTemasConTexto(texto))
				.flatMap(temas -> temas.stream())
				.collect(Collectors.toList());
	}

}
