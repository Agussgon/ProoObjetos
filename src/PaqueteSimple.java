public class PaqueteSimple extends Paquete {


    private Boolean codigoDescuento;

    public PaqueteSimple(Integer id, String titulo, String descripcion, String transporte, Double precioBase, Integer dias, Guia guia, Boolean codigoDescuento) {
        super(id, titulo, descripcion, transporte, precioBase, dias, guia);
        this.codigoDescuento = codigoDescuento;
    }


    /*descuento del 25 % sobre el precio base*/
    public void aplicarDescuento(){
        if (codigoDescuento){
            setPrecioBase(getPrecioBase() - getPrecioBase()*0.25);
        }

    }

    @Override
    public Double calcularPrecio() {
        Double totalAdicional= this.getExcursiones().size()*0.10*getPrecioBase() ;
        setValorAdicional(totalAdicional);
        aplicarDescuento();
        return getPrecioBase() + getValorAdicional();
    }

    public Boolean getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(Boolean codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }
}
