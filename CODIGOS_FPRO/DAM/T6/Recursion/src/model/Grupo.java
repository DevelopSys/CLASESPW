package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Grupo {

    private String nombre;
    // private ArrayList find filter -> recorriendo
    private Set<Usuario> usuarios;
    private Set<Grupo> subGrupos;

    public Grupo() {
        usuarios = new HashSet<>();
        subGrupos = new HashSet<>();
    }

    public Grupo(String nombre) {
        this.nombre = nombre;
        usuarios = new HashSet<>();
        subGrupos = new HashSet<>();
    }

    public void addUsuario(Usuario u){
        this.usuarios.add(u);
    }

    public void addSubgrupo(Grupo grupo){
        subGrupos.add(grupo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<Grupo> getSubGrupos() {
        return subGrupos;
    }

    public void setSubGrupos(Set<Grupo> subGrupos) {
        this.subGrupos = subGrupos;
    }
}
