import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    static ArrayList<Object[]> listaContactos = new ArrayList<>();

    public static void main(String[] args) {

        // guardar una agenda telefonica -> ArrayList<Object[]>
        // Arraylist -> lista con tamaño con tamaño modificable
        // Arraylist<Tipo de objeto guardado>
        // Object -> elemento que guarda cualquier tipo de dato
        // Object[] -> lista con tamaño fijo de cualquier tipo
        // int[] -> lista con tamaño fijo de numeros
        // agenda.get(0) -> (Object[])Object
        // contatos -> nombre, apellido, dni, telefono -> Object[]{nombre, apellido, dni, telefono}
        // [ [nombre,apellido,telefono, dni] , [nombre,apellido,telefono, dni] ]
        // lista.get(0) -> Object[]
        // ArrayList<Estudiante>
        // ((Estudiante)lista.get(0)).numeroEstiante
        // ((Estudiante)lista.get(0)).numeroEstiante
        // lista.get(0).numeroEstudiante
        // [{B,M,1234A,1234},{M,M,2345A,2345},{J,G,3456A,3456}]
        listaContactos.add(new Object[]{"Borja", "Martin", "1234A", 1234});
        listaContactos.add(new Object[]{"Maria", "Martin", "1234A", 2345});
        listaContactos.add(new Object[]{"Juan", "Gomez", "3456A", 3456});

        // como borraria un elemento que tenga como dni 2345A
        /*for (int i = 0; i < listaContactos.size(); i++) {
            Object[] contacto = listaContactos.get(i);
            if (contacto[2].equals("2345B")) {
                // listaContactos.remove(i); -> el elemento borrado
                listaContactos.remove(contacto); // -> el boolean con el resultado
                break;
            }
        }*/
        boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                boolean resultado =objects[2].equals("1234A");
                return resultado;
            }
        });
        System.out.println("Se ha borrado algun elemento? "+borrado);

        mostrarContactos();
    }

    public static void mostrarContactos() {
        for (Object[] contacto : listaContactos) {
            System.out.println("Imprimendo datos de contacto");
            System.out.printf("\tNombre: %s Apellido: %s DNI: %s Telefono%d %n",
                    contacto[0], contacto[1], contacto[2], (int)contacto[3]);
        }
    }

}
