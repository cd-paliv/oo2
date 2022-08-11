package Parcial.TerceraFecha;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Proyecto prueba;
	
	@BeforeEach
	void setUp() {
		this.prueba = new Proyecto(LocalDate.of(2022, 8, 2), LocalDate.now(), 3, "Vacaciones de invierno", "Salir con amigos", 108.0);
		prueba.AprobarEtapa();
	}
	
	@Test
	void enEvTest() {
		assertEquals(this.prueba.getMargen(), 8);
		this.prueba.ModificarMargen(13);
		assertEquals(this.prueba.getMargen(), 13);
		this.prueba.ModificarMargen(17);
		assertEquals(this.prueba.getMargen(), 13);
	}
}
