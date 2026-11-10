import java.util.Arrays;

public class EjercicioBonoloto {
    public static void main(String[] args) {
        // [1,23,56,98,423] -> carton sistema

        // TODO -> pedir al usario 5 numeros y comprobar cuantos han
        // TODO -> sido acertados (numero y posicion)
        // [1,15,23,458,423] -> carton sistema
        int[] cartonSistema = new int[5];
        for (int i = 0; i < cartonSistema.length; i++) {
            int aleatorio = 0;
            do {
                aleatorio = (int) (Math.random() * 5)+1; // 5posicion 1,2,3,4
            } while (estaNumero(aleatorio, cartonSistema));
            // si esta en el carton -> saca otro aleatorio
            // si no esta en el carton ->
            cartonSistema[i] = aleatorio;
        }

        System.out.println(Arrays.toString(cartonSistema));
    }

    // [2.3.4.5.7] 3
    public static boolean estaNumero(int numero, int[] carton) {
        for (int item : carton) {
            if (numero == item) {
                System.out.println("Rpetido el numero "+numero);
                return true;
            }
        }
        return false;
    }
}
