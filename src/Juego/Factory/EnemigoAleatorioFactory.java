package Juego.Factory;

import Juego.Entity.Enemigo;
import Juego.Entity.EnemigoDificil;
import Juego.Entity.EnemigoDos;
import Juego.Entity.EnemigoUno;

public class EnemigoAleatorioFactory implements EnemigoFactory {

    @Override
    public Enemigo crearEnemigo() {
        double numAleatorio = Math.random();
        if(numAleatorio < 0.33){
            return new EnemigoUno();
        }else if ((numAleatorio > 0.33 && numAleatorio < 0.80)){
        return new EnemigoDos();}
        else{
            return new EnemigoDificil();
        }
    }


}
