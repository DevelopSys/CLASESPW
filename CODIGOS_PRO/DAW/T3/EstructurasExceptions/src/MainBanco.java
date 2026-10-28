import model.Banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {
        Banco bbva = new Banco();
        // nombre = null cuenta = null
        /*try {
            bbva.cancelarCuenta("Juan", 1234);
        } catch (Exception e) {
            System.out.println("La cuenta no se puede cancelar");
            System.out.println("Dime otro pin");
        }

         */
        try (Scanner scanner = new Scanner(System.in)) {
            String nombreTitular = scanner.next();
            int saldo = scanner.nextInt();
            System.out.println("El titular de la cuenta es " + nombreTitular);
            System.out.println("El saldo es: " + saldo);
            bbva.cancelarCuenta(nombreTitular,saldo);
            // cierra el reccurso utilizado en la definicion del bloque
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato introducido de forma incorrecta");
        } catch (Exception e){
            System.out.println("Error en la cancelacion de la cuentas");
        }



    }
}
