import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos bocatas pides");
        int nBocatas = lector.nextInt();
        System.out.println("Cuanto te cuesta cada bocata");
        double precioBocata = lector.nextDouble();
        System.out.println("Cuantos bebidas pides");
        int nBebidas = lector.nextInt();
        System.out.println("Cuanto te cuesta cada bebida");
        double precioBebida = lector.nextDouble();
        System.out.println("Cuantos sois");
        int comensales = lector.nextInt();
        lector.close();
        double precioBocatasTotal = precioBocata * nBocatas;
        double precioBebidasTotal = precioBebida * nBebidas;
        double importeIndividual = (precioBebidasTotal + precioBocatasTotal) / comensales;
        System.out.println("ARTICULO\t\t\t\tCANTIDAD\t\t\t\tCOSTE\t\t\t\tTOTAL");
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n", "Bebidas", nBebidas, precioBebida, precioBebidasTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n", "Bocatas", nBocatas, precioBocata, precioBocatasTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n", "Compra", nBocatas + nBebidas, 0.0, precioBebidasTotal + precioBocatasTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t\t%d\t\t\t\t\t%.2f\n", "P.unitario",comensales, comensales, importeIndividual);
    }
}
