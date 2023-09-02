package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Dueño {
    private String nombre;
    private String direccion;
    private String telefono ;

    private List<Mascota> mascotas;
    private List<Veterinario> veterinarios;

    public Dueño(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascotas = new ArrayList<Mascota>();
        this.veterinarios = new ArrayList<Veterinario>();
    }

    public Dueño(String nombre, String direccion, String telefono, List<Mascota> mascotas, List<Veterinario> veterinarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascotas = mascotas;
        this.veterinarios = veterinarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    @Override
    public String toString() {
        return "Dueño{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                "mascota " + mascotas + '}' ;
    }

    public void registrarMascota(Mascota mascota1){

        mascotas.add(mascota1);
        System.out.println(mascota1.toString());

    }



}
