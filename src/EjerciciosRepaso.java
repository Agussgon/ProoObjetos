import java.util.Date;
import java.util.Scanner;

public class EjerciciosRepaso {

    public static void main(String[] args) {
        

        Scanner scanner= new Scanner(System.in);

        compararCadenasTexto();

        listaPeliculasDisponibles();

        System.out.println("Ingresa el año, el mes y el día de nacimiento ");
        int anio= scanner.nextInt() - 1900;
        int mes= scanner.nextInt() - 1;
        int dia= scanner.nextInt();
        //
        calcularEdadMilisegundos(anio,mes,dia);
        //




    }




    public static void listaPeliculasDisponibles(){
        String[] peliculas = new String[4];
        peliculas[0]="Rocky I";
        peliculas[2]="Rocky II";
        peliculas[3]="Rocky III";

        for (String peli: peliculas) {
            System.out.println(peli);}

    }

    public static void calcularEdadMilisegundos(int anio,int mes, int dia ){
        Date fechaNacimiento= new Date( anio,mes,dia);
        Date fechaActual= new Date();
        Long diferenciaMilisegundos=  fechaActual.getTime() - fechaNacimiento.getTime();
        System.out.println(diferenciaMilisegundos);


    }
    // comparar cadenas de texto, guardar las peliculas ingresadas en un array y contar la cantidad de vocales de la primer cadena

    public static void compararCadenasTexto(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa dos cadenas de texto que cada uno contenga dos peliculas separadas por una coma");
        String cadenaUno = scanner.nextLine();
        String cadenaDos = scanner.nextLine();
        //
        // System.out.println(cadenaUno.equals(cadenaDos));

        if(cadenaUno.compareTo(cadenaDos) > 0){
            System.out.println(cadenaUno + " es más grande tiene " + cadenaUno.length()+ " caracteres");
        }else if(cadenaUno.compareTo(cadenaDos) == 0)
        {  System.out.println(" son iguales ");}
        else{ System.out.println(cadenaDos + " es más grande ");};


        //
        String[] cadenaUnoSplit= cadenaUno.split(",");
        String[] cadenaDosSplit= cadenaDos.split(",");
        String[] cadenaDePelis= new String[4];

        cadenaDePelis[0]= cadenaUnoSplit[0];
        cadenaDePelis[1]= cadenaUnoSplit[1];
        cadenaDePelis[2]= cadenaDosSplit[0];
        cadenaDePelis[3]= cadenaDosSplit[1];

        for (int i = 0; i < cadenaDePelis.length; i++) {
            System.out.println(cadenaDePelis[i]);
        }

        //
        int contador= 0;
        int vocales=0 ;
        while(contador < cadenaUno.length()){

            char caracter=cadenaUno.toLowerCase().charAt(contador);
            if( caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o'
                    || caracter == 'u' ){
                vocales ++;
                System.out.println(vocales);

            }
            vocales ++;
            contador++;
        }

    }





}
