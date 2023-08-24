public class Animal {


   private String especie;
    Integer edad;

    public Animal(String especie, Integer edad) {
        this.especie = especie;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.especie +" "+ this.edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
