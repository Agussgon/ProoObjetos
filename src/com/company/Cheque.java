package com.company;

import java.util.Date;

public class Cheque {

    private Double monto;
    private String banco;
    private Date fechaPago ;

    public Cheque(Double monto, String banco, Date fechaPago) {
        this.monto = monto;
        this.banco = banco;
        this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}
