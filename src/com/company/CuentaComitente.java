package com.company;

import java.util.Scanner;

public class CuentaComitente extends Cuenta{
    private String CNV;

    /*
    Este tipo de cuenta al depositar se quedan con un 1% de la comisión con lo cual solo nos
    depositara el 99% del monto (no interesa a dónde irá ese 1%).
    Por otro lado, solo se puede extraer hasta el 50% en una operación, a excepción de que
    al momento de extraer se indique la clave de validación.

    * */

    public CuentaComitente(Cliente cliente, Double saldo, String CNV) {
        super(cliente, saldo);
        this.CNV = CNV;
    }

    @Override
    public void depositarEfectivo(Double ingreso) {
       if (ingreso > 0 ){
        this.setSaldo( this.getSaldo() - (this.getSaldo() * 0.01));

           System.out.println(this.getSaldo());
       }else {
           System.out.println(" ingrese un monto válido");
       }
    }

    @Override
    public void extraer(Double extraccion) {

        if(extraccion > this.getSaldo() ){
            System.out.println("saldo insuficiente");
        }
        else{
            System.out.println("ingrese su clave CNV , cas contrario solo podrá extraer el 50% del monto solicitado");
        Scanner scaner= new Scanner(System.in);
        String claveIngresada= scaner.nextLine();
        if(CNV.equals(claveIngresada)) {
            this.setSaldo(this.getSaldo() - extraccion);
            System.out.println( "la clave coincide se extrae el total" + this.getSaldo());
        }
        else{
            if (this.getSaldo()*0.5 >= extraccion){
                setSaldo(this.getSaldo()-extraccion);
            System.out.println("se extrae el 50% solicitado el saldo disponible es "+  this.getSaldo());}
            else {
                System.out.println("fondos insuficientes");
            }

        }
        }
    }


    public String getCNV() {
        return CNV;
    }

    public void setCNV(String CNV) {
        this.CNV = CNV;
    }
}
