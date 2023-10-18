import java.util.ArrayList;
import java.util.InputMismatchException;

public class Alumno {

    private String nombre;
    private String apellido;
    private ArrayList<Double> calificaciones;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(Double calificacion) {
        if(calificacion <= 0 || calificacion > 10){
            throw new InputMismatchException("ingrese una nota válida");
        }
        calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        Double total = 0.0;

        for (double calificacion : calificaciones) {
           total += calificacion;
        }

        return total / calificaciones.size();
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
