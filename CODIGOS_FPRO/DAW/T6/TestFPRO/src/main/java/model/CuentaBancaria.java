package model;

import exceptions.SaldoException;

public class CuentaBancaria {

    private int saldo;
    private int id;
    public CuentaBancaria(int id, int saldo){
        this.saldo = saldo;
        this.id = id;
    }

    public void ingresarDinero(int saldo){
        if(saldo<=0){
            throw new IllegalArgumentException("no se puede ingresar en negativo");
        }
        this.saldo += saldo;
    }

    public void sacarDinero(int saldo) throws SaldoException{
        if(saldo>getSaldo()){
            throw new SaldoException("No hay saldo suficiente");
        }
        this.saldo -= saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
