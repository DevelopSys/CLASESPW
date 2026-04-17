package controller;

import exception.CuentaException;
import exception.SaldoInsuficienteException;
import model.CuentaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private ArrayList<CuentaBancaria> cuentaBancarias;

    public Banco() {
        cuentaBancarias = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuentaBancaria) {


        if (buscarCuenta(cuentaBancaria.getId()) == null) {
            cuentaBancarias.add(cuentaBancaria);
        } else {
            throw new CuentaException("La cuenta ya existe en el banco");
        }
    }

    public int sacarDinero(int id, int saldo) {

        CuentaBancaria cuentaBancaria = buscarCuenta(id);

        if (cuentaBancaria == null) {
            throw new CuentaException("La cuenta no existe");
        } else {
            try {
                cuentaBancaria.sacarDinero(saldo);
                System.out.println("El saldo restante es " + cuentaBancaria.getSaldo());
                return cuentaBancaria.getSaldo();
            } catch (SaldoInsuficienteException e) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Indica el nuevo saldo, inferior a " + cuentaBancaria.getSaldo());
                int saldoParm = scanner.nextInt();
                sacarDinero(id, saldoParm);
            }
            return -1;

        }
    }

    public void ingresarDinero(int id, int saldo) {
        CuentaBancaria cuentaBancaria = buscarCuenta(id);
        if (cuentaBancaria != null) {
            try {
                cuentaBancaria.ingresarDinero(saldo);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } else {
            throw new CuentaException("Cuenta no encotrada");
        }
    }

    private CuentaBancaria buscarCuenta(int id) {
        return cuentaBancarias.stream()
                .filter(item -> item.getId() == id)
                .findFirst().orElse(null);
    }
}
