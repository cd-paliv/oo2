package practica5.parteII;

public class PersoonaFisica extends Persoona {
	private String dni;
	
	public PersoonaFisica(String dni, String nombre, String tipoDeCliente) {
		super(tipoDeCliente, nombre);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public double getDescuento() {
		return 0;
	}
	
	
}
