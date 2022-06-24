package practica7.ejercicio3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {

	public Emprendedor e;
	public Proyecto p;
	
	@BeforeEach
	void setUp() {
		e = new Emprendedor();
		p = new Proyecto("Vacaciones Kathmandu 2023", 5000, 0, e, new Vigente());
	}
	
	@Test
	void setUpProyectoTest() {
		e.createProyecto(p);
		assertEquals(e.getProyectos().size(), 1);
		assertEquals(e.getProyectos().get(0).getTitulo(), p.getTitulo());
		assertEquals(p.getMontoAAlcanzar(), 5000);
	}
	
	@Test
	void aporteAProyectoTest() {
		assertEquals(p.getMontoTotalRecibido(), 0);
		p.invertir(500);
		assertEquals(p.getMontoTotalRecibido(), 500);
	}
}