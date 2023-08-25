import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        final int CONSTANTE = 10;

        Producto pelota= new Producto("pelota",2000,1000,20);
        System.out.println(pelota.gananciaObtenida());



        Sube tarjetaSube= new Sube(2344554);

        Sube.cambiarSaldoNegativo(-120);
        System.out.println(tarjetaSube.consultarSaldoNegativo());


    }

}

