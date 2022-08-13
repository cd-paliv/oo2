package Parcial.SegundaFecha;

public class Presion extends Decorator {

	public Presion(IComponent c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hook() {
		// TODO Auto-generated method stub
		return "Presion atmosferica: " + getPresion() + " ";
	}

}
