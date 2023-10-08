import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Curso implements Comparable<Curso>{
    Integer id;
    String nombre;
    Set <Estudiante> estudiantes= new HashSet<>();
    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public void quitarEstudiante(Estudiante estudiante){

        if(!(estudiantes.contains(estudiante))){
            System.out.println("estudiante inexistente");
        }else{
            estudiantes.remove(estudiante);
        }
    }
    public void agregarEstudiante(Estudiante estudiante){

        if(!(estudiantes.contains(estudiante))){
            estudiantes.add(estudiante); }
      /*  else{
            System.out.println("estudiante registrado anteriormente");
        }*/
    }

    public Boolean buscarEstudiante(Estudiante buscar){
        Boolean encontrado=false;
        Estudiante estudianteBuscado;
        Iterator iterator= estudiantes.iterator();
        while(iterator.hasNext() &&  encontrado == false){
             estudianteBuscado=(Estudiante)iterator.next(); // casteo
            if(estudianteBuscado.equals(buscar)){
                estudianteBuscado=buscar;
                System.out.println("figura en la lista el estudiante"+ estudianteBuscado);
                encontrado=true;}
            }
            return encontrado;
/*
        // se puede utilizar directamente el contains ...
        if (estudiantes.contains(buscar)){
            System.out.println(buscar.nombre);
            return true;
        }else
            return false;*/
    }



    @Override
    public int hashCode() {
        int hash= 13;
        return hash*17*nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        else if(! (obj instanceof Curso)) {
            return false; }
        else {
            return this.id.equals(((Curso)obj).id);
        }

    }

    @Override
    public int compareTo(Curso o) {

       if(id.equals(o.id)){
        return 0;}
       else if(id > o.id){return 1; }
       else{ return -1; }
    }

    // getClass().getName() + '@' + Integer.toHexString(hashCode())
    @Override
    public String toString() {
        return "curso "+ nombre + " id "+ id;
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
