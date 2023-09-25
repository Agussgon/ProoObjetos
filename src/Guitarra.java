public class Guitarra extends Instrumento{
    public Guitarra(String tipo) {
        super(tipo);
    }
    @Override
    public void tocar() {
        System.out.println("tocar la guitarra");
    }

    @Override
    public String tocar(String dinamica) {
        return "tocar "+dinamica;
    }

    public void cambiarCuerdas(){

        System.out.println("cambio de cuerdas");
    }



}
