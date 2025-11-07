import java.util.Scanner;

public class MainWhile {

    public static void main(String[] args) {
        /*
        while -> estructura que repite un cuerpo siempre que una condicion sea true
        cuantas ejecuciones minimo tiene este estamento -> 0 a N
        mientras (condicion){
            cuerpo -> o romper con break o cambiar la condicion
        }
        ejecuta



        // quiero pedir al usuario que me introduzca numeros
        // hasta tener un negativo
        Scanner scanner = new Scanner(System.in);
        int intentos =3;
        int pin = 1234;
        int pinUsuario =0;
        boolean bloqueado = false;
        while (intentos>0 && pinUsuario!=pin){
            System.out.println("Por favor introduce un pin");
            pinUsuario = scanner.nextInt();
            intentos--;
            if (intentos==0 && pinUsuario!=pin){
                bloqueado = true;
            }
        }
        if (bloqueado){
            System.out.println("Telefono bloquedo");
        } else {
            System.out.println("Bienvenido al telefono");
        }

        System.out.println("Sistema detenido"); */
        /*
        do-while -> se repite el cuerpo de un estamento siempre y cuando
        la condicion de repeticion se true -> 1 a N
         */

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Las opciones del menu son ");
            System.out.println("1 - sumar");
            System.out.println("2 - restar");
            System.out.println("3 - salir");
            System.out.println("Que opcion quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Vamos a sumar");
                }
                case 2 -> {
                    System.out.println("Vamos a restar");
                }
                case 3 -> {
                    System.out.println("saliendo......");
                }
                default -> {
                    System.out.println("Caso no contemplado");
                }
            }
        } while (opcion != 3);

    }
}
