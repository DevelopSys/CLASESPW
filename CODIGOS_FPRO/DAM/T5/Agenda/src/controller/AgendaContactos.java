package controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import model.Contacto;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class AgendaContactos {
    private ArrayList<Contacto> listaContactos;
    private int id;
    public AgendaContactos(){
        listaContactos = new ArrayList<>();
        id = 1;
    }
    public void agregarContacto(Contacto contacto){
        // solo hay que hacerlo cuando el dni del contacto a agregar no esta en la lista
        if(estaContacto(contacto.getDni())==null){
            // el contacto no esta, por lo que lo añado
            contacto.setId(id);
            listaContactos.add(contacto);
            id++;
            System.out.println("Contacto agregado correctamente");
        } else {
            System.out.println("No se puede agragar, dni duplicado");
        }

    }

    public void borrarContacto(String dni){
        Contacto contacto = estaContacto(dni);
        if (contacto!=null){
            listaContactos.remove(contacto);
            System.out.println("Borrado correctamente");
        } else {
            System.out.println("Contacto no encontrado, no se puede borrar");
        }
    }

    public void buscarContacto(String dni){
        Contacto contacto = estaContacto(dni);
        if (contacto!=null){
            contacto.mostrarDatos();
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    public void listarContactos(){
        for (Contacto contacto: listaContactos) {
            contacto.mostrarDatos();
        }
    }

    public void vaciarLista(){
        // hacer un remove de todos -> recorreo con for
        // limpias
        listaContactos.clear();
        // id=1;
    }

    private Contacto estaContacto(String dni){
        // dni
        // lista
        // Recorrer y preguntar
        for (Contacto contacto: listaContactos) {
            if (contacto.getDni().equals(dni)){
                return contacto;
            }
        }
        return null;
    }
}
