package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;

    private int cuit;

    private String apellidoNombre;

    private List<Cuenta> cuentasAsociadas= new ArrayList<>();

    public Cliente(int id, int cuit, String apellidoNombre) {
        this.id = id;
        this.cuit = cuit;
        this.apellidoNombre = apellidoNombre;
        this.cuentasAsociadas = cuentasAsociadas;
    }

    public void listarCuentasAsociadas(){

        for (Cuenta cuenta: cuentasAsociadas
             ) { // incompleto
            System.out.println(cuenta);
        }

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", cuit=" + cuit +
                ", apellidoNombre='" + apellidoNombre + '\'' +
                ", cuentasAsociadas=" + cuentasAsociadas +
                '}';
    }
}
