import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double FACTOR_CORRECTOR = 273.13;
        System.out.println("Indica el numero de grados Cº");
        double gradosC = lector.nextDouble();
        double gradosF = (9 * gradosC) / 5.0 + 32;
        double gradosK = gradosC + FACTOR_CORRECTOR;
        System.out.printf("Vas a pasar %.2f C\n",gradosC);
        System.out.printf("El los grados en F son %.2f y en K son %.2f\n", gradosF, gradosK);
        System.out.println("Indica el numero de grados F");
        gradosF = lector.nextDouble();
        gradosC = (5*(gradosF-32))/9;
        gradosK = gradosC +FACTOR_CORRECTOR;
        System.out.printf("Vas a pasar %.2f F\n",gradosC);
        System.out.printf("El los grados en C son %.2f y en K son %.2f\n", gradosC, gradosK);
        System.out.println("Indica el numero de grados k");
        gradosK = lector.nextDouble();
        lector.close();
        gradosF = 9*(gradosK-FACTOR_CORRECTOR)/5 +32;
        gradosC = gradosF -FACTOR_CORRECTOR;
        System.out.printf("Vas a pasar %.2f K\n",gradosC);
        System.out.printf("El los grados en C son %.2f y en F son %.2f\n", gradosC, gradosF);
    }
}
