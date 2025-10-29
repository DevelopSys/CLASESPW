import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Cuantas bebidas");
        int nBebidas = lectorTeclado.nextInt(); // 5
        System.out.println("Cuantas bocadillos");
        int nBocadillos = lectorTeclado.nextInt(); // 7
        System.out.println("Cuantas valen las bebidas");
        double precioBebidas = lectorTeclado.nextDouble(); // 2,10
        System.out.println("Cuantas valen los bocadillos");
        double precioBocadillos = lectorTeclado.nextDouble(); // 4,5
        double precioTotalBebidas = nBebidas*precioBebidas; // 5*2,10
        double precioTotalBocatas = nBocadillos*precioBocadillos; // 7*4,50
        System.out.println("Los bocadillos me han costado "+precioTotalBocatas);
        System.out.println("Las bebidas me han costado "+precioTotalBebidas);
        System.out.println("Todo te ha costado "+(precioTotalBocatas+precioTotalBebidas));
        System.out.println("Entre cuantos divido la cuenta");
        int numeroPersonas=lectorTeclado.nextInt();
        System.out.println("Cada uno tiene que pagar "+(precioTotalBocatas+precioTotalBebidas)/numeroPersonas);


    }
}
