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
		p = new Proyecto("Vacaciones Kathmandu 2023", 5000, e);
	}
	
	@Test
	void setUpProyectoTest() {
		e.createProyecto(p);
		assertEquals(e.getProyectos().size(), 1);
		assertEquals(e.getProyectos().get(0).getTitulo(), p.getTitulo());
		assertEquals(p.getMontoDeseado(), 5000);
	}
	
	@Test
	void aporteAProyectoTest() {
		assertEquals(p.getMontoActual(), 0);
		p.invertir(500);
		assertEquals(p.getMontoActual(), 500);
		assertEquals(p.getMontoDeseado() - p.getMontoActual(), 4500);
	}
}