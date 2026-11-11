import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBonoloto {

    // generar un carton de bonoloto -> 5 numeros entre el 1 - 100 sin que se puedan repetir
    // TODO -> pedir al usuario 5 numeros, que no sean repetidos
    // decidir cuantos he acertado -> coincide valor y posicion
    public static void main(String[] args) {
        int[] cartonBonoloto = new int[5];
        for (int i = 0; i < cartonBonoloto.length; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * 10) + 1; // 5posiciones 1-105 1,2,3,4,5
            } while (estaNumero(cartonBonoloto, aleatorio));
            cartonBonoloto[i] = aleatorio;
        }

        System.out.println("Carton sistema "+Arrays.toString(cartonBonoloto));
        // pedir al usuario numeros 5: pero no puede poner repetidos tienen que ser numeros entre 1 - 10
        int[] cartonUsuario = new int[5];
        for (int i = 0; i < cartonUsuario.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int numeroUsuario;
            do {
                System.out.println("indca el numero en posicion " + (i + 1));
                numeroUsuario = scanner.nextInt();
            } while (estaNumero(cartonUsuario, numeroUsuario) || numeroUsuario < 1 || numeroUsuario > 10);
            cartonUsuario[i] = numeroUsuario;
        }
        System.out.println("Carton usuario "+Arrays.toString(cartonUsuario));
        // comprobar si estan en el carto del sistema
        int aciertos = 0;
        for (int i = 0; i < cartonUsuario.length; i++) {
            /*if (cartonBonoloto[i] == cartonUsuario[i]){
                aciertos++;
            }*/
            aciertos = cartonBonoloto[i] == cartonUsuario[i] ? aciertos+1 : aciertos;
        }
        System.out.println("El numero de aciertos es de "+aciertos);
    }

    public static boolean estaNumero(int[] carton, int numero) {
        for (int item : carton) {
            if (item == numero) {
                System.out.println("Repetido");
                return true;
            }
        }
        return false;
    }

}
