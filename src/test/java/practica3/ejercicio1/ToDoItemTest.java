package practica3.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ToDoItemTest {
	private ToDoItem tdi;
    //private LocalDate i, f;

    @BeforeEach
    public void setUp(){
        this.tdi = new ToDoItem("Jorgito");
        //this.i = LocalDate.now();

    }

    @Test
    public void testTDI(){
        assertEquals(tdi.getNombre(), "Jorgito");
        assertEquals(tdi.getNombreEstado(), "Pending");

        tdi.start(); assertEquals(tdi.getNombreEstado(), "InProgress");
        tdi.togglePause(); assertEquals(tdi.getNombreEstado(), "Paused");

        tdi.togglePause(); assertEquals(tdi.getNombreEstado(), "InProgress");

        tdi.finish(); assertEquals(tdi.getNombreEstado(), "Finished");

        //assert del RuntimeException
        boolean thrown = false;
        try{
            tdi.togglePause();
        } catch (Exception e){
            thrown = true;
        }
        assertTrue(thrown);

        //assertEquals(tdi.workedTime(), Duration.between(i, f));
    }
}
