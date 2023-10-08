import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* En clases que utilizan la interfaz map si intento guardar un elemento con la misma clave lo sobreescribe*/



        Map <Integer,Container> listaContainer= new HashMap<>();
        Scanner scanner=  new Scanner(System.in);

        String continuar="si";

        while(continuar.equals("si")){
            System.out.println("ingrese un número identificador");
            Integer idIngresado= scanner.nextInt();
            scanner.nextLine();

            if(!(listaContainer.containsKey(idIngresado))){
                Container contenedor1= new Container(idIngresado);
                System.out.println("ingrese el país de origen");
             // Cuando utilizas next() para leer una cadena, este método solo captura la cadena
            // hasta el primer espacio en blanco o salto de línea, lo que significa que no captura la línea completa.
            String paisIngresado= scanner.nextLine().trim();

          /* System.out.println("probando nextBoolean");
           Boolean peligrosoONo = scanner.nextBoolean();

            scanner.nextLine();*/
            System.out.println("responda si el material que transporta es peligroso: si o no");
            String esPeligroso=scanner.nextLine().trim();
            Boolean respuestaPeligroso= esPeligroso.equals("si");
           // scanner.nextLine();

                contenedor1.setPais(paisIngresado.toLowerCase());
                if (paisIngresado.equals("")|| paisIngresado == null  ){
                    contenedor1.setPeligroso(true);}
                else{ contenedor1.setPeligroso(respuestaPeligroso);}
                // System.out.println(contenedor1);
                listaContainer.put(idIngresado,contenedor1);
            }
            else{ System.out.println("id registrado ");
                scanner.nextLine();}

            System.out.println("continuar la carga: si o no");
            String continuaSiNo= scanner.nextLine().trim();
            continuar=continuaSiNo.toLowerCase();
        };

        // mostrar los contenedores
        Iterator it= listaContainer.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("traer pais con id 1 " + listaContainer.get(1));

        // contar la cantidad de contenedores peligrosos por origen desconocido o etiqueta.
        Integer inicial= 0;
        for (Container cont: listaContainer.values()) {
            //
            if( cont.getPais().equals("") || cont.peligroso.equals(true) ){
               inicial += 1;

            }
        }
        System.out.println("Se registran un total de " + inicial + " contenedores peligrosos");

        // Para ordenarlos se podría implementar el método compareTo en cada uno dentro de un for o
        // usar Comparator de acuerdo al número que los identifica ( esto en map viene por defecto en base a la
        //clave igualmente los ordenaremos por pais ...

        List<Map.Entry<Integer,Container>> listaOrdenadaPais= new ArrayList<>(listaContainer.entrySet());
        Collections.sort(listaOrdenadaPais, new Comparator<Map.Entry<Integer, Container>>() {
            @Override
            public int compare(Map.Entry<Integer, Container> o1, Map.Entry<Integer, Container> o2) {
                return o1.getValue().getPais().compareTo(o2.getValue().getPais());
            }
        });

         Map < Integer, Container > ordenadosPaises = new LinkedHashMap<>();

        for (Map.Entry<Integer,Container> contenedor : listaOrdenadaPais) {
            ordenadosPaises.put(contenedor.getKey(), contenedor.getValue());
        }

        System.out.println("contenedores ordenados por país" + ordenadosPaises);























    }
}