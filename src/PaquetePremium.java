public class PaquetePremium extends Paquete {

    private Integer puntosAcumulados= 0;
    private String voucher;

    public PaquetePremium(Integer id, String titulo, String descripcion,
                          String transporte, Double precioBase, Integer dias,
                          Guia guia, String voucher) {
        super(id, titulo, descripcion, transporte, precioBase, dias, guia);
        this.voucher = voucher;
    }


    @Override
    public Double calcularPrecio() {
        Double totalAdicional= this.getExcursiones().size()*0.15*getPrecioBase() ;
        setValorAdicional(totalAdicional);
        return getPrecioBase() + getValorAdicional();
    }

    /* acumulación de puntos por excursión contratada*/
    @Override
    public void incorporarExcursion(String e) throws ExcursionRegistradaException {
        super.incorporarExcursion(e);
        setPuntosAcumulados(puntosAcumulados = getExcursiones().size());

    }

    @Override
    public void eliminarExcursion(String e) {
        super.eliminarExcursion(e);
        setPuntosAcumulados(puntosAcumulados = getExcursiones().size());
    }

    public Integer getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Integer puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }



}
