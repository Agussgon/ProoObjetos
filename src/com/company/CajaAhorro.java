package com.company;

public class CajaAhorro extends Cuenta {

    private Double tasaInteres;

    public CajaAhorro(Cliente cliente, Double saldo, Double tasaInteres) {
        super(cliente, saldo);
        this.tasaInteres = tasaInteres;
    }


    @Override
    public void extraer(Double extraccion) {
        if(this.getSaldo() >= extraccion ){
            this.setSaldo(this.getSaldo() - extraccion)  ;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }


    @Override
    public String toString() {
        return super.toString()+
                "CajaAhorro{" +
                "tasaInteres=" + tasaInteres +
                '}';
    }

    public void cobrarIntereses(){
       this.setSaldo( this.getSaldo() + (this.getSaldo()*tasaInteres / 100));
    }

}
