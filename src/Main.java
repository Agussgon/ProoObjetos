import SistemaEmpleados.EmpleadoLavavajilla;
import SistemaEmpleados.EmpleadoLimpiezaGeneral;

public class Main {


    //
    public static void main(String[] args) {


        EmpleadoLimpiezaGeneral empleadoGeneral= new EmpleadoLimpiezaGeneral("Juan","Perez",
                "Carrillo",23456789,150000.0,"tarde");

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