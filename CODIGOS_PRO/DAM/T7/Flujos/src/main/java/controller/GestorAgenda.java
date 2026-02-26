package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestorAgenda {
    private List<Usuario> contactos;
    private GestorFicheros gestorFicheros;

    public GestorAgenda() {
        contactos = new ArrayList<>();
        gestorFicheros = new GestorFicheros();
    }

    public void listarContactos() {
        this.contactos.forEach(Usuario::mostrarDatos);
    }

    public void agregarUsuario(Usuario usuario) {
        Optional<Usuario> usuarioExistente = contactos
                .stream()
                .filter(item -> item.getDni().equalsIgnoreCase(usuario.getDni()))
                .findAny();

        if (usuarioExistente.isPresent()) {
            System.out.println("El dni que intentas agregar ya existe");
        } else {
            contactos.add(usuario);
        }

    }

    public void exportarContenido(){
        // contactos.forEach(item->gestorFicheros.exportarUsuario(item));
        // path -> ruta fija
        // lista -> recorro
        // usuario a usuario -> nombre,apellido,dni
            // escribo el fichero
        gestorFicheros.escribirUsuario(contactos);
    }

    public void importarUsuarios(){
        contactos = gestorFicheros.imporarUsuario();
    }

    public List<Usuario> getContactos() {
        return contactos;
    }

    public void setContactos(List<Usuario> contactos) {
        this.contactos = contactos;
    }
}
