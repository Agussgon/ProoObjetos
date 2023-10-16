import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {


    //
    public static void main(String[] args) throws ExcursionRegistradaException {

        Guia guia1 = new Guia("Juan", "Perez", 27893384, 23456);

        Paquete barilocheSimple = new PaqueteSimple(1, "Bariloche", "simple", "avión", 150000.0, 5, guia1, false);
        Paquete barilochePremium = new PaquetePremium(2, "Bariloche",
                "premium", "avión", 230000.0, 7, guia1, "Descuento en tu próximo viaje");
        Paquete barilocheSimple2 = new PaqueteSimple(3, "Bariloche", "simple", "avión", 150000.0, 5, guia1, true);

        /*Puede ser de tipo list también*/

        Map<Integer, Paquete> paquetesDisponibles = new HashMap();
        paquetesDisponibles.put(barilocheSimple.getId(), barilocheSimple);
        paquetesDisponibles.put(barilochePremium.getId(), barilochePremium);
        paquetesDisponibles.put(barilocheSimple2.getId(), barilocheSimple2);


        /*ingresar calificación del guía*/
        try{
            guia1.ingresarCalificacion();
        }
        catch(InputMismatchException e){System.err.println("ingrese un valor válido "); }


        /* El sistema debe permitir visualizar la información de todos
        los paquetes disponibles y buscarlos.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el código del paquete solicitado");

        Integer id = scanner.nextInt();
        //capturamos el bloque que puede lanzar error
        try {
            if (!paquetesDisponibles.containsKey(id)) {
                throw new IndexOutOfBoundsException("paquete no encontrado");
            }
           else {
                Paquete paquete = paquetesDisponibles.get(id);
                    System.out.println("paquete encontrado " + paquete);
                }

        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        /*Agregar, eliminar y buscar excursiones*/

      // try {
           barilocheSimple.incorporarExcursion("Cerro Catedral");
           barilochePremium.incorporarExcursion("Cerro Catedral");
           barilocheSimple2.incorporarExcursion("Cerro Catedral");
           barilocheSimple.incorporarExcursion("Cerro Catedral");

       /*}catch (ExcursionRegistradaException e){
           System.err.println(e.getMessage());
           System.out.println(paquetesDisponibles.values());
       }*/


        /*Modificación de puntos acumulados*/
        System.out.println("puntos acumulados antes de eliminar la excursión del paquete premium " +
                ((PaquetePremium) barilochePremium).getPuntosAcumulados());

        barilochePremium.eliminarExcursion("Cerro Catedral");
        barilochePremium.eliminarExcursion("Cerro Catedral");

        System.out.println("puntos acumulados " +
                ((PaquetePremium) barilochePremium).getPuntosAcumulados());

        barilocheSimple.buscarExcursion("Cerro Catedral");


        /*El sistema debe permitir calcular el precio total de cada paquete.*/


        System.out.println("------ calculando precio de los paquetes-------");
        System.out.println("paquete simple sin descuento " + barilocheSimple.calcularPrecio());

        System.out.println("paquete premium " + barilochePremium.calcularPrecio());
        System.out.println("paquete simple con descuento " + barilocheSimple2.calcularPrecio());


        /*comparar paquetes*/
        System.out.println("comparación de paquetes " + barilocheSimple.compareTo(barilocheSimple2));


        /*mostrar información */

        for (Paquete paquete : paquetesDisponibles.values()
        ) {
            paquete.mostrarInformación();

        }


        //scanner.close();
        //





    }

}
