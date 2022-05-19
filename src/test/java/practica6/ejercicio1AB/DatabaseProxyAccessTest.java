package practica6.ejercicio1AB;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;

public class DatabaseProxyAccessTest {

	public DatabaseProxyAccess database;

    void initialize(){
        database = new DatabaseProxyAccess(new DatabaseRealAccess(), "hola123");
    }

    @BeforeEach
    void setUp(){
        this.initialize();
    }

    @Test
    void testException(){
        assertThrows(RuntimeException.class, () -> {
            database.getSearchResults("select * from comics where id=1");
        });
    }

    @Test
    void testSearchResults(){
        database.autenticar("hola123");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), database.getSearchResults("select * from comics where id=4"));
    }

    @Test
    void testNewRow(){
        database.autenticar("hola123");
        assertEquals(3, database.insertNewRow(Arrays.asList("Flash","DC Comics")));
        assertEquals(Arrays.asList("Flash","DC Comics"),database.getSearchResults("select * from comics where id=3"));
    }
}
