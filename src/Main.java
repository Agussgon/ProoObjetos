import java.util.*;

public class Main {

    public static void main(String[] args) {

        //5
        listarLibros();


        //4
        esDivisible(20,15);

           //2
        /*Crea un programa que reciba dos números enteros que representen edades
        y determina cuál es mayor, cuál es menor o si son iguales. Imprimí/mostrar el resultado obtenido.*/

        mostrarIniciales();

        compararEdades();

            /*   Define dos objetos de tipo "Fecha"
         y comprueba si son iguales o diferentes.Debe imprimir
         un mensaje que indique el resultado. * */
        Date fecha1= new Date(120,2,30);
        Date fecha2= new Date(130,1,2);

        System.out.println(fecha1.equals(fecha2));
        if(fecha1 == fecha2){
            System.out.println("son iguales");}
        else{
                System.out.println("son distintos");
            };
        // compare to -1 si es mayor la segunda , 0 si son iguales y 1 si la primera es más grande
        System.out.println(fecha1.compareTo(fecha2));

      /* */ String frase1= "hola";

      frase1.charAt(0);

        String frase2= "h";
        // da la diferencia de caracteres
        System.out.println(frase1.compareTo(frase2));




        /*   Crea un programa que solicite al usuario
         que ingrese su nombre y apellido por separado.
         Debe imprimir sus iniciales. */

    }

    // otros metodos

    public static void compararEdades( ){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese dos edades separadas por coma");
        String numeros= scanner.nextLine();
        String[] numerosSeparados = numeros.split(",");

        Integer numeroParseado= Integer.parseInt(numerosSeparados[0]);
        Integer numero2Parseado= Integer.parseInt(numerosSeparados[1]);

        if(numeroParseado > numero2Parseado){
            System.out.println("El primer n° ingresado es mayor");
        } else if(numeroParseado.equals(numero2Parseado) ){System.out.println("Son iguales");}
        else {System.out.println("El segundo n° ingresado es mayor");}

    }

    public static void mostrarIniciales() {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();

        char inicialNombre = nombre.charAt(0);

        System.out.println("Tus iniciales son " + inicialNombre + " y " + apellido.charAt(0));


    }

        /*Crea una función que reciba desde el metodo main dos números como parámetros
         y devuelva un valor booleano. La función debe comprobar si
        el primer número es divisible por el segundo.*/
    public static Boolean esDivisible(int numero1, int numero2 ){
        Boolean resultado= numero1 % numero2 == 0;

        System.out.println(resultado);
        return resultado ;

    }

    /*   Crea un programa que reciba títulos de libros hasta que el usuario decida y los liste(mostar). */
    public static void listarLibros(){

        List<String> titulosLibros = new ArrayList<>();

        Scanner scanner= new Scanner(System.in);

       // int contador= 0;
        Boolean continua= true;

        do{
        System.out.println("Ingrese el titulo de un libro");
        String titulo = scanner.nextLine();
        titulosLibros.add(titulo);
            System.out.println("¿Quiere continuar agregando titulos? si o no");
            String respuesta= scanner.nextLine();

            if( respuesta.toLowerCase().equals("si"))
            { continua = true;  }
            else{ continua = false; }
        }
        while( continua== true ); ;


        // listarlos con for each
      for( String libro: titulosLibros){
          System.out.println(libro.toString());
      }

        //

        for (int i = 0; i < titulosLibros.size(); i++) {
            System.out.println(titulosLibros.get(i));

        }


    }






}