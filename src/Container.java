public class Container {
    Integer id;
    String pais;
    Boolean peligroso;


    public Container(Integer id) {
        this.id = id;
    }

    public Container(Integer id, String pais, Boolean peligroso) {
        this.id = id;
        this.pais = pais;
        this.peligroso = peligroso;
        if(pais.equals(null)){
            setPeligroso(true);
        }
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", pais='" + pais + '\'' +
                ", peligroso=" + peligroso +
                '}';
    }


    @Override
    public int hashCode() {
       int hash= 7;
       return hash * 37 * pais.hashCode() * id;

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Container)) {
            System.out.println("ingrese datos válidos");
            return false;
        } else
           // return this.id == ((Container) obj).getId();
          return this.id.equals(((Container) obj).getId());
        }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {

        this.pais = pais;
    }

    public Boolean getPeligroso() {
        return peligroso;
    }

    public void setPeligroso(Boolean peligroso) {
        this.peligroso = peligroso;
    }


}
