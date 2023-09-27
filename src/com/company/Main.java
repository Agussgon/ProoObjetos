package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente1 = new Cliente(1, 12345, "Rivas");


        Cuenta cuentaComitente1= new CuentaComitente(cliente1,2000.0,"123" );
        cuentaComitente1.extraer(1000.0);

//CajaAhorro cajaAhorro1 = new CajaAhorro(cliente1, 2000.2, 10.00);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(cliente1,2000.0,600.0);

//System.out.println(cajaAhorro1.toString());
        //      cajaAhorro1.extraer(1000.0);
        cuentaCorriente1.extraer(2100.0);


    }
}
