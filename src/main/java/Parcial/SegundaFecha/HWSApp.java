package Parcial.SegundaFecha;

public abstract class HWSApp extends HWS{
	public double getTempCelsius() {
		return (super.getTemperaturaFahrenheit() - 32) /1.8;
	}
	
	public double getPromFahrenheit() {
		return 0;
	}
	
	public abstract String displayData();
}
