package practica3.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class DecodificadorTest {

	private Decodificador d1;
	private Pelicula p1, p2, p3, p4, p5, p6;
	
	@BeforeEach
	public void setUp() {
		List<Pelicula> d = new ArrayList<Pelicula>();
		p1 = new Pelicula("Thor", 7.9, 2007);
			p1.setPeliculaSimilar(p2); p1.setPeliculaSimilar(p3);
		p2 = new Pelicula("Capitan America", 7.8, 2016);
			p2.setPeliculaSimilar(p1); p2.setPeliculaSimilar(p3);
		p3 = new Pelicula("Iron man", 7.9, 2010);
			p3.setPeliculaSimilar(p1); p2.setPeliculaSimilar(p2);
		p4 = new Pelicula("Dunkirk", 7.9, 2017);
		p5 = new Pelicula("Rocky", 8.1, 1976);
			p5.setPeliculaSimilar(p6);
		p6 = new Pelicula("Rambo", 7.8, 1979);
			p6.setPeliculaSimilar(p5);
		d.add(p1); d.add(p2); d.add(p3); d.add(p4); d.add(p5); d.add(p6);
		
		List<Pelicula> r = new ArrayList<Pelicula>(); r.add(p1); r.add(p5);
		
		d1 = new Decodificador(d, r, new Novedad());
	}
	
	@Test
	public void novedadTest() {
		List<Pelicula> n = d1.getRecomendaciones();
		assertEquals(this.p4, n.get(0));
		assertEquals(this.p3, n.get(2));
	}
	/*
	@Test
	public void similarTest() {
		d1.setCriterio(new Similar());
		List<Pelicula> n2 = d1.getRecomendaciones();
		System.out.println(n2.size());
		assertEquals(this.p2, n2.get(0));
		assertEquals(this.p6, n2.get(2));
	}*/
	
	@Test
	public void porPuntajeTest() {
		d1.setCriterio(new PorPuntaje());
		List<Pelicula> n3 = d1.getRecomendaciones();
		assertEquals(this.p4, n3.get(0));
		assertEquals(this.p2, n3.get(2));
	}
}
