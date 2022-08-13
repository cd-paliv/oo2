package Parcial.SegundaFecha;

public class PromedioF extends Decorator {

	public PromedioF(IComponent c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hook() {
		// TODO Auto-generated method stub
		return "Promedio de Temperaturas F: " + getPromedioFahrenheit() + " ";
	}

}
