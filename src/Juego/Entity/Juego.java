package Juego.Entity;

import Juego.Exception.NivelInvalidoException;
import Juego.Factory.EnemigoAleatorioFactory;
import Juego.Factory.EnemigoDificilFactory;
import Juego.Factory.EnemigoFactory;

public class Juego {


    public Enemigo generarEnemigos(Integer nivel) throws NivelInvalidoException {
    if(nivel == null){ throw new NullPointerException();}
        else if(nivel < 5 && nivel > 0){
        EnemigoFactory enemigoFactory= new EnemigoAleatorioFactory();
        return enemigoFactory.crearEnemigo();
    }
    else if(nivel > 5){
        EnemigoFactory enemigoFactory= new EnemigoDificilFactory();
        return enemigoFactory.crearEnemigo();
    }
    else{ throw new NivelInvalidoException("Nivel inexistente");
    }

    }

}