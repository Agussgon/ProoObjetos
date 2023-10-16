import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia {


    private String nombre;
    private String apellido;
    private Integer DNI;
    private Integer matricula;

    private Integer calificacion;

    public Guia(String nombre, String apellido, Integer DNI, Integer matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.matricula = matricula;
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

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void ingresarCalificacion() {
        System.out.println("ingresar una calificación del 1 al 5 para evaluar el desempeño del guía");
        Scanner scanner=new Scanner(System.in);
        Integer calificacion= scanner.nextInt();
        if(calificacion >= 1 && calificacion <= 5  ){
        this.calificacion = calificacion;
            System.out.println("calificación ingresada "+ this.calificacion);
        }
        else{
            throw new InputMismatchException();
        }
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI=" + DNI +
                ", matricula=" + matricula +
                ", calificacion=" + calificacion +
                '}';
    }
}
