package practica5.parteII;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	protected List<Llamada> llamadas = new ArrayList<Llamada>();
	private String tipoDeCliente;
	private String nombre;
	private String telefono;
	private Persoonal sistema;

	public Persoona(String tipoDeCliente, String nombre) {
		super();
		//this.llamadas = new ArrayList<Llamada>();
		this.tipoDeCliente = tipoDeCliente;
		this.nombre = nombre;
	}

	public Persoona(String tipoDeCliente, String nombre, String telefono, Persoonal sistema) {
		super();
		//this.llamadas = new ArrayList<Llamada>();
		this.tipoDeCliente = tipoDeCliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sistema = sistema;
	}
	
	public abstract double getDescuento();
	
	public void agregarLlamada(Llamada l) {
		llamadas.add(l);
	}
	
	public double calcularMontoTotalLlamadas() {
		double tot = llamadas.stream().mapToDouble(l -> l.calcularMontoLlamada()).sum();
		return tot - (tot * getDescuento());
	}

	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}

	public String getTipoDeCliente() {
		return tipoDeCliente;
	}

	public void setTipoDeCliente(String tipoDeCliente) {
		this.tipoDeCliente = tipoDeCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Persoonal getSistema() {
		return sistema;
	}

	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}
	
}
