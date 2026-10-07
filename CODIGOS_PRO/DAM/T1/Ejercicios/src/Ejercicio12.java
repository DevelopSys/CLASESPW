import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica la primera palabra a comparar");
        String palabra1 = lector.nextLine();
        System.out.println("Indica la segunda palabra a comparar");
        String palabra2 = lector.nextLine();
        lector.close();
        boolean iguales = palabra1.equals(palabra2);
        System.out.println("Son iguales "+iguales);
        iguales = palabra1.equalsIgnoreCase(palabra2);
        System.out.println("Son iguales sin case "+iguales);
        boolean comparaLong = palabra1.length() < palabra2.length();
        System.out.println("Es mas pequeña la 1a palabra "+comparaLong);
    }
}
