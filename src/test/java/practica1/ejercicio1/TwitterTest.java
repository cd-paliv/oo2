package practica1.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
    private Twitter TwSistema;
    private Usuario u1;
    private Usuario u2;
    
    @BeforeEach
    public void setUp(){
        TwSistema = new Twitter();
        u1 = TwSistema.crearUsuario("Rookie");
        u2 = TwSistema.crearUsuario("Mimi");
    }

    @Test
    public void crearUsuarioTest(){
        //Verificación de lista
        assertEquals(TwSistema.getUltimoUsuario(), u2);
        assertEquals(TwSistema.getCantidadUsuarios(), 2);

        //Usuario repetido
        assertNull(TwSistema.crearUsuario("Rookie"));

    }

    @Test
    public void eliminarUsuarioTest(){
        assertEquals(TwSistema.getCantidadUsuarios(), 2);

        //Eliminación de usuario y verificación en lista
        assertTrue(TwSistema.eliminaUsuario("Mimi"));
        assertEquals(TwSistema.getCantidadUsuarios(), 1);
        assertEquals(TwSistema.getUltimoUsuario(), u1);

        //eliminar usuario que no existe
        assertFalse(TwSistema.eliminaUsuario("Jorgito"));
    }
}
