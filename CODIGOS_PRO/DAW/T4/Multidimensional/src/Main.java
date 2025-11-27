import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[]{8, 12, 5, 45, 2};
        String[] palabras = new String[]{"palabra1","hola","adios","juego","programacion"};
        /*
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });*/
        // numeros = Arrays.copyOf(numeros,10);
        for (int numero: numeros) {
            System.out.println(numero);
        }
        // Object[] persona = new Object[]{"Borja", 42, "borja@gmail.com", true, 'A'};
        // [null,null,null,null,null]
        /*
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*21);
        }
        for (int item: numeros) {
            System.out.println(item);
        }

         */
    }
}
