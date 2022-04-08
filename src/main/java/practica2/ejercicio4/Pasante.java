package practica2.ejercicio4;

public class Pasante extends Empleado{

	private int examenesRendidos;

	public Pasante(int examenesRendidos) {
		super();
		this.examenesRendidos = examenesRendidos;
	}

	public int getExamenesRendidos() {
		return examenesRendidos;
	}

	@Override
	public int getSueldoBasico() {
		return 20000;
	}

	@Override
	public int getSueldoAdicional() {
		return 2000 * this.getExamenesRendidos();
	}
	
	
}
