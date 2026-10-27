package ejericiosClase;

public class Ejercicio3While {
    public static void main(String[] args) {
        /*
        Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
        El programa mostrará cada uno de los datos generados y obtendrá el mayor de los números generados. (MayorNumero)
         */
        // 0-100
        int aleatorio, max =0;
        do {
            aleatorio = (int) (Math.random()*101);
            // max = aleatorio>max ? aleatorio: max;
            if (aleatorio>max){
                max = aleatorio;
            }
            System.out.println("Generado "+aleatorio);
        }while ( aleatorio>0 );

        System.out.println("El mas grande ha sido "+max);
    }
}
