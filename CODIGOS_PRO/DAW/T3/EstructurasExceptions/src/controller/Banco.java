package controller;

import model.CuentaCorriente;
import utils.BancoException;

public class Banco {

    private String nombre;
    private CuentaCorriente cuenta;

    public Banco() {
    } // nombre -> null cuenta -> null

    public void darAltaCuenta(CuentaCorriente cuenta) {
        // cambias la cuenta existente?
        this.cuenta = cuenta;
    }

    public void retirarSaldo(double saldoRetirar, int pin, String tituar) throws BancoException {
        try {
            if (cuenta.getTitular().equalsIgnoreCase(tituar) && cuenta.getPin() == pin) {
                if (saldoRetirar > cuenta.getSaldo()) {
                    throw new BancoException("Saldo insuficiente");
                }
                cuenta.setSaldo(cuenta.getSaldo() - saldoRetirar);
                System.out.println("Ingreso valido");
            } else {
                throw new BancoException("Error de valiacion");
            }
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta asociada en el banco");
        }
    }

    public void ingresarDinero(double saldoIngresar, int pin, String titular) throws BancoException {
        try {
            if (cuenta.getTitular().equalsIgnoreCase(titular) && cuenta.getPin() == pin) {
                // ingresar dinero
                cuenta.setSaldo(cuenta.getSaldo() + saldoIngresar);
                System.out.println("Ingreso valido");
            } else {
                throw new BancoException("Validacion erronea");
            }
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta asociada en el banco");
        }
    }

    public void cancelarCuenta(String titular, int pin) throws NullPointerException {
        // para hacer esto cuenta = null
        // que tiene que pasar? ->
        /*if (cuenta != null && cuenta.getTitular().equals(titular) && cuenta.getPin() == pin ){
            System.out.println("Cuenta cancelada");
            cuenta = null;
        }
        try {
            if (cuenta.getTitular().equals(titular) && cuenta.getPin() == pin) {
                System.out.println("Cuenta cancelada");
                cuenta = null;
            }
        }catch (NullPointerException e){
            System.out.println("La cuenta no esta asociada a nadie, no se puede cancelar");
            System.out.println(e.getMessage());
        }*/


        if (cuenta.getTitular().equals(titular) && cuenta.getPin() == pin) {
            System.out.println("Cuenta cancelada");
            cuenta = null;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaCorriente getCuenta() {
        // validas algo de la cuenta???
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        // validas si ya hay cuenta???
        this.cuenta = cuenta;
    }
}
