package model;

public class CuentaCorriente {

    // atributos
    private String titular;
    private int pin;
    private double saldo;

    // constructores -> 1 por defecto
    // titular = null pin = 0 saldo = 0.0
    public CuentaCorriente(){}
    public CuentaCorriente(String titular, int pin, int saldo){
        this.saldo = saldo;
        this.titular = titular;
        this.pin = pin;
    }
    public CuentaCorriente(String titular, int pin){
        this.pin = pin;
        this.titular = titular;
    }
    public CuentaCorriente(String titular){
        this.pin = (int) (Math.random() *10000); // 0 -9999
        this.titular = titular;
    }

    public boolean verificarUsuario(int pin){
        return this.pin == pin;
    }

    // metodos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
