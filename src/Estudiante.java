import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    Integer id;
    String nombre;

    List<String> tareas= new ArrayList<>();

    public Estudiante(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // agregar y quitar tareas

    public void quitarTarea(String tarea){
        if(!(tareas.contains(tarea))){
            System.out.println("tarea inexistente");
        }else{

            tareas.remove(tarea);

        }


    }

    public void agregarTarea(String tarea){
        if(!(tareas.contains(tarea))){
        tareas.add(tarea); }
        else{
            System.out.println("tarea registrada anteriormente");
        }
    }
    /*
    “La estructura interna de `HashSet` utiliza una tabla de dispersión (hash table) para
     almacenar elementos y realizar búsquedas eficientes. Cuando agregas un elemento a un `HashSet`,
     se calcula su valor hash utilizando el método `hashCode()`. Luego, se utiliza este valor hash
     para determinar en qué "cubo" o "bucket" de la tabla de dispersión debe almacenarse el elemento.


       */

    @Override
    public int hashCode() {
        int hash= 13;
        return hash*17*nombre.hashCode() ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        else if(! (obj instanceof Estudiante)) {
        return false; }
        else {
             return this.id.equals(((Estudiante)obj).id);
                }
        }

    @Override
    public String toString() {
        return "nombre "+ nombre + " id "+ id ;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
