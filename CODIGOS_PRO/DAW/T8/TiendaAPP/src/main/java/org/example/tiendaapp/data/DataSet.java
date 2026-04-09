package org.example.tiendaapp.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.tiendaapp.model.Product;
import org.example.tiendaapp.model.User;

import java.util.Optional;

public class DataSet {

    // nombre, apellido, correo, pass, dni, genero, perfil
    static private ObservableList<User> listUsers =
            FXCollections.observableArrayList(
                    new User("Admin", "Admin", "admin@gmail.com", "admin", "1234", "femenino", "admin", 50),
                    new User("Maria", "Martin", "maria@gmail.com", "maria", "1234", "femenino", "usuario", 50)
            );

    static private ObservableList<Product> carrito =
            FXCollections.observableArrayList();

    public static ObservableList<User> getListUsers() {
        return listUsers;
    }

    public static ObservableList<Product> getCarrito() {
        return carrito;
    }

    public static void addUser(User user) {
        // logica -> no se pueden meter dos usuarios con el mismo correo
        listUsers.add(user);
    }

    public static void addCarrito(Product product) {
        // logica -> no se pueden meter dos usuarios con el mismo correo
        carrito.add(product);
    }

    public static User getLogin(String mail, String pass) {
        Optional<User> userOptional = listUsers.stream()
                .filter(item -> item.getCorreo().equals(mail) && item.getPass().equals(pass))
                .findFirst();
        return userOptional.orElse(null);
    }

}
