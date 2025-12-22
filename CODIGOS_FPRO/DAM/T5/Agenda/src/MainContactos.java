import controller.Agenda;
import controller.AgendaContactos;
import model.Contacto;

import java.util.Scanner;

public class MainContactos {

    public static void main(String[] args) {
        AgendaContactos agendaContactos = new AgendaContactos();
        // lista = [], id=1
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        // listaContactos=[]
        // System.out.println("El tamaño de la lista es de "+agenda.getListaContactos().size());

        do {
            System.out.println("1 Agregar contacto");
            System.out.println("2 Borrar contacto");
            System.out.println("3 Buscar contacto");
            System.out.println("4 Listar contactos");
            System.out.println("5 Salir");
            System.out.println("Que opcion quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce nombre");
                    String nombre = scanner.next();
                    System.out.println("Introduce apellido");
                    String apellido = scanner.next();
                    System.out.println("Introduce dni");
                    String dni = scanner.next();
                    System.out.println("Introduce telefono");
                    int telefono = scanner.nextInt();
                    agendaContactos.agregarContacto(new Contacto(nombre,apellido,dni,telefono));
                }
                case 2 -> {
                    System.out.println("Introduce dni a borrar");
                    String dni = scanner.next();
                    agendaContactos.borrarContacto(dni);
                }
                case 3 -> {
                    System.out.println("Introduce dni a buscar");
                    String dni = scanner.next();
                    agendaContactos.buscarContacto(dni);
                }
                case 4 -> {
                    agendaContactos.listarContactos();
                }
                case 5 -> {
                    System.out.println("Salir.....");
                }
            }

        } while (opcion != 5);
    }
}
