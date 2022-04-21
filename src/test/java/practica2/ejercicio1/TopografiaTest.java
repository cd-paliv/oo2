package practica2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;

public class TopografiaTest {
    private TopografiaCompuesta tmC, tmD, tmP;

    @BeforeEach
    public void setUp(){
        tmC = new TopografiaCompuesta();
        tmD = new TopografiaCompuesta();
        tmP = new TopografiaCompuesta();
    }

    @Test
    public void topografiaTest(){
        //topografia mixta ejemplo c
        this.tmC.addComponentes(new Agua());
        this.tmC.addComponentes(new Tierra());
        this.tmC.addComponentes(new Agua());
        this.tmC.addComponentes(new Tierra());
        assertEquals(this.tmC.getProporcionAgua(), 0.5d);
        assertEquals(this.tmC.getProporcionTierra(), 0.5d);

        //topografia mixta ejemplo d
        this.tmD.addComponentes(new Agua());
        this.tmD.addComponentes(new Tierra());
        this.tmD.addComponentes(new Agua());
        this.tmD.addComponentes(this.tmC);
        assertEquals(this.tmD.getProporcionAgua(), 0.625d);
        assertEquals(this.tmC.getProporcionTierra(), 0,375d);
    }
    
    @Test
    public void pantanoTest() {
    	this.tmP.addComponentes(new Pantano());
    	this.tmP.addComponentes(new Tierra());
    	this.tmP.addComponentes(new Agua());
    	this.tmP.addComponentes(new Pantano());
    	assertEquals(this.tmP.getProporcionAgua(), 0.6d); //1+0.7+0.7
    	assertEquals(this.tmP.getProporcionTierra(), 0.4d); //1+0.3+0.3
        assertEquals(this.tmP.getProporcion(), 1);
    }
}
