package controller;

import model.CuentaCorriente;
import utils.BancoException;

public class Banco {
    // direccion, nombre, numeroEntidad, caja
    // lista de cuentas (usuario, dinero, pin)
    private CuentaCorriente cuenta;
    private String nombre;

    // constructores
    public Banco() {
    }

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    // funcionalidades -> darAltaCuenta, ingresarDinero, sacarDinero, consultarSaldo, resetearPin, tranferirSaldo

    public void cancelarCuenta(int pin, String titular) throws BancoException {
        try {

            if (cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)) {
                System.out.println("Procedemos a eliminar la cuenta");
                cuenta = null;
            } else {
                throw new BancoException("Fallo de validacion");
            }

        } catch (NullPointerException e){
            System.out.println("No se puede cancelar, no hay cuenta");
        }
    }

    public void darAltaCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
        System.out.println("Cuenta dada de alta correctamente");
    }

    public void ingresarDinero(double saldoIngreso, int pin, String titular) throws RuntimeException, BancoException {
        // puedo ingresar el dinero -> coinciden el pin y el titular con lo que me dan -> ingresa

        if (cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)) {
            cuenta.setSaldo(cuenta.getSaldo() + saldoIngreso);
            System.out.println("Ingreso correcto");
        } else {
            // error
            throw new BancoException("Error en los datos");
        }


    }

    public void retirarDinero(double saldoRetiro, int pin, String titular) throws BancoException, NullPointerException {
        if (cuenta.getTitular().equalsIgnoreCase(titular) && cuenta.getPin() == pin) {
            if (saldoRetiro > cuenta.getSaldo()) {
                throw new BancoException("Saldo insuficiente");
            }
            System.out.println("Procedemos a retirar el saldo");
            cuenta.setSaldo(cuenta.getSaldo() - saldoRetiro);
        } else {
            throw new BancoException("Error de validacion");
        }
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
