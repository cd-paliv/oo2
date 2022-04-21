package practica5.ejercicio1;

import java.util.*;
import java.util.stream.Collectors;

public class SpOOtify {

	private List<Autor> autores;
	private List<Usuario> usuarios;
	
	public SpOOtify() {
		super();
		this.autores = new ArrayList<Autor>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public List<Tema> buscarPorTitulo(String texto){
		return this.autores.stream()
				.map(a -> a.getTemasConTexto(texto))
				.flatMap(temas -> temas.stream())
				.collect(Collectors.toList());
	}
	
	public List<Tema> buscarPorAutor(String texto){
		return this.autores.stream()
				.filter(a -> a.getNombre().toLowerCase().contains(texto.toLowerCase())) //filtro por nombre
				.map(a -> a.getTemasDeAutor()) //le pido todos los temas a cada autor
				.flatMap(temas -> temas.stream()) //obtengo los temas
				.collect(Collectors.toList());
	}
	
	public List<Tema> buscarPorAlbum(String texto){
		return this.autores.stream()
				.map(a -> a.getAlbumesConTexto(texto))
				.flatMap(albumes -> albumes.stream())
				.collect(Collectors.toList());
	}
	
	public void addUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void addAutor(Autor a) {
		this.autores.add(a);
	}
}
