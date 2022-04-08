package practica1.ejercicio2;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class BibliotecaTest {
    private Biblioteca b;
    private Socio s1;
    private Socio s2;

    @BeforeEach
    public void setUp(){
        b = new Biblioteca();
        s1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        s2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
        b.agregarSocio(this.s1);
    }

    @Test
    public void agregarSocioTest(){
        assertEquals(b.getCantSocios(), 1);
        b.agregarSocio(this.s2);
        assertEquals(b.getCantSocios(), 2);
    }

    @Test
    public void chequearListaSociosTest(){
        assertTrue(b.chequearSiExisteSocio("Arya Stark"));
        assertFalse(b.chequearSiExisteSocio("Jorge"));
    }
}
