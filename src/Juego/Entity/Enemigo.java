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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        if(puntos <= 0){ throw new IllegalArgumentException(); }
       else{ this.puntos = puntos;}
    }

    public Double getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(Double porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    public void restarVida(String cuanto){


        if (cuanto.equals(null)){ throw new IllegalArgumentException(); }
        else if(cuanto.equals("poco") || cuanto.equals("poco2") )
        { this.setPorcentajeVida(this.getPorcentajeVida()-20.0); }
        else if(cuanto.equals("bastante") )
        { this.setPorcentajeVida(this.getPorcentajeVida()-40.0); }
        else if(cuanto.equals("mucho")){
            this.setPorcentajeVida(this.getPorcentajeVida()-80.0);
        }
    }


}
