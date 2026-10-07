import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica una frase");
        String frase1 = lector.nextLine();
        System.out.println("Indica una frase");
        String frase2 = lector.nextLine();
        lector.close();
        boolean compararIguales = frase1.equals(frase2);
        boolean compararLong = frase1.length() < frase2.length();
        System.out.println("Comparar iguales "+compararIguales);
        System.out.println("Comparar long "+compararLong);
        System.out.println("Comparar distintas "+!compararIguales);

    }
}
