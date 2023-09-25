import java.text.SimpleDateFormat;

public class Main {


    //
    public static void main(String[] args) {

        Instrumento guitarra= new GuitarraElectrica("cuerdas");

        ((GuitarraElectrica)guitarra).cambiarCuerdas();

        int numeroEntero=5;
        double numeroDecimal= 1.5;


        // casteo con datos primitivos

        int resultado = numeroEntero/ (int)numeroDecimal;

        double resultado2= (double)numeroEntero/ numeroDecimal;

        System.out.println(resultado + " "+ resultado2);

        // parseo
        System.out.println(String.valueOf(resultado));
        // esto es validado tanto para Double pero siempre transformando una cadena
        Integer.parseInt(String.valueOf(resultado));
        //SimpleDateFormat.getTimeInstance();

    }
}