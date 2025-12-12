package controller;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Agenda {
    // atributos -> cualificar
    // [nombre, apellido, correo, telefono, dni]
    private ArrayList<Object[]> listaContactos;
    // El arraylist ya no es de Object[] -> quiero que sea de Contacto

    public Agenda() {
        listaContactos = new ArrayList<>();
    }

    // metodos -> funciones - acciones que quiereo que el objeto pueda ejecutar

    // agregar
    public void agregarContacto(Object[] contacto) {
        // si intento agregar un contacto con un dni ya existente deberia avisar de que no se puede
        listaContactos.add(contacto);
        System.out.println("Contacto agregado correcto");
    }

    // borrar
    public void borrarContacto(String dni) {

        boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return objects[4].equals(dni);
            }
        });
        if (borrado) {
            System.out.println("Contacto borrado correctamente");
        } else {
            System.out.println("Contacto no encontrado");
        }


        /*
        for ( Object[] item : listaContactos) {
            if(item[4].equals(dni)){
                listaContactos.remove(item);
                return;
            }
        }
        System.out.println("No encontrado");
        return
        */
    }

    // buscar
    public void buscarContacto(String dni) {
        for (Object[] item : listaContactos) {
            if (item[4].equals(dni)) {
                System.out.println("Contacto encontrado");
                System.out.println("Nombre " + item[0]);
                System.out.println("Correo" + item[2]);
                System.out.println("Telefono" + item[3]);
                return;
            }
        }
        System.out.println("No encontrado");
    }

    // listar
    public void listarContactos() {
        for (Object[] item : listaContactos) {
            System.out.println("Contacto encontrado");
            System.out.println("Nombre " + item[0]);
            System.out.println("Correo" + item[2]);
            System.out.println("Telefono" + item[3]);
        }
    }

    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Object[]> listaContactos) {
        this.listaContactos = listaContactos;
    }
}
