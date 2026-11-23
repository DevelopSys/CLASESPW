import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>(); // []
        listaNombres.add("Borja");
        listaNombres.add("Maria");
        System.out.println("El tamaño actual de la lista es de "+listaNombres.size());
        System.out.println("El elemento el posicion 5 es "+listaNombres.getLast());

    }
}
