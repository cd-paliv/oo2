package practica5.ejercicio1;

import java.util.*;

public class Usuario {
	
	private String nombre;
	private List<Tema> MyMusic;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.MyMusic = new ArrayList<Tema>();
	}

	public void addMusic(Tema t) {
		this.MyMusic.add(t);
	}
	
	public void removeMusic(Tema t) {
		this.MyMusic.remove(t);
	}
	
	public String getNombre() {
		return nombre;
	}

	public List<Tema> getMyMusic() {
		return MyMusic;
	}
	
	
}
