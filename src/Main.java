import SistemaEmpleados.EmpleadoLavavajilla;
import SistemaEmpleados.EmpleadoLimpiezaGeneral;

public class Main {


    //
    public static void main(String[] args) {


        EmpleadoLimpiezaGeneral empleadoGeneral= new EmpleadoLimpiezaGeneral("Juan","Perez",
                "Carrillo",23456789,150000.0,"tarde");


        //
        System.out.println( "HashCode " + empleadoGeneral.hashCode());

        //
        System.out.println( "Comparar mismo empleado con equals usando el hashcode"
                +empleadoGeneral.equals(empleadoGeneral));



        EmpleadoLimpiezaGeneral.actualizarValorHoraExtra(3000.0);

        EmpleadoLavavajilla empleado2= new EmpleadoLavavajilla("Lucio","Perez",
                "Carrillo",23456788,150000.0,"mañana");

        EmpleadoLavavajilla.setCostoVajilla(700.0);

        empleado2.mostrarInformacion();
        empleado2.setVajillaRota(2);
        empleado2.descontarSueldo();
        empleado2.mostrarSueldo();





    }
}