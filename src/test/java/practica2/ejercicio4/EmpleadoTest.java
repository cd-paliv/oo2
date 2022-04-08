package practica2.ejercicio4;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class EmpleadoTest {

	private Empleado t, pas, pla;
	
	@BeforeEach
	public void setUp() {
		t = new Temporario(15, 3, true);
		pas = new Pasante(3);
		pla = new Planta(38, 5, false);
	}
	
	@Test
	public void testTemporario() {
		assertEquals(t.getSueldoBasico(), 24500); //13% = 3185
		assertEquals(t.getSueldoAdicional(), 11000); //5% = 550
		assertEquals(t.sueldo(), 31765); //35500 - 3735
	}
	
	@Test
	public void testPasante() {
		assertEquals(pas.getSueldoBasico(), 20000); //13% = 2600
		assertEquals(pas.getSueldoAdicional(), 6000); //5% = 300
		assertEquals(pas.sueldo(), 23100);
	}
	
	@Test
	public void testPlanta() {
		assertEquals(pla.getSueldoBasico(), 50000); //13% = 6500
		assertEquals(pla.getSueldoAdicional(), 86000); //5% = 4300
		assertEquals(pla.sueldo(), 125200); //()
	}
}
