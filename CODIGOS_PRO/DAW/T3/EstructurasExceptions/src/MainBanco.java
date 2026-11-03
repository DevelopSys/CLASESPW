import controller.Banco;
import model.CuentaCorriente;
import utils.BancoException;

import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {
        Banco bbva = new Banco();
        Scanner scanner = new Scanner(System.in);
        bbva.darAltaCuenta(new CuentaCorriente("Borja", 1111, 1000));
        // nombre = null cuenta = null
        /*try {
            bbva.cancelarCuenta("Juan", 1234);
        } catch (Exception e) {
            System.out.println("La cuenta no se puede cancelar");
            System.out.println("Dime otro pin");
        }

         */
        // tienes 3 intentos para ingresar dinero

        int intentos = 3;
        do {
            try {
                System.out.println("Dime el titular");
                String titular = scanner.next();
                System.out.println("Dime el pin");
                int pin = scanner.nextInt();
                System.out.println("Dime el saldo");
                double saldo = scanner.nextInt();
                bbva.retirarSaldo(saldo, pin, titular);
                break;
            } catch (BancoException e) {
                System.out.println(e.getMessage());
                intentos--;
            }
        } while (intentos > 0);
        System.out.println("La cuenta tiene un saldo de "+bbva.getCuenta().getSaldo());
        // bbva.cancelarCuenta("asd", 123);


    }
}
