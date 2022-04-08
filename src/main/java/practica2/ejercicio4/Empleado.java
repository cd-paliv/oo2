package practica2.ejercicio4;

public abstract class Empleado {

	public abstract int getSueldoBasico();
	
	public double sueldo() {
		return this.getSueldoBasico() + this.getSueldoAdicional()
					- (this.getSueldoBasico() * 0.13 + this.getSueldoAdicional() * 0.05); //descuento
	}
	
	public abstract int getSueldoAdicional();
}
