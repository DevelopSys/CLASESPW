package controller;


import model.Persona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Agenda {
    private HashMap<String, Persona> listaContactos;

    public Agenda() {
        listaContactos = new HashMap<>();
    }

    public void agregarPersona(Persona persona) {
        // cuando el dni de la persona no esta en la lista
        // recorro -> pregunto -> retorno -> estaPersona
        if (listaContactos.containsKey(persona.getDni())) {
            System.out.println("No se puede agregar, dni duplicado");
        } else {
            listaContactos.put(persona.getDni(), persona);
            System.out.println("Persona agregada correctamente");
        }
    }

    public void borrarPersona(String dni) {
        // recorrer -> preguntar -> ver posicion -> remove
        /*
        if (listaContactos.containsKey(dni)) {
            listaContactos.remove(dni);
            System.out.println("Borrado correctamente");
        } else {
            System.out.println("El dni no se encuentra en a lista, no se puede borrar");
        }*/
        Persona personaBorrada = listaContactos.remove(dni);
        if (personaBorrada!=null){
            System.out.println("Persona borrada correctamente con nombre "+personaBorrada.getNombre());
        } else {
            System.out.println("Error en el borrado, no se encuentra el DNI");
        }
    }

    public Persona obtenerPersona(String dni){
        return listaContactos.get(dni);
    }

    public void obtenerPersonas(){
        // keys
        System.out.println("Mostrando con Keys");
        Set<String> keys = listaContactos.keySet();
        for (String key: keys) {
            listaContactos.get(key).mostarDatos();
        }
        // values
        System.out.println("Mostrando con Values");
        Collection<Persona> values = listaContactos.values();
        for (Persona persona: values) {
            persona.mostarDatos();
        }
    }
}
