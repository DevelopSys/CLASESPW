import java.util.Scanner;

public class MainIF {

    public static void main(String[] args) {
        System.out.println("Programa para la explicacion de las sentencias");
        System.out.println("Sentencia if");
        Scanner lector = new Scanner(System.in);
        /*
        System.out.println("Introduce el pin de la tarjeta");
        int pin = lector.nextInt();
        lector.close();
        boolean acierto = true;
        // usado para ejercucar un bloque completo dependiendo de una condicion boolean
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
        }*/

        // ternario: utilizado para poder asignar valores dependiendeo de una condicion
        System.out.println("Introduce el pin de la tarjeta");
        int pin = lector.nextInt(); // si pin es de 4 digitos
        /*
        if (pin > 9999 || pin < 0) {
            System.out.println("Numero invalido"); // si no tiene 4 digitos
        } else {
            System.out.println("Numero valido"); // si tiene 4 digitos
        }*/
        // String mensaje = pin >=0 && pin <=9999 ? "Numero valido" : "Numero invalido";
        //System.out.println(mensaje);
        System.out.println(pin >=0 && pin <=9999 ? "Numero valido" : "Numero invalido");


        System.out.println("Terminando la operativa del banco");


    }
}
