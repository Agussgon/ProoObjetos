public class Perro extends Animal implements Domesticable{

    private String raza;

    public Perro(String especie, Integer edad, String raza) {
        super(especie, edad);
        this.raza = raza;
    }

    @Override
    public void comer(String comida) {
        System.out.println("comiendo "+comida);
    }

    @Override
    public void domesticar() {
        System.out.println("Perro domesticado");
    }
}
