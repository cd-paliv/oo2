package Parcial.TerceraFecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int integrantes;
	private double margen;
	private String nombre;
	private String objetivo;
	private Double monto;
	private IState estado;
	
	public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, int integrantes, String nombre, String objetivo,
			Double montos) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.integrantes = integrantes;
		this.margen = 8;
		this.nombre = nombre;
		this.objetivo = objetivo;
		this.monto = montos;
		this.estado = new EnConstruccion();
	}
	
	public void AprobarEtapa() {
		this.estado.AprobarEtapa(this);
	}
	
	public void ModificarMargen(double margen) {
		this.estado.ModificarMargen(this, margen);
	}
	
	public void CancelarProyecto() {
		this.estado.CancelarProyecto(this);
	}
	
	public double CostoDeProyecto() {
		return this.monto * this.integrantes;
	}
	
	public double PrecioDelProyecto() {
		return this.CostoDeProyecto() + (this.CostoDeProyecto() * this.margen / 100);
	}
	
	public void cambiarEstado(IState estado) {
		this.estado = estado;
	}

	public double getMargen() {
		return margen;
	}

	public void setMargen(double margen) {
		this.margen = margen;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public int getIntegrantes() {
		return integrantes;
	}

	public String getNombre() {
		return nombre;
	}

	public IState getEstado() {
		return estado;
	}
	
	
}
