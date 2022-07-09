package practica7.ejercicio1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LavadoTest {
	private Lavarropas l;

    @BeforeEach
    public void setUp(){
        l = new Lavarropas();
    }
    
    @Test
    public void test1() {
    	l.cambiarProgramaDeLavado(new LavadoDiario());
    	assertEquals(30, l.lavar(0));
    	l.cambiarProgramaDeLavado(new RopaDelicada());
    	assertEquals(55, l.lavar(0));
    	l.cambiarProgramaDeLavado(new RopaMuySucia());
    	assertEquals(155, l.lavar(0));
    }
}
