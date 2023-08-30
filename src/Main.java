import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //
    public static void main(String[] args) {

        //array
        Suscriptor[] suscriptores= new Suscriptor[2];

        //coleccion
        List<Suscriptor> suscriptoresColeccion= new ArrayList<>();

        Scanner escaner= new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            Suscriptor suscriptor= new Suscriptor();
            String suscriptor1= escaner.nextLine();
            String[] suscrRecibido= suscriptor1.split(",");
            String nombre = suscrRecibido[0];
            String direcc= suscrRecibido[1];
            //
            int telefono= Integer.parseInt(suscrRecibido[2]);
            //
            suscriptor.setNombre(nombre);
            suscriptor.setDireccion(direcc);
            suscriptor.setTelefono(telefono);
            //
            suscriptores[i]=suscriptor;

            //
            suscriptoresColeccion.add(suscriptor);

        }


      /*  suscriptores[0]= new Suscriptor("Juan","Carrillo 2020",1123393056);
        suscriptores[1]= new Suscriptor("Juana","Carrillo 2020",1123393057);
        //suscriptores[2]= new Suscriptor("No hay espacio","Carrillo 2020",1123393056);

        for (Suscriptor suscriptor: suscriptores) {
            System.out.println(suscriptor);

        }*/


        //coleccion

        for (int i = 0; i < suscriptoresColeccion.size(); i++) {
            System.out.println( suscriptoresColeccion.get(i));
        }

    }
}