package practica3.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class DispositivoTest {

	private Dispositivo d;
	
	@BeforeEach
	public void setUp() {
		d = new Dispositivo();
	}
	
	@Test
	public void conexionTest() {
		assertEquals("4G", d.cambiarConexion(new Connection4GAdapter()));
		assertEquals("WiFi", d.cambiarConexion(new WifiConn()));
	}
	
	@Test
	public void calculatorTest() {		
		assertEquals("x 7791", d.send("x"));
		
		d.configurarCalculator(new CRC32_Calculator());
		assertEquals("x -1741497163", d.send("x"));
	}
}
