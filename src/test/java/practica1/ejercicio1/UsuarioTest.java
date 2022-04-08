package practica1.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class UsuarioTest {
    //private Twitter TwSistema;
    private Usuario u1;
    private Usuario u2;
    
    @BeforeEach
    public void setUp(){
        //TwSistema = new Twitter();
        u1 = new Usuario("Rookie");
        u2 = new Usuario("Mimi");
    }

    @Test
    public void publicarTweetYRTTest(){
        assertEquals(u1.getCantidadTweets(), 0);
        u1.PublicarTweet("Tw On"); //JAJA
        Tweet t = new Tweet("Este se cree que no me doy cuenta de las cosas?? *emoji revoleando los ojos*");
        u1.PublicarTweet(t);
        assertNotNull(u1.PublicarTweet("Tw Off"));
        assertEquals(u1.getCantidadTweets(), 3);
        
        assertEquals(u2.getCantidadTweets(), 0);
        u2.Retweetear(t);
        assertEquals(u2.getCantidadTweets(), 1);
    }
}
