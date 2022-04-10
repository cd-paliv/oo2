package practica3.ejercicio3;

public class WifiConn implements Connection {

	private String pict = "WiFi";
	
	@Override
	public String sendData(String data, int crc) {
		return data + " " + crc;
	}

	@Override
	public String pict() {
		return pict;
	}

}
