package model;

import exception.SaldoInsuficienteException;

public class CuentaBancaria {
    private int id, saldo;

    public CuentaBancaria(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    /*
    sacar dinero -> cuento quiero sacar
        error si intento sacar mas dinero del que tiengo
        error si intento sacar dinero en negativo
    ingresar dinero -> cuanto quiero ingresar
        error si intento meter dinero negativo
     */

    public boolean sacarDinero(int saldoRetirar) throws IllegalArgumentException, SaldoInsuficienteException {
        // saldo negativo
        if (saldoRetirar < 0) {
            throw new IllegalArgumentException("El saldo introducido no es positivo");
        } else if (saldoRetirar > saldo) {
            throw new SaldoInsuficienteException("El saldo introducido es demasiado, por favor igual o inferior a" + getSaldo());
        }
        saldo -= saldoRetirar;
        return true;
        // no hay saldo
    }

    public boolean ingresarDinero(int saldoIngresar) {
        // saldo negativo
        if (saldoIngresar <= 0) {
            throw new IllegalArgumentException("El saldo introducido debe ser superior a 0");
        }
        saldo += saldoIngresar;
        return true;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
