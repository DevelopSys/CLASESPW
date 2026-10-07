import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor introduce un numero");
        int numeroAnalizar = lector.nextInt();
        lector.close();
        boolean esPar = numeroAnalizar%2 ==0;
        boolean esMayor = numeroAnalizar>50;
        System.out.println("Es par? "+esPar);
        System.out.println("Es mayor que 50? "+esMayor);
        System.out.println("Es impar? "+!esPar);

    }
}
