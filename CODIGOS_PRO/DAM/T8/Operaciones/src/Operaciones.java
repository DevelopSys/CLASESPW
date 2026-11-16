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

    public void ordenar() {
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

    public void rotarIzq() {
        int primero = numeros[0]; // primer elemento
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = primero;
    }

    public void rotarDer() {
        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i++) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = aux;
    }


    public void invertir() {
        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = aux;
        }
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
