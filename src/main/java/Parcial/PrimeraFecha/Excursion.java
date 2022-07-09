package Parcial.PrimeraFecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private List<Usuario> inscriptos;
	private List<Usuario> listaDeEspera;
	private IState estado;
	private int cupoMinimo;
	private int cupoMaximo;
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	
	public Excursion(String nombre, int cupoMin, int cupoMax, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo) {
		this.nombre = nombre;
		this.cupoMinimo = cupoMin;
		this.cupoMaximo = cupoMax;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.inscriptos = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}
	
	public void inscribir(Usuario u) {
		this.estado.inscribir(this, u);
	}
	
	public String obtenerInfo() {
		return this.estado.obtenerInfo(this);
	}
	
	public void addInscripto(Usuario u) {
		this.inscriptos.add(u);
	}
	
	public void addEspera(Usuario u) {
		this.listaDeEspera.add(u);
	}
	
	public void iniciarEspera() {
		this.listaDeEspera = new ArrayList<Usuario>();
	}
	
	public int getCantInscriptos() {
		return this.inscriptos.size();
	}
	
	public int getCantEspera() {
		return this.listaDeEspera.size();
	}
	
	public void cambiarEstado(IState nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public String getMailInscriptos(){
		return this.inscriptos.stream().map(i -> i.getMail()).toString();
	}
	
	public int getCupoMinimo() {
		return this.cupoMinimo;
	}
	
	public int getCupoMaximo() {
		return this.cupoMaximo;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public double getCosto() {
		return this.costo;
	}
	
	public String getPuntoEncuentro() {
		return this.puntoEncuentro;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}

	public IState getEstado() {
		return estado;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}
	
}
