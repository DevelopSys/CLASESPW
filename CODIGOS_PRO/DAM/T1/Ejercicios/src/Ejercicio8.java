import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de grados C a pasar");
        final double FACTOR_CORRECTOR =273.15;

        double gradosC = lector.nextDouble(); // ,
        double gradosF = (9 * gradosC) / 5 + 32;
        double gradosK = gradosC + FACTOR_CORRECTOR;
        System.out.println("Las conversiones de C son");
        System.out.printf("%.2fºC son %.2f°F y %.2f°K\n", gradosC, gradosF, gradosK);
        // System.out.println(gradosC+"°C con "+gradosF+"°F y "+gradosK+"°K");
        System.out.println("Cantidad de grados F a pasar");
        gradosF = lector.nextDouble();
        gradosC = (5*(gradosF-32))/9;
        gradosK = gradosC +FACTOR_CORRECTOR;
        System.out.println("Las conversiones de F son");
        System.out.printf("%.2fºF son %.2f°C y %.2f°K\n", gradosF, gradosC, gradosK);
        System.out.println("Cantidad de grados K a pasar");
        gradosK = lector.nextDouble();
        lector.close();
        gradosC = gradosK-FACTOR_CORRECTOR;
        gradosF = (9*gradosC)/5+32;
        System.out.println("Las conversiones de K son");
        System.out.printf("%.2fºK son %.2f°C y %.2f°F\n", gradosK, gradosC, gradosF);
    }

}

