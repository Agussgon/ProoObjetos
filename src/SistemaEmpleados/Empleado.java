package SistemaEmpleados;

public class Empleado {

    private String nombre;
    private String apellido;
    private String direccion;
    private int dni;
    private Double sueldo;

    public Empleado(String nombre, String apellido, String direccion, int dni, Double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public void cobrarSueldo(Double sueldo){
        this.sueldo += sueldo;
        System.out.println("Cobro de $"+sueldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
