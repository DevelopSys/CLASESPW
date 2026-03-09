import controller.Gestor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        Scanner scanner = new Scanner(System.in);
        // gestor.exportarXML();
        // gestor.importarXML();
        // gestor.lectorJSON();
        gestor.lectorJSON();
        System.out.print("De que producto quieres informacion");
        int id = scanner.nextInt();
        gestor.getProductoById(id);
    }
}
