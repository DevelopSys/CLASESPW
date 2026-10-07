import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("dmillar");
        int dmillar = lector.nextInt();
        System.out.println("umillar");
        int umillar = lector.nextInt();
        System.out.println("centenas");
        int centenas = lector.nextInt();
        System.out.println("decenas");
        int decenas = lector.nextInt();
        System.out.println("unidades");
        int unidades = lector.nextInt();
        System.out.println("El numero completo es " + dmillar + umillar + centenas + decenas + unidades);
        System.out.println("" + dmillar + umillar + centenas + decenas + unidades);
        System.out.println(dmillar + umillar + centenas + decenas + unidades);
        System.out.println("Indicame el numero completo");
        int numeroCompleto = lector.nextInt(); // 56789
        dmillar = numeroCompleto / 10000; // 5,6789 -> 5
        umillar = (numeroCompleto % 10000) / 1000; // 6,789 -> 6
        centenas = ((numeroCompleto % 10000) % 1000) / 100; // 7,89 -> 7
        decenas = (((numeroCompleto % 10000) % 1000) % 100) / 10; // 8,9 -> 8
        //unidades = (((numeroCompleto % 10000) % 1000) % 100) % 10; // 9
        unidades = numeroCompleto%10; // 5678,9
        System.out.println("La descomposion es");
        System.out.println("d millar " + dmillar);
        System.out.println("u millar " + umillar);
        System.out.println("centenas " + centenas);
        System.out.println("decenas " + decenas);
        System.out.println("unidades " + unidades);
        lector.close();
    }
}
