package practica6.ejercicio1C;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyAccessTest {
	public DatabaseProxyAccess database;

    void initialize() throws IOException{
        database = new DatabaseProxyAccess(new DatabaseRealAccess(), "hola123");
    }

    @BeforeEach
    void setUp() throws IOException{
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
