public abstract class Animal {


   private String especie;
    Integer edad;

    public Animal(String especie, Integer edad) {
        this.especie = especie;
        this.edad = edad;
    }

    public abstract void comer(String comida);

}
