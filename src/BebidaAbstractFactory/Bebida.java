package BebidaAbstractFactory;

public abstract class Bebida {


    String nombre;
    Double tamanio;
    Double precio;


    public Bebida(String nombre, Double tamanio, Double precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    public Bebida() {

    }

    @Override
    public String toString() {
        return "BebidaAbstractFactory.Bebida{" +
                "nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                '}';
    }
}
