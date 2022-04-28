package practica5.parteI;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

import practica5.parteI.ejercicio1.*;

public class SpOOtifyTest {

	private SpOOtify s;
	private Autor a1,a2,a3;
	
	@BeforeEach
	public void setUp() {
		this.s = new SpOOtify();
		
		this.a1 = new Autor("Germo");
		Album al1 = new Album("Jerusalem");
		al1.addTemas(new Tema("Resucitando"));
		al1.addTemas(new Tema("Tres dias encerrado"));
		al1.addTemas(new Tema("Mi papa es un hdp"));
		a1.addAlbum(al1);
		
		this.a2 = new Autor("Nanu");
		Album al2 = new Album("La vecina");
		al2.addTemas(new Tema("Durmiendo con la vecina"));
		al2.addTemas(new Tema("Ya vengo con la vecina"));
		al2.addTemas(new Tema("Dias con la vecina"));
		a2.addAlbum(al2);
		
		this.a3 = new Autor("Pau");
		Album al3 = new Album("uwu");
		al3.addTemas(new Tema("owo"));
		al3.addTemas(new Tema("dias sin awa"));
		al3.addTemas(new Tema("ewe"));
		a3.addAlbum(al3);
		
		s.addAutor(a1);
		s.addAutor(a2);
		s.addAutor(a3);
	}
	
	@Test
	public void tituloTest() {
		//obtiene los 3 temas que contienen la palabra "dias"
		assertEquals(this.s.buscarPorTitulo("diAs").get(0).getNombre(), "Tres dias encerrado");
		assertEquals(this.s.buscarPorTitulo("dIas").get(1).getNombre(), "Dias con la vecina");
		assertEquals(this.s.buscarPorTitulo("diaS").get(2).getNombre(), "dias sin awa");
	}
	
	@Test
	public void autorTest() {
		//obtiene los 6 temas de los artistas con "a": 3 de Nanu y 3 de Pau
		assertEquals(this.s.buscarPorAutor("a").get(0).getNombre(), "Durmiendo con la vecina");
		assertEquals(this.s.buscarPorAutor("a").get(3).getNombre(), "owo");
	}
	
	@Test
	public void albumTest() {
		//obtiene los 3 temas de Germo
		assertEquals(this.s.buscarPorAlbum("JeRuSaLeM").get(0).getNombre(), "Resucitando");
		assertEquals(this.s.buscarPorAlbum("JeRuSaLeM").size(), 3);
	}
}
