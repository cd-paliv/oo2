package Parcial.SegundaFecha;

public abstract class Decorator implements IComponent {
	private IComponent componente;
	
	public Decorator(IComponent c) {
		componente = c;
	}
	
	@Override
	public double getTemperaturaCelsius() {
		// TODO Auto-generated method stub
		return componente.getTemperaturaCelsius();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return componente.getRadiacionSolar();
	}
	
	@Override
	public double getTemperaturaFahrenheit() {
		// TODO Auto-generated method stub
		return componente.getTemperaturaFahrenheit();
	}
	
	@Override
	public double getPromedioFahrenheit() {
		// TODO Auto-generated method stub
		return componente.getPromedioFahrenheit();
	}
	
	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return componente.getPresion();
	}
	
	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return componente.displayData() + this.hook();
	}
	
	protected abstract String hook();


}
