public abstract class Instrumento {

    String tipo;
    public Instrumento(String tipo) {
        this.tipo = tipo;
    }
    public abstract void tocar();
    public abstract String tocar(String dinamica);

    public void mostrarTipo(){
        System.out.println(tipo);
    }
}
