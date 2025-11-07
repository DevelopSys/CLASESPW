import java.util.Scanner;

public class EstructuraSwitch {

    public void estructuraTradicional() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota");
        int nota = scanner.nextInt();
        // si la nota es >5 // sino si la nota es <7
        String nombre = "asdasdasd";
        switch (nota) {

            case 1:
                nombre = "asdasd";
                System.out.println("La nota vale 1, has suspendido con honores");
                break;

            case 5:
                nombre = "asdasdasd";
                System.out.println("Has aprobado raspado");
                break;

            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;

            case 10:
                System.out.println("Lo has cuadrado! Perfecto");
                break;
            default:
                System.out.println("Esta nota no es analizable");
                break;

        }

        System.out.println("Terminando de analizar notas");
    }

    public void estructuraLambda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        String nombre = scanner.next();
        String apellido = "";
        // Borja
        switch (nombre.toUpperCase()) {
            case "borja" -> {
                System.out.println("Nombre introducido borja");
                apellido = "asd";
            }
            case "maria" -> {
                System.out.println("Nombre introducido maria");
                apellido = "asd";
            }
            case "juan" -> {
                System.out.println("Nombre introducido juan");
                apellido = "asd";
            }
            case "marcos" -> {
                System.out.println("Nombre introducido marcos");
                apellido = "asd";
            }
            default -> {
                System.out.println("Nombre introducido no contemplado");
                apellido = "asd";
            }
        }
        System.out.println(apellido);
    }

    public void estructuraChar() {
        // es vocal o consonante
        char letra = 'g';
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("es vocal");
                break;
            default:
                System.out.println("Consonante");

        }
    }

    public void menuOpciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor selecciona la opcion a realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Modulo");
        System.out.println("6 - Salir");
        System.out.println("Que quieres hacer");
        int opcion = scanner.nextInt();
        int operando1 = 0, operando2 = 0;
        if (opcion >= 1 && opcion < 6) {
            System.out.println("Introduce operando 1");
            operando1 = scanner.nextInt();
            System.out.println("Introduce operando 2");
            operando2 = scanner.nextInt();
        }
        double resultado = 0;
        switch (opcion) {
            case 1 -> {
                System.out.println("Vas a sumar");
                resultado = operando1 + operando2;
            }
            case 2 -> {
                System.out.println("Vas a restar");
                resultado = operando1 - operando2;

            }
            case 3 -> {
                System.out.println("Vas a multiplicar");
                resultado = operando1 * operando2;

            }
            case 4 -> {
                System.out.println("Vas a dividir");
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                }

            }
            case 5 -> {
                System.out.println("Vas a modular");
                resultado = operando1 % operando2;
                // switch

            }
            case 6 -> {
                System.out.println("Saliendo");
            }
            default -> {
                System.out.println("Opcion no contemplada");
            }
        }
        System.out.println("El resultado obtenido es " + resultado);
    }

}
