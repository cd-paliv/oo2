package practica2.ejercicio4;

public class Temporario extends Empleado{

	private int cantidadHoras;
	private int hijxs;
	private boolean casadx;
	
	public Temporario(int cantidadHoras, int hijxs, boolean casadx) {
		super();
		this.cantidadHoras = cantidadHoras;
		this.hijxs = hijxs;
		this.casadx = casadx;
	}	
	
	@Override
	public int getSueldoBasico() {
		return 20000 + (this.getCantidadHoras() * 300);
	}

	@Override
	public int getSueldoAdicional() {
		return this.isCasadx() ? 5000 + (2000 * this.getHijxs()) : (2000 * this.getHijxs());
	}

	public int getHijxs() {
		return hijxs;
	}

	public boolean isCasadx() {
		return casadx;
	}
	
	public int getCantidadHoras() {
		return this.cantidadHoras;
	}
	
	
}
