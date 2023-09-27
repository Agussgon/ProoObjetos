public class Main {


    //
    public static void main(String[] args) {

    Animal animal= new Perro("perro",2,"Caniche");

    animal.comer("carne");

    //  casteo para implementar el metodo de la interfaz
        ((Domesticable)animal).domesticar();

      // polimorfismo

      animal= new Gato("gato",1,"Siames");

        ((Domesticable)animal).domesticar();

       // prueba defininiendo solo la interfaz

       Domesticable domestico= new Perro("perro",3,"Labrador");
       domestico.domesticar();
        ((Perro)domestico).comer("galletitas");





}
}