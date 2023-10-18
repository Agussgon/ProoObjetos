import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    //
    public static void main(String[] args) {

/*
* Escribe un programa que solicite dos números al usuario e intente dividir el primer número por el segundo.
* Utiliza un bloque `try-catch` para manejar la excepción `ArithmeticException` que ocurre si el segundo número
* es igual a cero. Muestra un mensaje de error apropiado en caso de división por cero. */


        Scanner scanner= new Scanner(System.in);

        try{

            System.out.println("ingrese dos numeros enteros: primero el dividendo y luego el divisor");
            Integer num1= scanner.nextInt();
            Integer divisor= scanner.nextInt();

            /*if(divisor.equals(0)){
                throw new ArithmeticException("No se puede dividir por cero" );  esto no es necesario  */

            System.out.println(num1/divisor);
            } catch (ArithmeticException a){System.err.println("Error no se puede dividir por cero");}
              catch (InputMismatchException a){System.err.println("Error ingrese un n° válido ");}

            finally{
            System.out.println("finalizo el ejemplo 1");
            scanner.nextLine();
        }

        /*

Escribe un programa que solicite al usuario ingresar un número como una cadena y luego intente convertir esa cadena
* a un número entero. Utiliza un bloque `try-catch` para manejar la excepción `NumberFormatException` que ocurre
* si el usuario ingresa una cadena que no es un número válido. Muestra un mensaje de error en caso de que la
* conversión falle.    */


        try {
            System.out.print("Ingrese un número en formato texto: ");
            String texto = scanner.nextLine();
            Integer numero = Integer.parseInt(texto);

            System.out.println("Número: " + numero);

        } catch (NumberFormatException e) {
            System.err.println("El parámetro no es un número válido.");
        }



        /*Crea una clase `Alumno` con propiedades como nombre y apellido. Luego, crea un `ArrayList` lista de
        alumnos que no se repitan. Escribe un programa que permita al usuario buscar un alumno por su nombre. Utiliza un bloque
* `try-catch` para manejar la excepción `NoSuchElementException`  que ocurre si el alumno no se encuentra en la
* lista. Muestra un mensaje apropiado en caso de que no se encuentre el alumno.
La clase Alumno debe contener una lista de calificaciones sobre la cual puede calcular el promedio e ingresar
* las notas en orden. Es importante poder manejar las excepciones que puedan llegar a presentarse al momento de
* ingresar las notas de forma personalizada .
El sistema debe poder determinar si un alumno ya ha sido registrado al momento de ingresarlo.*/

        Alumno alumno= new Alumno("Juan","Perez");

        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {

            try {


                System.out.print("Ingresa una calificación: ");
                Double nota = scanner.nextDouble();
                alumno.agregarCalificacion(nota);

                System.out.print("¿Continuar con la carga (s/n)? ");
                continuar = scanner.next().charAt(0);

            } catch (InputMismatchException e) {
                System.err.println("Error: Ingrese un número válido.");
                scanner.nextLine(); // Limpiar el búfer de entrada
            } finally {
                for (Double calificacion : alumno.getCalificaciones()
                ) {
                    System.out.println(calificacion);
                }

            }
         }
        }








    }
