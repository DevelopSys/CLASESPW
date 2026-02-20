package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Gestor {

    private List<Usuario> lista;
    private Operaciones operaciones;

    public Gestor() {
        operaciones = new Operaciones();
        lista = operaciones.importarUsuarios();
    }

    public void addUsuario(Usuario usuario) {
        this.lista.add(usuario);
        System.out.println("usuaro creado con exito");
    }

    public void listarUsuarios() {
        this.lista.forEach(Usuario::mostrarDatos);
    }
    public void exportar(){
        // lista.stream().forEach(System.out::println);
        lista.forEach(user->operaciones.exportarUsuario(user));
    }

    public void importar(){
        lista = operaciones.importarUsuarios();
    }
    public List<Usuario> getLista() {
        return lista;
    }
    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
}
