package practica7.ejercicio1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class LavadoTest {
    private Lavarropas l;
    private IStrategyLavado estrategia;

    @BeforeEach
    public void setUp(){
        estrategia = new LavadoDiario();
        l = new Lavarropas(estrategia);
    }
    
    @Test
    public void test1() {
    	assertEquals(30, l.lavar());
    }
}
