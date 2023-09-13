package SistemaEmpleados;

public class EmpleadoLimpieza extends Empleado {



    //ejemplo de un nuevo tipo de visualización
    protected String turno;



    public EmpleadoLimpieza(String nombre, String apellido, String direccion, int dni, Double sueldo, String turno) {
        super(nombre, apellido, direccion, dni, sueldo);
        this.turno = turno;
    }

    public void trabajar(){
        System.out.println("Trabaja en el turno "+turno);
    }
    public void mostrarInformacion(){
        System.out.println(
                "su nombre es"+ this.getNombre()+" "+this.getApellido()
                +" su DNI es"+ this.getDni()
        );
    }

    public void mostrarSueldo(){
        System.out.println("su sueldo es de $"+ this.getSueldo());
    }

    /*
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

     */
}
