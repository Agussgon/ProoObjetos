package BebidaAbstractFactory;

import BebidaAbstractFactory.Factory.BebidaCocaFactory;
import BebidaAbstractFactory.Factory.BebidaFactory;
import BebidaAbstractFactory.Factory.BebidaLeviteFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BebidaFactory factory= new BebidaCocaFactory();

        BebidaFactory factoryLevite= new BebidaLeviteFactory();

        Bebida cocaComun= factory.factoryMethodComun();

        Bebida leviteComun=factoryLevite.factoryMethodComun();

        Bebida cocaLight= factory.factoryMethodLight();


        System.out.println(cocaComun);
        System.out.println(leviteComun);
        System.out.println(cocaLight);




    }
}