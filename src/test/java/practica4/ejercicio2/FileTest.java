package practica4.ejercicio2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

public class FileTest {

	private FileOO2 file;
	
	@BeforeEach
	void setUp() {
		file= new FileOO2("archivito",".exe","usuario",64);
	}
	
	@Test
	void testOrden() {
		DecoratorNombre nombreD = new DecoratorNombre(file);
		DecoratorTamaño tamañoD = new DecoratorTamaño(nombreD);
		DecoratorPermisos permisosD = new DecoratorPermisos(tamañoD);
		
		assertEquals("usuario - 64.0 - archivito - ",permisosD.prettyPrint());
	}
}
