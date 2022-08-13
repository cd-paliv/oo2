package Parcial.SegundaFecha;

public class Celsius extends Decorator {
	
	public Celsius(IComponent c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String hook() {
		// TODO Auto-generated method stub
		return "Temperatura C: " + getTemperaturaCelsius() + " ";
	}

}
