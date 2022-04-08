package practica1.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TweetTest {
    private Tweet t1;

    @Test
    public void crearTweetTest(){
        t1 = new Tweet("Hola Mundo");
        assertNotNull(t1);
    }
}
