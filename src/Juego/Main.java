package Juego;

import Juego.Entity.Enemigo;
import Juego.Entity.Juego;
import Juego.Exception.NivelInvalidoException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

public class Main {


    //
    public static void main(String[] args) throws NivelInvalidoException {

        // repaso de las != formas de crear colecciones

        //interfaz

        Set<String> hashset = new HashSet<>();

        List<Double> lista = new ArrayList<>();

        //clase

        HashSet hash = new HashSet<>();

        hash.add("hola");

        System.out.println(hash);

        //


        Juego juego = new Juego();
        Scanner scaner = new Scanner(System.in);

        String continuar = "";
        // juego.generarEnemigos(null);

        System.out.println("Iniciar la carga de enemigos?");
        continuar = scaner.nextLine();
        //  scaner.nextLine();
        System.out.println(continuar);

        /*  */
        while (continuar.equalsIgnoreCase("si")) {
            System.out.println("ingrese su nivel");
            Integer nivel = scaner.nextInt();
            scaner.nextLine();
            try {
                Enemigo enemigo = juego.generarEnemigos(nivel);
                System.out.println(enemigo);
            } catch (NivelInvalidoException e) {
                System.err.println(e.getMessage());
            } finally {
                System.out.println("continua?");
                continuar = scaner.nextLine();
                System.out.println(continuar);


            }


        }
        ;

    }


}