package Parcial.SegundaFecha;

public class Radiacion extends Decorator {

	public Radiacion(IComponent c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hook() {
		// TODO Auto-generated method stub
		return "Radiacion solar: " + getRadiacionSolar() + " ";
	}

}
