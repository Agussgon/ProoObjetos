package BebidaAbstractFactory.Factory;

import BebidaAbstractFactory.Bebida;
import BebidaAbstractFactory.BebidaComun;
import BebidaAbstractFactory.BebidaLight;

public class BebidaLeviteFactory extends BebidaFactory {

    @Override
    public Bebida factoryMethodComun() {
        return new BebidaComun("levite pomelo",500.0,500.0);
    }

    @Override
    public Bebida factoryMethodLight() {
        return new BebidaLight();
    }
}
