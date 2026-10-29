import javax.xml.transform.Source;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("Programa exceptions");
        // Scanner scanner = new Scanner(System.in);
        boolean fallo = false;
        int resultado = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el valor del op1");
            int op1 = scanner.nextInt();
            System.out.println("Introduce el valor del op2");
            int op2 = scanner.nextInt();
            // yo como programador decido es un error que los numeros sean negativos
            if (op1 < 0 || op2 < 0) {
                throw new Exception("Fallo, numeros muy grandes");
            } else if (op1 >100|| op2>100){
                throw new RuntimeException("Error en el codigo numerico");
            }
            resultado = op1 / op2;
            System.out.println("El resultado es " + resultado);
            // se ha cerrado
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Error en la lectura de los operandos o resultado");
            fallo = true;
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // boolean fallo = false;
        /*
        do {
            try {
                System.out.println("Introduce el primer numero");
                int op1 = scanner.nextInt();
                System.out.println("Introduce el segundo numero");
                int op2 = scanner.nextInt();
                resultado = op1 / op2;
                fallo = false;
            } catch (InputMismatchException e) {
                System.out.println("Algun dato de los introducidos no es correcto");
                fallo = true;
            } catch (ArithmeticException e) {
                fallo = true;
                System.out.println("El operando 2 no es valido");
            }
        } while (fallo);
        scanner.close();
        System.out.println("El resultado de la division es " + resultado);*/
        /*
        int resultado = 100000;
        String nombre = null;
        try {
            System.out.println("Indica un operando 1");
            int op1 = scanner.nextInt();
            System.out.println("Indica un operando 2");
            int op2 = scanner.nextInt();
            resultado = op1 / op2;
            System.out.println("El resultado es " + resultado);
            if (nombre == null) {
                nombre = "Luis";
                System.out.println(nombre.charAt(10));
            }

        } catch (ArithmeticException e) {
            System.out.println("El op2 ha producido fallo");
            resultado = 0;
        } catch (NullPointerException e) {
            System.out.println("Fallo en la variable nombre");
        } catch (Exception e) {
            System.out.println("Cualquier fallo que no sea de los anteriores");
        } finally {
            // cerrar streams
            System.out.println("El resultado es " + resultado);
        }
         */

        System.out.println("Ejecutamos el final del programa");
    }
}

