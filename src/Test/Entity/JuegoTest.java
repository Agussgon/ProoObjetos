package Test.Entity;


import Juego.Entity.Juego;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class JuegoTest {

    static Juego juego= new Juego();
    @BeforeAll
    static void estoOcurreAntesdeLaEjecuciondLasPruebas(){
        juego.setNombre("Pacman");
        juego.setVersion(3);


        LocalDate date = LocalDate.now()  ;
        System.out.println( "esto ocurre antes " + date);
    }

   /* @BeforeEach
    void antesDeCadaPrueba(){}*/

    @Test
    void pruebaJuegoNombre(){

        assertEquals("Pacman",juego.getNombre());

    }

    @Test
    void pruebaJuegoVersion(){

        assertTrue(2== juego.getVersion(), "Corroborar si la version es la 2");


    }

    @BeforeEach
    void mensajedecierre(){

        System.out.println("termino un test");
    }


}
