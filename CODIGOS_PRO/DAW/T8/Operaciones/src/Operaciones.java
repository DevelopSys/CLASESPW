import java.util.Arrays;

public class Operaciones {
    private int[] numeros;

    public Operaciones() {
    }

    public Operaciones(int numero) {
        numeros = new int[numero];
    }

    public void invertir() {
        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = numeros[i];
            numeros[i] = aux;
        }
    }

    public void inversionLucia() {
        int aux = numeros.length - 1;
        int aux2;
        for (int i = 0; i < aux; i++) {
            aux2 = numeros[aux];
            numeros[aux] = numeros[i];
            numeros[i] = aux2;
            aux--;

        }
    }

    // modificacion - rellenado de datos
    public void rellenarDatos() {
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * (numeros.length + 10));
            } while (estaNumero(aleatorio));
            numeros[i] = aleatorio;
        }
    }

    // sustituid valores -> el usuario indica un valor, en caso de estar se sustituye por otro que indique el usuario
    public void cambiarNumeros(int nCambiar, int nCambio) {
        for (int i = 0; i < numeros.length; i++) {
            /*if (numeros[i] == nCambiar) {
                numeros[i] = nCambio;
            }*/
            numeros[i] = nCambiar == numeros[i] ? nCambio : numeros[i];
        }
    }

    // busqueda en array
    public boolean estaNumero(int numero) {
        for (int item : numeros) {
            if (item == numero)
                return true;
        }

        return false;
    }

    public void ordenar() {
        Arrays.sort(numeros);
    }

    public void rotarIzq() {
        int aux = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = aux;
    }

    /*

     */

    public void metodoLucia() {
        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 2; i >= 0; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[0] = aux;
    }

    public void rotarDer() {
        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = aux;
    }


    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
