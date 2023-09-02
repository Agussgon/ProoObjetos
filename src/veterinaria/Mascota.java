package veterinaria;

public class Mascota {

 private String nombre;
 private String especie;

 private Integer edad;

 private Double peso;

    public Mascota(String nombre, String especie, Integer edad, Double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                '}';
    }

    // metodo que usara el veterinario
    public void actualizarInformacion(Integer edadActualizada,Double pesoActualizado ){
        this.edad= edadActualizada;
        this.peso = pesoActualizado;
    }
}
