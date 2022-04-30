package practica5.parteII;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(Persoona emisor, Persoona remitente, int duracionDeLlamada) {
		super(emisor, remitente, duracionDeLlamada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMontoLlamada() {
		// TODO Auto-generated method stub
		return duracionDeLlamada * 200 + (duracionDeLlamada*200*0.21);
	}

	

}
