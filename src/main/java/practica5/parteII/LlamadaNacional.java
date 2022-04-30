package practica5.parteII;

public class LlamadaNacional extends Llamada {

	public LlamadaNacional(Persoona emisor, Persoona remitente, int duracionDeLlamada) {
		super(emisor, remitente, duracionDeLlamada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMontoLlamada() {
		// TODO Auto-generated method stub
		return duracionDeLlamada * 3 + (duracionDeLlamada*3*0.21);
	}

	

	

}
