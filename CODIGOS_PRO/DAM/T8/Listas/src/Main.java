import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listaNombre = new ArrayList<>();
        // añadir elementos -> add
        listaNombre.add("Borja");
        listaNombre.add("Benito");
        listaNombre.add("Maria");
        listaNombre.add("Juan");
        listaNombre.add("Benito");
        listaNombre.add("Luis");
        // obtiene elementos -> get
        // System.out.println("Primero "+listaNombre.getFirst());
        // System.out.println("Ultimo "+listaNombre.getLast());
        /*
        // cambia un valor por otro -> set
        // [Borja, Benito, Maria, Juan, Marta, Luis]
        listaNombre.set(1,"Jose");
        // [Borja, Jose, Maria, Juan, Marta, Luis]
        listaNombre.set(3,"Jose");
        // [Borja, Jose, Maria, Jose, Marta, Luis]
        listaNombre.set(4,"Jose");
        // [Borja, Jose, Maria, Jose, Jose, Luis]
        listaNombre.set(1,"Benitp");
        // [Borja, Benito, Maria, Jose, Jose, Luis]
        */
        // System.out.println("En posicion 1: "+ listaNombre.get(1));
        // System.out.println(listaNombre);
        /*for (String item: listaNombre) {
            System.out.println(item);
        }
        for (int i = 0; i < listaNombre.size(); i++) {
            System.out.println(listaNombre.get(i));
        }*/
        // borrar elemento -> remove(pos) remove(elemento) removeIf


        // System.out.println("Eliminado el elemento, ya no cuentes con "+listaNombre.remove(12));
        // System.out.println("Eliminado el elemento, eliminado: "+listaNombre.remove("Marcos"));
        // Quiero eliminar todos los nombre que comienzan por B
        // recorre -> if -> borra
        /* NO MODIFICO EL TAMAÑO DE LA LISTA CON UN FOREACH
        for (String item: listaNombre) {
            if(item.charAt(0) == 'B')
                listaNombre.remove(item);
        }
        for (int i = 0; i < listaNombre.size(); i++) {
            if(listaNombre.get(i).charAt(0) == 'B'){
                listaNombre.remove(i);
                break;
            }
        }

        // [Borja, Benito, Juan, Marta, Luis]
        listaNombre.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String item) {
                // true -> el elemento se borra
                // false -> el elemento no se borra
                // return item.charAt(0) == 'B' && item.charAt(item.length()-1) == 'a';
                return item.length() != 4;
            }
        });

         */
        // listaNombre.clear();

        for (int i = 0; i < listaNombre.size(); i++) {
            if(listaNombre.get(i).equals("Benito")){
                listaNombre.set(i,"Jose");
            }
        }
        if (listaNombre.isEmpty()) {
            System.out.println("No hay nombre en la lista");
        } else {
            System.out.println(listaNombre);
        }

        System.out.println("El tamaño de la lista es de " + listaNombre.size());
    }
}
