package practica1.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.*;
//import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.*;

public class bBibliotecaTest {
    private Biblioteca b;
    private Socio s1;
    private Socio s2;

    @BeforeEach
    public void setUp(){
        b = new Biblioteca();
        s1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        s2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
        b.agregarSocio(this.s1);
        b.agregarSocio(this.s2);
    }

    @Test
    public void socioTest(){
        //me guardo los distintos socios en el string en un array
        Object jObj = JSONValue.parse(b.exportarSocios());
        JSONArray jArray = (JSONArray) jObj;
        
        //JSONArray prueba = (JSONArray) new JSONParser().parse(b.exportarSocios());

        //comparo el nombre de los elementos del JSON (o sea del String exportado) con los socios que añadí a la biblioteca
        JSONObject socioJSON = (JSONObject) jArray.get(0);
        assertEquals(socioJSON.get("nombre"), this.s1.getNombre()); //comparo el nombre del primer elemento del JSON con el 1er socio que añadí a la biblioteca
        assertEquals(socioJSON.get("legajo"), this.s1.getLegajo());
        assertEquals(socioJSON.get("email"), this.s1.getEmail());

        socioJSON = (JSONObject) jArray.get(1);
        assertEquals(socioJSON.get("nombre"), this.s2.getNombre()); //ídem anterior pero con el socio 2
    }
}
