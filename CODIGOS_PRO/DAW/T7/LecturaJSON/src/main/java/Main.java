import controller.APIController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        APIController controller = new APIController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estas son todas las ligas de las que tengo info");
        controller.obtenerLigas();
        System.out.println("De que liga quieres consultar su tabla");
        String id = scanner.next();
        controller.obtenerClasificacionCompleta(id);
    }
}
