package SistemaEmpleados;

public class EmpleadoLavavajilla extends EmpleadoLimpieza {

    private int vajillaRota;
    static private Double costoVajilla;

    public EmpleadoLavavajilla(String nombre, String apellido, String direccion, int dni, Double sueldo, String turno) {
        super(nombre, apellido, direccion, dni, sueldo, turno);

    }

    public static void setCostoVajilla(Double costoVajilla) {
        EmpleadoLavavajilla.costoVajilla = costoVajilla;
    }

    public int getVajillaRota() {
        return vajillaRota;
    }

    public void setVajillaRota(int vajillaRota) {
        this.vajillaRota = vajillaRota;
    }

    public void descontarSueldo(){

        if (vajillaRota >= 2){

            this.setSueldo(this.getSueldo() - costoVajilla );
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Su turno es "+ this.turno + "y lo podemos ver sin necesidad de utilizar un getter");

    }
}
