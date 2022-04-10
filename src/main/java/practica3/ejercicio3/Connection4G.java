package practica3.ejercicio3;

public class Connection4G {

	private String symb = "4G";
	
	public String transmit(String data, int crc) {
		return data + " " + crc;
	}

	public String symb() {
		return symb;
	}
}
