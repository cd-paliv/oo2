package Parcial.SegundaFecha;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

public class DecoratorTest {
	private IComponent c;
	
	@BeforeEach
	void setUp() {
		c = new HWSConcrete();
	}
	
	@Test
	void ejemplo2Test() {
		IComponent p = new Presion(c);
		IComponent r = new Radiacion(p);
		assertEquals(r.displayData(), "Presion atmosferica: 1008.0 Radiacion solar: 500.0 ");
	}
}
