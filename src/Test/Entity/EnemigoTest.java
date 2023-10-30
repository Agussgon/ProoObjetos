package Test.Entity;

import Juego.Entity.Enemigo;
import Juego.Entity.EnemigoDificil;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
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


    @Tag("unica")
    @Test
    void modificarPuntos(){
        assertTrue(enemigo.getPuntos()== 200, "¿Inicia con 200 puntos?");
    }


    @Tag("unica")
    // otra validación
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 5 / 0; // Esto debería lanzar una ArithmeticException
        });
    }


    @Test
    void setPuntosInvalidos() {


        assertThrows(IllegalArgumentException.class ,()-> enemigo.setPuntos(0));
    }


    // detecta el tipo de dato
    @ParameterizedTest
    @ValueSource(strings = {"poco","poco2"})
    void restarVida(String danio){


        enemigo.restarVida(danio);


        assertEquals(80.0,enemigo.getPorcentajeVida());
    }




    @AfterEach
    void cierreTest(){


        System.out.println(enemigo.toString());
    }



}