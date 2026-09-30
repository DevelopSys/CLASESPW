import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final double PRECIO_BEBIDA = 1.25;
        final double PRECIO_BOCATA = 2.05;
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas bebidas vais a pedir");
        int nBebidas = lector.nextInt();
        System.out.println("Cuantas bocatas vais a pedir");
        int nBocatas = lector.nextInt();
        lector.close();
        double precioBebidas = PRECIO_BEBIDA*nBebidas;
        double precioBocatas = PRECIO_BOCATA*nBocatas;
        double precioTotal = precioBocatas+precioBocatas;
        System.out.println("El precio de las bebidas es de: "+precioBebidas);
        System.out.println("El precio de las bocatas es de: "+precioBocatas);
        System.out.println("El precio total es de: "+(precioBebidas+precioBocatas));
    }
}
