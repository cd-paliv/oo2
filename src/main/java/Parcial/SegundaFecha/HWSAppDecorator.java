package Parcial.SegundaFecha;

public abstract class HWSAppDecorator extends HWSApp{
	protected HWSApp concrete;
	
	public String displayData(String print) {
		return print + " " + this.concrete.displayData();
	}
}
