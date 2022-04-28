package practica5.parteI.ejercicio1;


public class Tema {

	private String nombre;

	public Tema(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean containsTxt(String texto) {
		return this.getNombre().toLowerCase().contains(texto.toLowerCase());
	}
	
}
