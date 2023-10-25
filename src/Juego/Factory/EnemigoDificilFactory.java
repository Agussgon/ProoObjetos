package Juego.Factory;

import Juego.Entity.Enemigo;
import Juego.Entity.EnemigoDificil;

public class EnemigoDificilFactory implements EnemigoFactory{

    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoDificil();
    }
}
