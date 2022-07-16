package Parcial.SegundaFecha;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

public class HWSAppTest {
	private HWSApp app;
	
	@BeforeEach
	void setUp() {
		this.app = new HWSAppConcrete();
	}
	
	@Test
	void ejemplo1Test() {
		HWSAppDecorator radiacion = new RadiacionDecorator(this.app);
		HWSAppDecorator presion = new PresionDecorator(radiacion);
		
		assertEquals(presion.displayData(), "Presion atmosferica: 1008.0 Radiacion solar: 500.0 ");
	}
}
