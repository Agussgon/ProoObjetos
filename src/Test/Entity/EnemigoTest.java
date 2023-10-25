package Test.Entity;

import Juego.Entity.Enemigo;
import Juego.Entity.EnemigoDificil;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnemigoTest {

    static Enemigo enemigo;
    @BeforeEach
    void crearEnemigoDificil(){

        System.out.println("comienza el test");
       enemigo = new EnemigoDificil();
       enemigo.setNombre("EnemigoUno");
       enemigo.setPuntos(200);
        System.out.println(enemigo);

    }

    @Test
    void consultarNombre(){

        assertNotNull(enemigo);

        assertEquals("EnemigoUno" , enemigo.getNombre());

    }

    @Test
    void modificarPuntos(){

        assertTrue(enemigo.getPuntos()== 200, "¿Inicia con 200 puntos?");

    }

    @AfterEach
       void cierreTest(){

        System.out.println(enemigo.toString());
    }




}