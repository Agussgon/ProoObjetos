package SistemaEmpleados;
import java.util.Objects;


public class Empleado {

    private String nombre;
    private String apellido;
    private String direccion;
    private Integer dni;
    private Double sueldo;

    public Empleado(String nombre, String apellido, String direccion, int dni, Double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    //identificador de 32 bits
    //String ya trae su hashcode
    @Override
    public int hashCode() {
        //salt
        int hash= 17;
        hash *= hash* nombre.hashCode() * apellido.hashCode() * this.dni;
        return hash;
       //otra forma  return Objects.hash(nombre,dni);

    }

    @Override
    public boolean equals(Object obj) {
       if(obj == null || !(obj instanceof Empleado) ||
       this.getClass() != obj.getClass())
       { return false;}
       else{

           Empleado empleado= (Empleado)obj ;
           int hashCode1= this.hashCode();
           int hashCode2=this.hashCode();
           System.out.println("hashCode del segundo elemento "+ hashCode2);
           Boolean result= hashCode1 == hashCode2 ; // hay riesgo de que dos objetos tengan el mismo hashcode
           //this.getDni() == empleado.getDni(); tendría que comparar los mismas propiedades
           // utilizadas en la creacion del hashcode
           return result && Objects.equals(this.getDni(), empleado.getDni());}
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni=" + dni +
                ", sueldo=" + sueldo +
                '}';
    }

    public void cobrarSueldo(Double sueldo){
        this.sueldo += sueldo;
        System.out.println("Cobro de $"+sueldo);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    // no recibiria parametro
    // podemos sobreescribir este metodo en las otras clases
    // para modificar el sueldo neto con los metodos descontar
    // y horas extras
}
