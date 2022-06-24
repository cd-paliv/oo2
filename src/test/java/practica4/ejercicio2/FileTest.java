package practica4.ejercicio2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

public class FileTest {

	public FileOO2 file;
	
	@BeforeEach
	void setUp() {
		file = new File("archivo", ".txt", "777", 64.0);
	}
	
	@Test
	void casoUnoTest() {
		FileOO2 extensionD = new DecoratorExtension(file); //al string le aplico el nombre
		FileOO2 nombreD = new DecoratorNombre(extensionD); //al string le aplico la extension
		//la cebolla queda: ( ( (file) extension) nombre)
		
		assertEquals("archivo - .txt", nombreD.prettyPrint());
	}
	
	//caso dos no lo puedo aplicar porque no quiero hacer el decorator para un LocalDate
	
	@Test
	void casoTresTest() {
		FileOO2 permisosD = new DecoratorPermisos(file);
		FileOO2 extensionD = new DecoratorExtension(permisosD); 
		FileOO2 nombreD = new DecoratorNombre(extensionD); 
		FileOO2 tamañoD = new DecoratorTamaño(nombreD);
		//la cebolla queda: ( ( ( ( (file) permisos) extension) nombre) tamaño)
		
		assertEquals("64.0 - archivo - .txt - 777", tamañoD.prettyPrint());
	}
}
