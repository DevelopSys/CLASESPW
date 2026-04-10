package model;

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

    public void sacarDinero(int saldo){
        if(saldo<=0){
            throw new IllegalArgumentException("no se puede sacar en negativo");
        } else if(saldo>this.saldo){
            throw new IllegalArgumentException("no cuentas con saldo suficiente");
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
