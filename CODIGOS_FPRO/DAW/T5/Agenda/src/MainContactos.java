import controller.Agenda;
import controller.AgendaContactos;
import model.Contacto;

import java.util.Scanner;

public class MainContactos {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        AgendaContactos agendaContactos = new AgendaContactos();
        // listaContactos = [] contador=1

        // listaContactos = [[b,m,b@gmail,1234],[m,l,m@gmail,2345]]

        do {
            System.out.println("1 - Agregar contactp");
            System.out.println("2 - Borrar contactp");
            System.out.println("3 - Buscar contactp");
            System.out.println("4 - Listar contactps");
            System.out.println("5 - Salir");
            System.out.println("Que opcion queres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Introduce el nombre");
                    String nombre = scanner.next();
                    System.out.println("Introduce el apellido");
                    String apellido = scanner.next();
                    System.out.println("Introduce el correo");
                    String correo = scanner.next();
                    System.out.println("Introduce el dni");
                    String dni = scanner.next();
                    System.out.println("Introduce el telefono");
                    int telefono = scanner.nextInt();
                    agendaContactos.agregarContacto(new Contacto(nombre,apellido,dni,correo,telefono));
                }
                case 2->{
                    System.out.println("Introduce el dni a borrar");
                    String dni = scanner.next();
                    agendaContactos.borrarContacto(dni);
                }
                case 3->{
                    System.out.println("Introduce el dni a buscar");
                    String dni = scanner.next();
                    agendaContactos.buscarContacto(dni);
                }
                case 4->{
                    agendaContactos.listarContactos();
                }
                case 5->{
                    System.out.println("Salir");
                }
            }
        }while (opcion!=5);
    }
}
