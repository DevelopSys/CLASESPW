import controller.Banco;
import exceptions.CuentaNotFoundException;
import exceptions.SaldoException;
import model.Calculadora;
import model.CuentaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i);
        }

        switch (1){
            case 1:
                break;
            case 2:
                break;
        }

        switch (2){
            case 1->{
                break;
            }
        }

        System.out.println("Bievenidos a la app para ejecutar pruebas");
        // Calculadora calculadora = new Calculadora();
        // System.out.println(calculadora.sumar(5,8));
        // System.out.println(calculadora.resta(5,8));
        // System.out.println(calculadora.multi(5,8));
        // System.out.println(calculadora.division(5,0));
        Scanner scanner = new Scanner(System.in);
        boolean fallo = false;
        Banco banco = new Banco();
        CuentaBancaria cuentaBancaria = new CuentaBancaria(1, 900);

        banco.agregarCuenta(cuentaBancaria);

        do {
            int nCuenta = scanner.nextInt();
            int saldo = scanner.nextInt();
            try {
                banco.sacarDinero(nCuenta,saldo);
                System.out.println("El saldo resultante es " + cuentaBancaria.getSaldo());
                fallo = false;
            } catch (CuentaNotFoundException e) {
                System.out.println("Dime otro id, este no esta en el banco");
                fallo = true;
            } catch (SaldoException e) {
                System.out.println("Dime otro saldo, demasiado saldo");
                fallo = true;
            }
        } while (fallo);

        System.out.println("Saliendo del banco");

    }
}
