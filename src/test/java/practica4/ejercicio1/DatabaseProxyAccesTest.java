package practica4.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.*;

public class DatabaseProxyAccesTest {

	private DatabaseProxyAccess proxy;
	
	@BeforeEach
	void setUp() throws Exception {
		this.proxy = new DatabaseProxyAccess(new DatabaseRealAccess(), "prueba123");
	}
	
	 @Test
	 public void noAutenticadoTest() {
		 try {
			 assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
		 } catch (Exception e) {
			 assertEquals("Acceso denegado", e.getMessage());
		 }
	 }
	 
	 @Test
	 public void autenticadoTest() {
		 try {
			 assertFalse(this.proxy.autenticar("prueba12")); //contraseña erronea
			 this.proxy.autenticar("prueba123"); //contraseña correcta, se autentica
			 assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
		 } catch (Exception e) {
			 assertEquals("Acceso denegado", e.getMessage());
		 }
	 }
}
