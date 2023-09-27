public class Gato extends Animal implements Domesticable{

    private String raza;

    public Gato(String especie, Integer edad, String raza) {
        super(especie, edad);
        this.raza = raza;
    }

    @Override
    public void comer(String comida) {
        System.out.println("comiendo "+comida);
    }

    @Override
    public void domesticar() {
        System.out.println("Gato domesticado");
    }
}
