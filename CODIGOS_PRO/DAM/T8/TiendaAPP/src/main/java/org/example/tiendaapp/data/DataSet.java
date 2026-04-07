package org.example.tiendaapp.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.tiendaapp.model.Producto;
import org.example.tiendaapp.model.Usuario;

import java.util.ArrayList;
import java.util.Optional;

public class DataSet {

    private static ObservableList<Usuario> listaUsuarios
            = FXCollections.observableArrayList(
            new Usuario("Admin", "Admin", "Madrid", "admin@gmail.com", "admin", 42, "Administrador", "Masculino"),
            new Usuario("User", "User", "Madrid", "user@gmail.com", "user", 40, "Cliente", "Femenino"));

    private static ObservableList<Producto> carrito = FXCollections.observableArrayList();

    public static ObservableList<Producto> getCarrito(){
        return carrito;
    }

    public static void addProduct(Producto producto){
        carrito.add(producto);
    }
    public static ObservableList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ObservableList<Usuario> lista) {
        listaUsuarios = lista;
    }

    public static boolean addUser(Usuario usuario){
    // metodo agregar usuario donde solo se pueden agregar usuarios que no existan con el mismo correo
        listaUsuarios.add(usuario);
        return true;
    }
    public static Usuario getLogin(String correo, String pass){
        Optional<Usuario> usuarioOptional = listaUsuarios.stream()
                .filter(item->item.getCorreo().equals(correo) && item.getPass().equals(pass))
                .findFirst();

        return usuarioOptional.orElse(null);
    }

    public static Double getCosteCarrito(){
        return carrito.stream().mapToDouble(Producto::getPrice).sum();
    }

    public static void clearCarrito(){
        carrito.clear();
    }
}
