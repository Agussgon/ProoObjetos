import java.util.Scanner;

public class EjercicioResueltoClase4 {

    /*
   Programa que solicita 4 peliculas y las guarda en un array

  1-El método debe retornar la más grande.
  2-Debe generar un array de cuatro elementos.
  3-Debe guardar las cuatro películas en el array e imprimirlas por consola.


   */
    public static void main(String[] args) {
     calcularMasGrande();

    }

    public static void  calcularMasGrande(){
        Scanner escaner= new Scanner(System.in);
        //System.out.println("Ingrese dos cadenas de dos peliculas separadas por coma ");
        String[] peliculas= new String[4];


        String masGrande="";


        for (int i = 0; i <= 3 ; i++) {
            System.out.println("Ingresa una pelicula");
            String pelicula= escaner.nextLine() ;
            peliculas[i]= pelicula;


            System.out.println(peliculas[i]);


            if(pelicula.length() > masGrande.length()){
                masGrande=pelicula;
            }
        }

        System.out.println("La pelicula más grande es" +masGrande);

    }

}
