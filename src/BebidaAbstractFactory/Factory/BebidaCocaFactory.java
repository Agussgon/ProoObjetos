package BebidaAbstractFactory.Factory;


import BebidaAbstractFactory.Bebida;
import BebidaAbstractFactory.BebidaComun;
import BebidaAbstractFactory.BebidaLight;

public class BebidaCocaFactory extends BebidaFactory {

    @Override
    public Bebida factoryMethodComun() {
        return new BebidaComun("coca",500.0,600.0);

    }

    @Override
    public Bebida factoryMethodLight() {
        return new BebidaLight();
    }
}
