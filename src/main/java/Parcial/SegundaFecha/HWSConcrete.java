package Parcial.SegundaFecha;

public class HWSConcrete extends HWS implements IComponent{

	@Override
	public double getTemperaturaCelsius() {
		// TODO Auto-generated method stub
		return (getTemperaturaFahrenheit() - 32) / 1.8;
	}

	@Override
	public double getPromedioFahrenheit() {
		// TODO Auto-generated method stub
		return getTemperaturasFahrenheit().stream().mapToDouble(t -> t).average().getAsDouble();
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "";
	}


}
