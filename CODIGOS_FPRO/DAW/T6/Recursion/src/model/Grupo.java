package model;

import java.util.HashSet;
import java.util.Set;

public class Grupo {

    private String nombre;
    private Set<Usuario> usuarios;

    private Set<Grupo> subGrupos;

    public Grupo() {
        usuarios = new HashSet<>();
        subGrupos = new HashSet<>();
    }
    public Grupo(String nombre) {
        usuarios = new HashSet<>();
        subGrupos = new HashSet<>();
    }
    public void anadirUsuario(Usuario u){
        usuarios.add(u);
    }

    public void anadirSubgrupo(Grupo u){
        subGrupos.add(u);
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
