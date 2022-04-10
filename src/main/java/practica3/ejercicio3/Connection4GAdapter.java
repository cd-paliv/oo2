package practica3.ejercicio3;

public class Connection4GAdapter implements Connection {

	private Connection4G adaptee;

	public Connection4GAdapter() {
		this.adaptee = new Connection4G();
	}
	
	@Override
	public String sendData(String data, int crc) {
		return this.adaptee.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.adaptee.symb();
	}
	
	
}
