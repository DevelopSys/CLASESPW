package controller;

import dao.ClienteDAO;
import model.Cliente;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private ClienteDAO clienteDAO;

    public Tienda(){
        clienteDAO = new ClienteDAO();
    }
    public void agregarUsuario(Cliente cliente){
        System.out.println("Procedemos a meter el usuario en el sistema");
        try {
            clienteDAO.insertarUsuarioPS(cliente);
        } catch (SQLException e) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Este correo ya esta en uso, por favor indica otro diferente");
            String correo = scanner.next();
            cliente.setCorreo(correo);
            agregarUsuario(cliente);
        }
    }

    public void actualizarUsuario(String correo, String nombre){
        System.out.println("Actualizando usuario");
        int row = clienteDAO.actualizarUsuario(correo,nombre);
        if (row == 0){
            System.out.println("El correo indicado no se encuenta en la bd");
        } else {
            System.out.println("El numero de elementos actualizados es de "+row);
        }
    }

    public void lanzarFidelizacion(){
        // a todos los clientes de mi base de datos le manda un correo personalizadao

        List<Cliente> listado = clienteDAO.obtenerClientes();
        listado.stream()
                .filter(data->data.getSaldo()<50)
                .forEach(data-> {
                    // javamail
                    System.out.println("Correo enviado a " + data.getCorreo());
                });
    }
}
