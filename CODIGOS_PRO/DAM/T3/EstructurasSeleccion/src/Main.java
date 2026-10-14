import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa para la explicacion de las sentencias");
        System.out.println("Sentencia if");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el pin de la tarjeta");
        int pin = lector.nextInt();
        lector.close();
        boolean acierto = true;
        if (pin<0 || pin>9999){
            System.out.println("El pin no tiene formato valido");
        } else if (pin == 1234) {
            System.out.println("Pin correcto");
            System.out.println("Procedemos a operar en banca");
        } else if (pin == 0000) {
            System.out.println("Usuario en modo admin");
            System.out.println("Procedemos a realizar verificaciones");
        } else {
            System.out.println("Usuario incorrecto");
            System.out.println("La cuenta queda bloqueda");
        }

        System.out.println("Terminando la operativa del banco");
    }
}
