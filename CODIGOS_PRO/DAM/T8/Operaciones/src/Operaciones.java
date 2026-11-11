import java.util.Arrays;

public class Operaciones {
    private int[] numeros;

    public Operaciones() {
    }

    public Operaciones(int lon) {
        numeros = new int[lon];
    }

    public void mostrar() {
        System.out.println(Arrays.toString(numeros));
    }

    public void rellenar() {
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * 10);
            } while (buscar(aleatorio));
            numeros[i] = aleatorio;
        }
    }

    public void ordenar(){
        // TODO  -> investigar los algoritmos de ordenacion existentes -> bubble sort
        Arrays.sort(numeros);
    }
    public void modificar(int numeroBuscar, int modificar) {
        // 1,2,5,6,3
        // 5
        // 7
        // 1,2,7,6,3
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar) {
                numeros[i] = modificar;
            }
        }
    }

    public boolean buscar(int numero) {
        for (int item : numeros) {
            if (item == numero) {
                return true;
            }
        }
        return false;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
