public class Sube {

    private int numero;
    static private Double saldoNegativo;

    public Sube(int numero) {
        this.numero = numero;
    }
    static public void cambiarSaldoNegativo(double saldo){
        saldoNegativo = saldo;
    }
    public Double consultarSaldoNegativo(){
        return saldoNegativo;
    }
}
