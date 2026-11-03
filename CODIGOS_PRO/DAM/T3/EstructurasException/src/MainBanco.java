import controller.Banco;
import model.CuentaCorriente;
import utils.BancoException;

import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Banco bbva = new Banco("BBVA");
        String titular;
        int pin;
        double saldo;
        int opcion;
        do {
            scanner = new Scanner(System.in);
            System.out.println("1. Dar alta cuenta");
            System.out.println("2. Ingresar dinero en cuenta");
            System.out.println("3. Sacar dinero en cuenta");
            System.out.println("4. Mostrar dinero en cuenta");
            System.out.println("5. Salir");
            System.out.println("Indica que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indica el titular");
                    titular = scanner.next();
                    System.out.println("Indica el saldo");
                    saldo = scanner.nextDouble();
                    System.out.println("Indica el pin");
                    pin = scanner.nextInt();
                    bbva.darAltaCuenta(new CuentaCorriente(titular, saldo, pin));
                }
                case 2 -> {
                    int intentos = 3;

                    do {
                        try {
                            System.out.println("Indica el titular");
                            titular = scanner.next();
                            System.out.println("Indica el saldo a ingresar");
                            saldo = scanner.nextDouble();
                            System.out.println("Indica el pin");
                            pin = scanner.nextInt();
                            bbva.ingresarDinero(saldo, pin, titular);
                            intentos = 0;
                        } catch (BancoException e) {
                            System.out.println(e.getMessage());
                            intentos--;
                        } catch (NullPointerException e) {
                            System.out.println("No hay cuenta en el banco");
                            intentos = 0;
                        }
                    } while (intentos > 0);

                }
                case 3 -> {
                    System.out.println("Indica el titular");
                    titular = scanner.next();
                    System.out.println("Indica el saldo a sacar");
                    saldo = scanner.nextDouble();
                    System.out.println("Indica el pin");
                    pin = scanner.nextInt();
                    try {
                        bbva.retirarDinero(saldo, pin, titular);
                    } catch (NullPointerException e) {
                        System.out.println("Error, cuenta nula");
                    } catch (BancoException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    try {

                        System.out.println("El saldo de la cuenta es de " + bbva.getCuenta().getSaldo());
                    } catch (NullPointerException e) {
                        System.out.println("No hay cuenta en el banco");
                    }
                }
            }

        } while (opcion != 5);

        /*bbva.darAltaCuenta(new CuentaCorriente("Borja", 1000, 1111));
        try {
            // bbva.ingresarDinero(1000, 1111, "Borja");
            // bbva.retirarDinero(1500, 1111, "Borja");
            // bbva.retirarDinero(501, 1111, "Borja");
            bbva.cancelarCuenta(0111,"Borja");
        } catch (NullPointerException e) {
            System.out.println("Cuenta nula");
        } catch (BancoException e) {
            System.out.println(e.getMessage());
        }*/
        // nombre = bbva cuentaCorriente = null
        /*CuentaCorriente c1 = new CuentaCorriente("Borja",1000,1111);
        CuentaCorriente c2 = new CuentaCorriente("Maria",500);
        CuentaCorriente c4 = new CuentaCorriente("Pepe");
        CuentaCorriente c3 = new CuentaCorriente();*/
        // bbva.darAltaCuenta(new CuentaCorriente("Borja", 1000,1111));
        // cuenta ["Borja",1000,1111]
        // bbva.darAltaCuenta(new CuentaCorriente("Maria"));
        // cuenta ["Maria",0,1245]
        // bbva.darAltaCuenta(new CuentaCorriente("Pepe"));
        // cuenta ["Pepe",0,1245]
    }
}
