import controller.Tienda;
import dao.ClienteDAO;
import model.Cliente;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*ClienteDAO clienteDAO = new ClienteDAO();
        // si los pido por teclado es lo mismo
        try {
            clienteDAO.insertarUsuarioPS(new Cliente("Julian","Lopez","luis@gmail.com",234234,2));
        } catch (SQLException e) {
            System.out.println("Error en la sentencia SQL");
            System.out.println(e.getMessage());
        }*/
        /*
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();
        System.out.println("Indica nombre");
        String nombre = scanner.next();
        System.out.println("Indica correo");
        String correo = scanner.next();
        tienda.actualizarUsuario(correo,nombre);*/
        /*System.out.println("Indica apellido");
        String apellido = scanner.next();
        System.out.println("Indica correo");
        String correo = scanner.next();
        System.out.println("Indica saldo");
        int saldo = scanner.nextInt();
        System.out.println("Indica id perfil");
        int perfil = scanner.nextInt();
        tienda.agregarUsuario(new Cliente(nombre, apellido, correo, saldo, perfil));*/
        Tienda tienda = new Tienda();
        tienda.lanzarFidelizacion();

        // menu


    }
}
