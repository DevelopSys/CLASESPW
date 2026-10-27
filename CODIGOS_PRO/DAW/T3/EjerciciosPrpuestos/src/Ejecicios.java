import java.util.Scanner;

public class Ejecicios {

    public void ejericioAdivinacion() {
        Scanner lector = new Scanner(System.in);
        String respuesta;
        int record = 0;
        do {
            int aleatorio = (int) (Math.random() * 21); // 08.876534
            System.out.println(aleatorio);
            int numeroUsuario;
            int intentos = 0;
            do {
                System.out.println("Adivina el numero, di cual es tu opcion");
                numeroUsuario = lector.nextInt();
                intentos++;
            } while (aleatorio != numeroUsuario);
            System.out.println("Enhorabuena, numero acertado en " + intentos);
            if (record == 0) {
                record = intentos;
            }
            if (intentos < record) {
                record = intentos;
                System.out.println("Y ademas has superado el record, dejandolo en " + record);
            }
            System.out.println("Quieres volver a jugar (S/N)");
            respuesta = lector.next();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Terminando el juego");
        System.out.println("El record de la sesion es " + record);
    }

    public void ejercicioBanco() {
        Cajero cajero = new Cajero();
        Scanner lector = new Scanner(System.in);
        int opcion;
        // saldo=1000
        System.out.println("El saldo del cajero actual es " + cajero.getSaldo());
        do {
            System.out.println("1. Consultar");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("El saldo es " + cajero.getSaldo());
                case 2 -> {
                    System.out.println("Que cantidad quieres sacar");
                    int sacar = lector.nextInt();
                    if (sacar < 1 || cajero.getSaldo() < sacar) {
                        System.out.println("Fallo en el proceso");
                    } else {
                        cajero.retirarDinero(sacar);
                    }
                }
                case 3 -> {
                    System.out.println("Cuanto quieres depositar");
                    int ingreso = lector.nextInt();
                    if (ingreso < 1) {
                        System.out.println("Error al introducir el dinero");
                    } else {
                        cajero.ingresarDinero(ingreso);
                    }
                }
                case 4 -> System.out.println("Saliendo.....");
            }
        } while (opcion != 4);
    }

    public void ejercicioDecimal() {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica el numero que quieres pasar");
        String numeroBase = lector.next(); // 1101
        System.out.println("Indica la base en la que esta el numero");
        int base = lector.nextInt(); // 2
        System.out.printf("Procedemos a pasar el numero %s en una base %d a decimal\n", numeroBase, base);
        int sumatorio = 0;
        // 1 111
        for (int i = 0; i < numeroBase.length(); i++) {
            int posicion = numeroBase.length() - i - 1;
            char letra = numeroBase.charAt(i); // '1' -> // A->10 B->11 C->12 D-> 13 E->14 F->15
            int numero = Integer.parseInt(String.valueOf(letra)); // 1
            sumatorio += (int) (numero * Math.pow(base, posicion));
        }
        System.out.println("El numero en base 10 es " + sumatorio);
    }

}
