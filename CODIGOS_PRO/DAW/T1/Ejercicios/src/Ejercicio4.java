import java.util.Scanner;

public class Ejercicio4 {


    /*
    Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€.
    El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste
    de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double PRECIO_BOCATA = 2.05;
        final double PRECIO_BEBIDA = 1.35;
        System.out.println("Cuantas bebidas quieres");
        int nBebidas = lector.nextInt();
        System.out.println("Cuantas bocatas quieres");
        int nBocatas = lector.nextInt();
        lector.close();
        double costeBebidas = nBebidas * PRECIO_BEBIDA;
        double costeBocatas = nBocatas * PRECIO_BOCATA;
        double costeTotal = costeBocatas+costeBebidas;
        System.out.printf("El coste de las bebidas es de %.2f\n",costeBebidas);
        System.out.printf("El coste de las bocatas es de %.2f\n",costeBocatas);
        System.out.printf("El coste total es de %.2f",costeTotal);

    }
}
