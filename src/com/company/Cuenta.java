package com.company;

public abstract class Cuenta {

private Cliente cliente;
private Double saldo;


public abstract void extraer(Double extraccion);

public void depositarEfectivo(Double ingreso){
    this.saldo += ingreso;
};

public void informarSaldo(){
    System.out.println("saldo disponible" + saldo);
}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(Cliente cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
}
