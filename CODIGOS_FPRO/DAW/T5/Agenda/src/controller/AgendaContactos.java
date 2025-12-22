package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Contacto;

import java.util.ArrayList;



public class AgendaContactos {

    private ArrayList<Contacto> listaContactos; // se inicializan en contadas ocasiones
    private int contador;


    public AgendaContactos() {
        this.listaContactos = new ArrayList<>();
        this.contador = 1;
    }

    public void agregarContacto(Contacto contacto) {
        //TODO Cuidado con el ID

        // busqueda
        if(estaContacto(contacto.getDni())==null){
            contacto.setId(contador);
            contador++;
            listaContactos.add(contacto);
            System.out.println("Agregado correctamente");
        } else {
            System.out.println("Contacto duplicado, no se puede agregar");
        }
        // solo cuando no exista el email del contacto en la lista

    }

    public void buscarContacto(String dni){
        Contacto contacto = estaContacto(dni);
        if(contacto !=null){
            contacto.mostrarDatos();
        } else {
            System.out.println("El contacto no se ha encontrado");
        }
    }

    public void borrarContacto(String dni){
        Contacto contacto = estaContacto(dni);
        if(contacto !=null){
            listaContactos.remove(contacto);
            System.out.println("Borrado correctamente");
        } else {
            System.out.println("El contacto no se ha encontrado");
        }
    }

    private Contacto estaContacto(String dni) {
        // el mail
        // lista
        // for
        for (Contacto contacto : listaContactos) {
            if (contacto.getDni().equals(dni)) {
                return contacto;
            }
        }
        return null;
    }

    public void listarContactos(){
        for (Contacto contacto: listaContactos) {
            contacto.mostrarDatos();
        }
    }

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
