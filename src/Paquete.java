import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Paquete implements Comparable<Paquete> {

    private Integer id;
    private String titulo;
    private String descripcion;
    private String  transporte;
    private Double precioBase;
    private Double valorAdicional;
    private Integer dias;
    private Guia guia;
    private Set<String> excursiones= new HashSet<>();


    public Paquete(Integer id, String titulo, String descripcion, String transporte, Double precioBase, Integer dias, Guia guia) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.transporte = transporte;
        this.precioBase = precioBase;
        this.dias = dias;
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", transporte='" + transporte + '\'' +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", dias=" + dias +
                ", guia=" + guia +
                ", excursiones=" + excursiones +
                '}';
    }

    public void mostrarInformación(){
        this.toString();
    }

    @Override
    public int hashCode() {
        int hash= 11;
        return hash*31* titulo.hashCode() * descripcion.hashCode();
    }

    @Override
    public int compareTo(Paquete o) {
        Integer cantidadExc=this.excursiones.size();
        if(this.dias > o.dias && cantidadExc > o.excursiones.size() )
        {return 1;}
        else if (this.dias.equals(o.dias) && cantidadExc.equals(o.excursiones.size()))
        {return 0;}
        else{ return -1;}
    }

    @Override
    public boolean equals(Object obj) {
        return id.equals(((Paquete)obj).id) ;
    }



    public abstract Double calcularPrecio();

    /**/

 public void incorporarExcursion(String e) throws ExcursionRegistradaException{
        try{
        if(excursiones.contains(e)){
           throw new ExcursionRegistradaException("ERROR La excursión ya se encuentra registrada"); //System.out.println("ya se encuentra registrada");
        }
        // set no agrega elementos repetidos por lo cual no sería necesaria la excepción
        excursiones.add(e);}
        catch(ExcursionRegistradaException ex){
            System.err.println(ex.getMessage());
        }
    }

   /*    public void incorporarExcursion(String e) throws ExcursionRegistradaException{
            if(excursiones.contains(e)){
                throw new ExcursionRegistradaException("ERROR La excursión ya se encuentra registrada"); //System.out.println("ya se encuentra registrada");
            }
            // set no agrega elementos repetidos por lo cual no sería necesaria la excepción
            excursiones.add(e);}

*/

    public void eliminarExcursion(String e){
        if(excursiones.contains(e)){
          excursiones.remove(e);
        }else{
            System.err.println("La excursión que intenta eliminar no existe ");
        }

    }
    public void buscarExcursion(String e){
       if(excursiones.contains(e)){
           System.out.println("La excursión solicitada está incluida en el paquete");

       }else{
           System.out.println("La excursión no está incluida");
       }
    }




    /**/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public Set<String> getExcursiones() {
        return excursiones;
    }

    public Integer getId() {
        return id;
    }
}
