package Test.Entity;

import Juego.Entity.Juego;
import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JuegoTest2 {

    static Juego juego= new Juego();

    @BeforeAll
    static void cargarDatos(){
        juego.setNombre("Pacman");
        juego.setVersion(3);
    }


    @Tag("claseJuego")
    @Test
    void getNombre() {


        assertEquals("Pacman", juego.getNombre());

        assertFalse("Pacma" == juego.getNombre(), "verificamos que no sea el nombre");
    }


    @Test
    void setNombre() {

        assertNotNull(juego);
        assertTrue("Pacman" == juego.getNombre());


    }

    @Test
    void getVersion() {
    }

    @Tag("claseJuego")
    @Test
    void setVersion() {
        assertThrows( IllegalArgumentException.class, ()-> juego.setVersion(-1) );
    }


    @Test
    @Disabled
    void generarEnemigos() {
    }

    @AfterEach
    void cierre(){

        System.out.println(" termino un test");
    }

}
