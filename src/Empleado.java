public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;

    // Constructor vacío
    /*public Empleado() {

    }*/

    public abstract double calcularSueldo(int dias);


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el atributo 'apellido'
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getter y Setter para el atributo 'legajo'
    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}

