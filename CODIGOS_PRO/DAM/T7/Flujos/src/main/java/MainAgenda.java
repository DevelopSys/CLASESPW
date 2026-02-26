import controller.GestorAgenda;
import model.Usuario;

import java.util.Scanner;

public class MainAgenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorAgenda gestorAgenda = new GestorAgenda();
        int opcion = -1;
        do{
            System.out.println("1- Agregar usuario");
            System.out.println("2- Listar usuarios");
            System.out.println("3- Exportar usuarios");
            System.out.println("4- Importar usuarios");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Indica el nombre del usuario");
                    String nombre = scanner.next();
                    System.out.println("Indica el apellido del usuario");
                    String apellido = scanner.next();
                    System.out.println("Indica el dni del usuario");
                    String dni = scanner.next();
                    gestorAgenda.agregarUsuario(new Usuario(nombre,apellido,dni));
                }
                case 2->{
                    gestorAgenda.listarContactos();
                }
                case 3->{
                    gestorAgenda.exportarContenido();
                }
                case 4->{
                    gestorAgenda.importarUsuarios();
                }
            }
        } while (opcion != 5);

    }
}
