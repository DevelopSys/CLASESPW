import controller.APIController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        APIController apiController =new APIController();
        // apiController.getAllLigas();
        // apiController.getAllClasificacion();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do{
            System.out.println("1. Ver ligas");
            System.out.println("2. Ver clasificacion y exportar");
            System.out.println("3. Ver jugadores");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    apiController.getAllLigas();
                }
                case 2->{
                    System.out.println("De que liga quieres ver la clasificacion");
                    int id = scanner.nextInt();
                    apiController.getAllClasificacion(id);
                } case 3->{
                    System.out.println("De que equipo quieres ver los jugadores");
                    int id = scanner.nextInt();
                    apiController.getAllPlayers(id);
                }
                case 4->{
                    System.out.println("Saliendo");
                }

            }

        }while (opcion!= 4);
    }
}
