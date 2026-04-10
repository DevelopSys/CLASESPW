package controller;

import model.CuentaBancaria;

import java.util.ArrayList;

public class Banco {
    private ArrayList<CuentaBancaria> cuentas;
    public Banco(){
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuentaBancaria){
        this.cuentas.add(cuentaBancaria);
    }

    public boolean sacarDinero(int id, int saldo){
        CuentaBancaria cuentaBancaria
                = cuentas.stream()
                .filter(cuenta -> cuenta.getId() == id)
                .findFirst().orElse(null);

        if(cuentaBancaria != null){
            if (cuentaBancaria.getSaldo()<saldo){
                return false;
            }
            cuentaBancaria.sacarDinero(saldo);
            return true;
        }

        return false;
    }


}
