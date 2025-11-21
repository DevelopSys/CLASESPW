import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el correo que quieres añadir");
            String correo = scanner.next();
            if (correo.equalsIgnoreCase("salir"))
                break;
            if (controller.metodoInsertar(correo)){
                System.out.println("Insertado correctamente");
            } else {
                System.out.println("Usuario no insertado");
            }


        }

        controller.metodoListar();
        System.out.println("El numero de correos que estan guardados es de "+controller.getNumeroCorreos());

    }

}
