import java.util.Scanner;

public class MainWhile {

    public static void main(String[] args) {

        int i = 5;
        /*while (i>0){
            System.out.println("Imprimo");
            i--;
        } */
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1-opcion1");
            System.out.println("2-opcion2");
            System.out.println("3-opcion3");
            System.out.println("4-Salir");
            System.out.println("Indica opcion ");
            opcion = lector.nextInt();
            switch (opcion){
                case 1-> System.out.println("opcion1");
                case 2-> System.out.println("opcion2");
            }
        } while (opcion!=4);

    }
}
