import java.util.Scanner;

public class MainSwitch {

    public static void main(String[] args) {
        // al utilizar un switch se evalua un valor (no un boolean)
        int numero = 6;
        String nombre = "Borja";
        String mensaje = null;
        String calificacion = null;
        /*
        switch (numero) {
            // no escribo NADA
            case 1:
                // HAZ LO QUE QUIERAS
                System.out.println("La variable vale 1");
                mensaje = "Variable 1";
                break;
            case 3:
                System.out.println("La variable vale 3");
                mensaje = "Variable 3";
                break;
            case 4:
                System.out.println("La variable vale 4");
                mensaje = "Variable 4";
                break;
            case 5:
                System.out.println("La variable vale 5");
                mensaje = "Variable 4";
                break;
            case 2,7,8,9:
                System.out.println("Caso en conjunto");
                mensaje = "Variable conjunta";
                break;
            default:
                System.out.println("El caso no esta contemplado");
                mensaje = "cosa sin definir";
        }*/
        /*        switch (nombre) {
            case "Borja" -> {
                int dato = 10;
                System.out.println("El nombre es analizado");
                System.out.println("El nombre es Borja");
            }
            case "Ana" -> {
                int dato = 10;
                System.out.println("El nombre es Ana");
            }
            case "Juan" -> {
                System.out.println("El nombre es Juan");
            }
            case "Marta" -> System.out.println("El nombre es Marta");
            case "Pepe", "Luis" -> {
                System.out.println("El nombre es conjunto");
            }
            default -> {
                System.out.println("El nombre no se reconoce");
            }

        }
        System.out.println(mensaje);
        System.out.println("Terminando evaluacion");
    }
    */
        Scanner lector = new Scanner(System.in);
        /*
        char letra = lector.next().toLowerCase().charAt(0); // A B C D F
        switch (letra){
            case 'a' -> {
                calificacion = "Aprobado";
            }
            case 'b' -> {
                calificacion = "Notable";
            }
            case 'c' -> {
                calificacion = "Sobresaliebte";
            }
            case 'f' -> {
                calificacion = "Suspenso";
            }
        }*/
        /*
        int nota = lector.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta");
        } else {
            switch (nota) {
                case 1, 2, 3, 4 -> calificacion = "suspenso";
                default -> calificacion = "aprobado";
            }
            System.out.println("La calificacion es de " + calificacion);
        }*/

        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("Indica que quieres hacer");
        int opcion = lector.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Proceso de la opcion 1");

            }
            case 2 -> {
                System.out.println("Proceso de la opcion 2");
            }
            case 3 -> {
                System.out.println("Proceso de la opcion 3");
            }
            case 4 -> {
                System.out.println("Proceso de la opcion 4");
            }
        }


    }

}
