package practica2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;

public class TopografiaTest {
    private TopografiaCompuesta tmC, tmD;

    @BeforeEach
    public void setUp(){
        tmC = new TopografiaCompuesta();
        tmD = new TopografiaCompuesta();
    }

    @Test
    public void topografiaTest(){
        //topografia mixta ejemplo c
        this.tmC.addComponentes(new Agua());
        this.tmC.addComponentes(new Tierra());
        this.tmC.addComponentes(new Agua());
        this.tmC.addComponentes(new Tierra());
        assertEquals(this.tmC.getProporcion(), 0.5d);

        //topografia mixta ejemplo d
        this.tmD.addComponentes(new Agua());
        this.tmD.addComponentes(new Tierra());
        this.tmD.addComponentes(new Agua());
        this.tmD.addComponentes(this.tmC);
        assertEquals(this.tmD.getProporcion(), 0.625d);
    }
}
