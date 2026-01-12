package controller;

import model.Persona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Agenda {
    private HashMap<String, Persona> listaPersonas;

    public Agenda() {
        listaPersonas = new HashMap<>();
    }

    public void agregarPersona(Persona persona) {
        // cuando el dni no este en la lista ya existente -> recorro, busco y retorno
        /*
        if(listaPersonas.put(persona.getDni(),persona)!=null){
            System.out.println("Persona agregada correctamente");
        }; // retora la persona agregada
        */

        if (listaPersonas.containsKey(persona.getDni())) {
            System.out.println("El dni ya esta asociado, no puedes agregar");
        } else {
            listaPersonas.put(persona.getDni(), persona);
            System.out.println("Agregada correctamente");
        }
    }
    public void borrarPersona(String dni) {
        // recorremos, esta?, posicion -> borro
        if (listaPersonas.containsKey(dni)) {
            listaPersonas.remove(dni);
        } else {
            System.out.println("No esta en la lista");
        }

        /*
        if (listaPersonas.remove(dni) != null) {
            System.out.println("Borrado correctamente");
        } else {
            System.out.println("El dni no esta en la lista");
        }*/
    }

    public Persona obtenerPersona(String dni){
        // si el dni esta en la lista -> persona
        // si el dni no esta en la lista -> null
        return listaPersonas.get(dni);
    }

    public void modificarPersona(String dni, Persona persona){
        listaPersonas.replace(dni, persona);
    }

    public void mostrarPersonas(){
        // sacas las keys -> recorres -> cada key -> get -> valor
        Set<String> keys = listaPersonas.keySet();
        // dni1, dni2, dni3, dni4, dni5
        for (String item: keys) {
            Persona persona = listaPersonas.get(item);
            persona.mostrarDatos();
        }
        // sacas los values -> recorres
        Collection<Persona> values = listaPersonas.values();
        for (Persona data: values) {
            data.mostrarDatos();
        }
    }
}
