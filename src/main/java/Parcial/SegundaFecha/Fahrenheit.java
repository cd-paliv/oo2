package Parcial.SegundaFecha;

public class Fahrenheit extends Decorator {

	public Fahrenheit(IComponent c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hook() {
		// TODO Auto-generated method stub
		return "Temperatura F: " + getTemperaturaCelsius() + " ";
	}

}
