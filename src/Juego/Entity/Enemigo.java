package Juego.Entity;

public abstract class Enemigo {

    private String nombre;
    private Integer puntos;

    private Double porcentajeVida=100.0;

    public Enemigo(String nombre, Integer puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public Enemigo() {
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                ", porcentajeVida=" + porcentajeVida +
                '}';
    }
}
