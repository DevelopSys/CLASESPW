import controller.Gestor;
import model.Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPrograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestor gestor = new Gestor();
        int opcion = -1;

        do {
            System.out.println("1. Añadir usuario");
            System.out.println("2. Exportar usuarios");
            System.out.println("3. Listar usuarios");
            System.out.println("4. Importar usuarios");
            System.out.println("Indica que quieres hacer");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = -1;
            }
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indica nombre");
                    String nombre = scanner.next();
                    System.out.println("Indica apellido");
                    String apellido = scanner.next();
                    System.out.println("Indica dni");
                    String dni = scanner.next();
                    gestor.addUsuario(new Usuario(nombre, apellido, dni));
                }
                case 2 -> {
                    gestor.exportar();
                }
                case 3 -> {
                    gestor.listarUsuarios();
                }
                case 4 -> {
                    gestor.importar();
                }
                default -> {
                    System.out.println("caso no contemplado");
                    scanner = new Scanner(System.in);
                }
            }
        } while (opcion != 5);

    }
}
