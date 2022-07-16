package Parcial.SegundaFecha;

public class PresionDecorator extends HWSAppDecorator{
	public PresionDecorator(HWSApp c) {
		this.concrete = c;
	}
	
	public String displayData() {
		return super.displayData("Presion atmosferica: " + this.concrete.getPresion());
	}
}
