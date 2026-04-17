package controller;

import exceptions.CuentaNotFoundException;
import exceptions.SaldoException;
import model.CuentaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private ArrayList<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuentaBancaria) {
        // todo cuenta no duplicada en id
        this.cuentas.add(cuentaBancaria);
    }

    public boolean sacarDinero(int id, int saldo) throws CuentaNotFoundException, SaldoException {
        CuentaBancaria cuentaBancaria
                = cuentas.stream()
                .filter(cuenta -> cuenta.getId() == id)
                .findFirst().orElse(null);

        if (cuentaBancaria != null) {

            cuentaBancaria.sacarDinero(saldo);
            return true;


        } else {
            throw new CuentaNotFoundException("Cuenta no enctrada");
        }
        
    }


}
