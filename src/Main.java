import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {


    //
    public static void main(String[] args) {


        System.out.println("Veamos cuantos argumentos recibe el método main " + args.length);
        for(String argumento:args){
            System.out.println("Argumento "+ " " +argumento + " " );
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento " + (i + 1) + ": " + args[i]);
        }


        System.out.println("Continuamos modificando el .java");


        //format date
        LocalDateTime fecha = LocalDateTime.now() ;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = fecha.format(dtf);
        System.out.println("Fecha formateada: " + fechaFormateada);

    }
}