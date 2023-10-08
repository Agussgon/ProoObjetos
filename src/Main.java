import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

/*
Crear una aplicación que almacene nombres de estudiantes
en una lista. Luego, permitir al usuario agregar nombres y
mostrar la lista de nombres almacenados.

Administrar una lista de tareas pendientes. Permitir al usuario agregar y eliminar tareas,
así como listar
todas las tareas pendientes.

 Utilizar una colección para almacenar los cursos con un código único como clave.
Sobrescribir los métodos `hashCode()` y `equals()` para que se utilicen
al buscar cursos por código utilizando el método `containsKey().
*/


        // list tareas el orden
        Estudiante estudiante1= new Estudiante(1,"Juan");
        estudiante1.agregarTarea("realizar 1° T.P");
        estudiante1.agregarTarea("realizar 1° T.P");
        estudiante1.agregarTarea("leer cap. I");

        // modificar el elemento de una determinada posición
        estudiante1.tareas.set(1,"leer cap II");

        System.out.println("cual es la primera tarea?"+ estudiante1.tareas.get(0));

        //podría utilizar for + tareas.size()
        for (String tarea: estudiante1.tareas
             ) {

            System.out.println( "el n° de orden es"+ estudiante1.tareas.indexOf(tarea)
                    + "la tarea es "+tarea);
        }


        System.out.println("------ ordenar listas ------");

        Collections.sort(estudiante1.tareas);
        System.out.println("tareas ordenadas alfabéticamente: " + estudiante1.tareas);

        // Ordenar la lista por longitud de cadenas directamente utilizando Arraylist
        estudiante1.tareas.sort(Comparator.comparingInt(String::length));
        System.out.println("Lista ordenada por longitud: " + estudiante1.tareas);

        //con Collections  inicializando Comparator
        Collections.sort(estudiante1.tareas, new Comparator<String>() {
            @Override
            public int compare(String tarea1, String tarea2) {
                return Integer.compare(tarea1.length(),tarea2.length()) ;
            }
        });
        System.out.println("Lista ordenada por longitud Collections: " + estudiante1.tareas);



        System.out.println("----- SET-------");

        Curso curso1= new Curso(1,"Programación I");
        curso1.agregarEstudiante(estudiante1);
        curso1.agregarEstudiante(estudiante1); // "agrego" estudiante repetido
        curso1.agregarEstudiante(new Estudiante(2,"Eva"));



        // recorriendo la lista de estudiantes (set)
        Iterator it= curso1.estudiantes.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        for (Estudiante estudiante: curso1.estudiantes
             ) {
            System.out.println("recorriendo set con foreach "+estudiante);
        }


        curso1.buscarEstudiante(estudiante1); // implementa iterator + casteo

        System.out.println("--- ordenar una coleccion de tipo set -----");

        //crear una lista en la cual guardar el resultado
        List<Estudiante> listaEstudiantesOrdenada = new ArrayList<>(curso1.estudiantes);

        //Comparator<Estudiante> comparadorNombre = Comparator.comparing(Estudiante::getNombre);

        //ordenarlo
        Collections.sort(listaEstudiantesOrdenada,Comparator.comparing(Estudiante::getNombre));

        // Convertir la lista ordenada a LinkedHashSet que mantiene el orden de inserción
        Set<Estudiante> estudiantesOrdenados = new LinkedHashSet<>(listaEstudiantesOrdenada);

                for (Estudiante estudiante : estudiantesOrdenados) {
                    System.out.println(estudiante);
                }


        System.out.println("------ MAP-------");

        Map<Integer,Curso> cursos= new HashMap<>();
        Curso curso2= new Curso(2,"cursoII");
        Curso curso3= new Curso(3,"cursoIII");
        cursos.put(curso1.id,curso1);
        cursos.put(curso3.id,curso3);
        cursos.put(curso2.id,curso2);
        System.out.println("contiene algun curso con clave 1 ? "+cursos.containsKey(1));
        System.out.println("trae el curso con la clave indicada "+cursos.get(1));

        // retornando claves de la coleccion
        System.out.println("keyset "+ cursos.keySet());


        // no guarda los elementos en el orden de inserción
        for (Curso curso:cursos.values()
             ) {
            System.out.println("recorriendo map con foreach "+ curso);

        }


        System.out.println("otra forma en la cual recorremos clave y valor con el método entry");
        for (Map.Entry<Integer, Curso> entry : cursos.entrySet()) {
            Integer clave = entry.getKey();
            Curso valor = entry.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }


        System.out.println("--- ordenar una coleccion de tipo map -----");

        // Copiar los elementos a una lista, objeto de tipo Map.Entry
        List<Map.Entry<Integer,Curso>> listaCursos = new ArrayList<>(cursos.entrySet());

        // Ordenar la lista por valores de forma personalizada
        Collections.sort(listaCursos, new Comparator<Map.Entry<Integer, Curso>>() {
            @Override
            public int compare(Map.Entry<Integer, Curso> o1, Map.Entry<Integer, Curso> o2) {
                //return Integer.compare(o1.getKey(),o2.getKey());
                return Integer.compare(o1.getValue().nombre.length(), o2.getValue().nombre.length());
                //  return o1.getValue().getNombre().compareTo(o2.getValue().getNombre());
            }
        });


        // Construir un nuevo Map ordenado
        Map < Integer, Curso > mapaOrdenado = new LinkedHashMap<>();
        // linked mantiene el orden asignado
        for (Map.Entry<Integer,Curso> elemento : listaCursos) {
            mapaOrdenado.put(elemento.getKey(), elemento.getValue());
        }

        System.out.println("Mapa ordenado por la longitud del nombre: " + mapaOrdenado);



    }
}