package practica5.parteII;

public abstract class Llamada {
	private Persoona emisor;
	private Persoona remitente;
	protected int duracionDeLlamada;

	public Llamada(Persoona emisor, Persoona remitente, int duracionDeLlamada) {
		super();
		this.emisor = emisor;
		this.remitente = remitente;
		this.duracionDeLlamada = duracionDeLlamada;
	}

	public abstract double calcularMontoLlamada();
	
	public int getDuracionDeLlamada() {
		return duracionDeLlamada;
	}

	public void setDuracionDeLlamada(int duracionDeLlamada) {
		this.duracionDeLlamada = duracionDeLlamada;
	}


	public Persoona getEmisor() {
		return emisor;
	}
	
	public void setEmisor(Persoona emisor) {
		this.emisor = emisor;
	}

	public Persoona getRemitente() {
		return remitente;
	}

	public void setRemitente(Persoona remitente) {
		this.remitente = remitente;
	}
	
}
