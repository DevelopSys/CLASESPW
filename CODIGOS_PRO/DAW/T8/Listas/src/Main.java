import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>(); // []
        // add
        listaNombres.add("Borja");
        listaNombres.add("Benito");
        listaNombres.add("Juan");
        listaNombres.add("Marta");
        listaNombres.add("Pepe"); // Jose
        listaNombres.add("Lucia");
        // remove
        // System.out.println("Elemento borrado correctamente. Ya no tienes a "+listaNombres.remove(1));
        // System.out.println("Elemento borrado correctamente. Elemento borrado: "+listaNombres.remove("Pepe"));
        // borrar todos los elementos que tengan una cantidad de letras de 4
        // borrar todos los elementos que comienzan por B
        // recorrer -> if (condicion) -> borro
        /* NO USES FOREACH PARA BORRAR PORQUE ALTERA EL SIZE DE LA LISTA
        for ( String item: listaNombres ) {
            if(item.charAt(0) == 'B')
                listaNombres.remove(item);
        }
        CUIDADO CON BORRAR ASI, QUE FALSEA EL BORRADO
        for (int i = 0; i < listaNombres.size(); i++) {
            if (listaNombres.get(i).charAt(0) == 'B') {
                listaNombres.remove(i);
                break;
            }
        }*/
        /* listaNombres.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String item) {
                // este metodo retorna true -> se borra
                // este metodo retorna false -> no se borra
                return item.length() == 4 ;
            }
        });*/
        // listaNombres.clear();
        // String nombre = listaNombres.get(4);
        // System.out.println("El nombre en la posicion 4 es: "+nombre);
        // listaNombres.set(4,"Jose");

        // si no se donde esta pepe, pero quiero cambiarlo por jose
        int posicion= -1;
        for (int i = 0; i < listaNombres.size(); i++) {
            if(listaNombres.get(i).equalsIgnoreCase("pepe")){
                posicion = i;
                break;
            }
        }

        listaNombres.set(posicion,"Jose");


        if (listaNombres.isEmpty()) {
            System.out.println("La lista no tiene ningun nombre");
        } else {
            for (String item : listaNombres) {
                System.out.println(item);
            }
        }

        System.out.println("El tamaño actual de la lista es de " + listaNombres.size());
    }
}
