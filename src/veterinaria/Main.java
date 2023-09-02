package veterinaria;

public class Main {

    public static void main(String[] args) {

        Mascota perro= new Mascota("Dobby","perro",3,20.1);
        Mascota gato= new Mascota("Manchas","gato",2,5.0);



        Dueño juan= new Dueño("Juan","Carrillo","112234");

        juan.registrarMascota(perro);
        juan.registrarMascota(gato);

        System.out.println(juan.toString());





    }
}
