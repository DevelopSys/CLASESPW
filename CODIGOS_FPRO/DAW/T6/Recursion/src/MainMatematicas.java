import controller.EjerciciosNumericos;

public class MainMatematicas {

    public static void main(String[] args) {
        // suma los dos numeros anteriores y ese es el siguiente numero de fibpnacci
        EjerciciosNumericos ejercicios = new EjerciciosNumericos();
        // utilizar sus metodos (publicos

        /*for (int i = 0; i <= 10; i++) {
            System.out.println("El numero de Fb en posicion i es "+ejercicios.numerosFibonacci(i));
        }

        ejercicios.numerosFibonacci(3);*/
        // retorno ->   numeroFb(2) -> 1 + numeroFb(1) -> 1   ->>>>> 2
        //              numero(1) + numero(0)
        //              1 + 0
        // 6 -> nF 5 + nF 4
        //  nF 4 -> nF3 + nF2 ->

        ejercicios.moviemtoHanoi(3,'A','B','C');

    }
}
