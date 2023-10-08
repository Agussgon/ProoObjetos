import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class repasoArrays {


    public static void main(String[] args) {
        // Array estático unidimensional
        Object[] arrayObjetos= new Object[3];
        arrayObjetos[0]= "hola";

        // arrayList<> datos genericos List
        List<String> listaNombres2 = new ArrayList<>();
        listaNombres2.add("Juan");
        listaNombres2.set(0,"Flor");
        listaNombres2.remove(0); // Posición

        // Vector tamaño dinamico , sincronizacion incorporada

        Vector <String> palabras= new Vector<>();
        palabras.add("uno");
        palabras.set(0,"dos"); // este metodo es distinto
        palabras.get(0); //
        palabras.remove(0);


        // matrices
        int[][] matriz = new int[2][5]; // dos filas y cinco columnas
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][4] = 30;
        matriz[1][0] = 40;
        matriz[1][3] = 50;

        // filas
        for (int i = 0; i < matriz.length; i++) {
            // indico que recorra las columnas
            for (int col = 0; col < matriz[0].length; col++) {
                int elemento = matriz[i][col]; System.out.print(elemento + " ");
                System.out.println();
            }
        }


        //matriz dinamica
        ArrayList<ArrayList<Integer>> matrizList = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> fila1 = new ArrayList<>();
        fila1.add(1);
        fila1.add(2);

        matrizList.add(fila1);

        ArrayList<Integer> fila2 = new ArrayList<>();
        fila2.add(3);
        fila2.add(4);
        matrizList.add(fila2);

        int elemento = matrizList.get(0).get(1);
        int elemento2 = matrizList.get(1).get(0);

        System.out.println(elemento + " " + elemento2);


    }


}
