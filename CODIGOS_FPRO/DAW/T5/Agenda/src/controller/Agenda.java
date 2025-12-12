package controller;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Agenda {

    // [nombre, apellido, telefono, correo]
    private ArrayList<Object[]> listaContactos;

    public Agenda() {
        listaContactos = new ArrayList<>();
    }

    // agregarContacto
    public void agregarContacto(Object[] contacto) {
        listaContactos.add(contacto);
        System.out.println("Agregado correctamente");
        //  No puede haber dnis duplicados
    }

    // buscarContacto
    public void buscarPersona(String dni) {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay nada que buscar");
        } else {
            for (Object[] contacto : listaContactos) {
                if (contacto[4].equals(dni)) {
                    System.out.println("Contacto encontrado");
                    System.out.println("Nombre: " + contacto[0]);
                    System.out.println("Telefono: " + contacto[3]);
                    System.out.println("Correo: " + contacto[2]);
                    return;
                }
            }
            System.out.println("Usuario no encontrado");
        }

    }

    // borrarContacto
    public void borrarContacto(String dni) {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay nada que borrar");
        } else {
            /*boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
                @Override
                public boolean test(Object[] objects) {
                    return objects[4].equals(dni);
                }
            });

            if (borrado){
                System.out.println("Borrado correctamente");
            } else {
                System.out.println("Usuario no encontrado");
            }

             */
            for (Object[] contacto : listaContactos) {
                if (contacto[4].equals(dni)) {
                    listaContactos.remove(contacto);
                    System.out.println("Borrado correctamente");
                    return;
                }
            }
            System.out.println("Usuario no encontrado");
        }
    }

    // listarContactos
    public void listarContactos() {
        for (Object[] contacto : listaContactos) {
            System.out.println("Imprimiendo contacto");
            System.out.println("\tNombre: " + contacto[0]);
            System.out.println("\tTelefono: " + contacto[3]);
            System.out.println("\tCorreo: " + contacto[2]);

        }
    }

    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }
}
