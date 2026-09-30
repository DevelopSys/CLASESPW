import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce op1");
        int op1 = lector.nextInt();
        System.out.println("Introduce op2");
        int op2 = lector.nextInt();
        lector.close();
        int suma = op1 + op2;
        int resta = op1 - op2;
        int multi = op1 * op2;
        int div = op1 / op2;
        int mod = op1 % op2;
        double divReal = (double) op1 / op2;
        double modReal = op1 % op2;
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multi es "+multi);
        System.out.println("La div es "+div);
        System.out.println("La mod es "+mod);
        System.out.println("La div real es "+divReal);
        System.out.println("La resto real es "+modReal);
    }
}
