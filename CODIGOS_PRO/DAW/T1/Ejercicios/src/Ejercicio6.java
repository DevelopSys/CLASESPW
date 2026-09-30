import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el precio de la compra");
        double compra = lector.nextDouble(); // cuando IDE el decimal es el .
        // cuando meto por teclado decimal es la ,
        System.out.println("Indica que iva se aplica a la compra");
        int iva = lector.nextInt(); // 20 25
        // double iva = lector.nextInt()/100.0; // 0.20 25
        double costeIVA = compra * (iva/100.0); // 500 * (20/100)
        double costeSinIva = compra-costeIVA;
        System.out.printf("La compra han sido %.2f\n",compra);
        System.out.printf("La compra sin IVA han sido %.2f\n",costeSinIva);
        System.out.printf("El IVA han sido %.2f\n",costeIVA);
    }

}
