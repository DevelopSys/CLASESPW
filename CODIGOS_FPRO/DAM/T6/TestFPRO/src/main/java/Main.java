import controller.Banco;
import exception.CuentaException;
import model.Calculadora;
import model.CuentaBancaria;

import java.net.CacheRequest;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la app de testing");
        /*
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(55,8));
        System.out.println(calculadora.restar(55,8));
        System.out.println(calculadora.multiplico(5,7));
        System.out.println(calculadora.divido(4,0));
         */

        Banco banco = new Banco();
        banco.agregarCuenta(new CuentaBancaria(1, 1000));
        Scanner scanner = new Scanner(System.in);
        boolean fallo = false;
        do {
            try {
                System.out.println("Indica el id de la cuenta a sacar dinero");
                int id = scanner.nextInt();
                System.out.println("Indica saldo a sacar");
                int saldo = scanner.nextInt();
                banco.sacarDinero(id, saldo);
                fallo = false;
            } catch (CuentaException e) {
                fallo = true;
                System.out.println(e.getMessage());
            }
        } while (fallo);

    }
}
