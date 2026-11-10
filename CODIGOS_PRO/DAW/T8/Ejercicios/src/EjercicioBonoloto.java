public class EjercicioBonoloto {

    // generar un carton de bonoloto -> 5 numeros entre el 1 - 100 sin que se puedan repetir
    // TODO -> pedir al usuario 5 numeros, que no sean repetidos
    // decidir cuantos he acertado -> coincide valor y posicion
    public static void main(String[] args) {
        int[] cartonBonoloto = new int[100];

        for (int i = 0; i < cartonBonoloto.length; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * 105) + 1; // 5posiciones 1-105 1,2,3,4,5
            } while (estaNumero(cartonBonoloto, aleatorio));
            cartonBonoloto[i] = aleatorio;
        }

        for (int item : cartonBonoloto) {
            System.out.print(item + " ");
        }
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
