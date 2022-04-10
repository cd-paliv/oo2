package practica3.ejercicio3;

public class Dispositivo {

	private Connection connection;
	private Ringer ringer;
	private Display display;
	private Calculator crcCalculator;
	
	public Dispositivo() {
		connection = new WifiConn();
		ringer = new Ringer();
		display = new Display();
		crcCalculator = new CRC16_Calculator();
	}
	
	public String send(String data) {
		int res = crcCalculator.crcFor(data);
		return connection.sendData(data, res);
	}
	
	public String cambiarConexion(Connection c) {
		connection = c;
		ringer.ring();
		return display.showBanner(connection.pict());
	}
	
	public void configurarCalculator(Calculator c) {
		crcCalculator = c;
	}
}
