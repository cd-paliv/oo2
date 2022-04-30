package practica5.parteII;

public class PersoonaJuridica extends Persoona {
	private String cuit;

	public PersoonaJuridica(String cuit, String nombre, String tipoDeCliente) {
		super(tipoDeCliente, nombre);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		return 0.15;
	}

	
	
}
