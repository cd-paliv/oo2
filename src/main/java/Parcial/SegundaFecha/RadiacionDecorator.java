package Parcial.SegundaFecha;

public class RadiacionDecorator extends HWSAppDecorator{
	public RadiacionDecorator(HWSApp c) {
		this.concrete = c;
	}
	
	public String displayData() {
		return super.displayData("Radiacion solar: " + this.concrete.getRadiacionSolar());
	}
}
