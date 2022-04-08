package practica2.ejercicio4;

public class Planta extends Empleado {

	private int antiguedad;
	private int hijxs;
	private boolean casadx;
	
	public Planta(int antiguedad, int hijxs, boolean casadx) {
		super();
		this.antiguedad = antiguedad;
		this.hijxs = hijxs;
		this.casadx = casadx;
	}

	@Override
	public int getSueldoBasico() {
		return 50000;
	}

	@Override
	public int getSueldoAdicional() {
		return this.isCasadx() ? 5000 + (2000*this.getHijxs()) + (2000 * antiguedad) //si esta casadx
								: (2000*this.getHijxs()) + (2000 * antiguedad); //si no esta casadx
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public int getHijxs() {
		return hijxs;
	}

	public boolean isCasadx() {
		return casadx;
	}
}
