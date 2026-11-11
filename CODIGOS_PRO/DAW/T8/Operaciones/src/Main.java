import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cuantos numeros tiene el array de operaciones");
            int longArray = scanner.nextInt();
            Operaciones operaciones = new Operaciones(longArray);
            // numeros = [0,0,0,0,0]
            int opcion;
            do {
                System.out.println("1. Rellenar datos");
                System.out.println("2. Cambiar datos");
                System.out.println("3. Rotar Array");
                System.out.println("4. Invervir Array");
                System.out.println("5. Ordenar Array");
                System.out.println("6. Mostrar Array");
                System.out.println("7. Salir");
                System.out.println("Indica la accion a realizar");
                opcion = scanner.nextInt();
                // TODO realizar la rotacion en sentido derecha
                // TODO realizar una inversion: cambiar el array sobre un pivote central
                switch (opcion) {
                    case 1 -> operaciones.rellenarDatos();
                    case 2 -> {
                        System.out.println("Que numero quieres buscar");
                        int numeroBuscar = scanner.nextInt();
                        if (operaciones.estaNumero(numeroBuscar)) {
                            int numeroCambiar;
                            do {
                                System.out.println("Que numero lo quiees cambiar");
                                numeroCambiar = scanner.nextInt();
                            } while (operaciones.estaNumero(numeroCambiar));
                            operaciones.cambiarNumeros(numeroBuscar, numeroCambiar);
                            System.out.println(Arrays.toString(operaciones.getNumeros()));
                        } else {
                            System.out.println("El numero buscado no se encuentra");
                        }
                    }
                    case 3 -> operaciones.rotarIzq();
                    case 5 -> operaciones.ordenar();
                    case 6 -> System.out.println(Arrays.toString(operaciones.getNumeros()));

                }

            } while (opcion != 7);


            // System.out.println(operaciones.estaNumero(numeroBuscar));
        } catch (Exception e) {
            System.out.println("Error en el programa");
        }
    }
}
