import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = lector.nextInt();
        int suma = operando2+operando1;
        int resta = operando1-operando2;
        int multi = operando2*operando1;
        int divi = operando1/operando2;
        int modulo = operando1%operando2;
        double diviReal = (double) operando1/operando2;
        double moduloReal = (double) operando1%operando2;
        // d-> numeros sin decimal s-> palabras f-> numeros decimales
        System.out.println("La suma de "+operando1+" y "+operando2+" los valores es "+suma);
        System.out.printf("La resta de %d y %d es %d\n",operando1,operando2,resta);
        System.out.printf("La multi de %d y %d es %d\n",operando1,operando2,multi);
        System.out.printf("La div de %d y %d es %d\n",operando1,operando2,divi);
        System.out.printf("La mod de %d y %d es %d\n",operando1,operando2,modulo);
        System.out.printf("La div real de %d y %d es %.1f\n",operando1,operando2,diviReal);
        System.out.printf("La modulo real de %d y %d es %.1f\n",operando1,operando2,moduloReal);
        lector.close();

    }

}
