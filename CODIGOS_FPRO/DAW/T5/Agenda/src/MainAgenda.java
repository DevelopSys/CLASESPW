import controller.Agenda;

import java.util.Scanner;

public class MainAgenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Agenda agenda = new Agenda();
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
                    agenda.agregarContacto(new Object[]{nombre,apellido,correo,telefono,dni});
                }
                case 2->{
                    System.out.println("Dime el dni de la persona a buscar");
                    String dni = scanner.next();
                    agenda.borrarContacto(dni);
                }
                case 3->{
                    System.out.println("Dime el dni de la persona a buscar");
                    String dni = scanner.next();
                    agenda.buscarPersona(dni);
                }
                case 4->{
                    agenda.listarContactos();
                }
                case 5->{
                    System.out.println("Salir");
                }
            }
        }while (opcion!=5);

    }
}
