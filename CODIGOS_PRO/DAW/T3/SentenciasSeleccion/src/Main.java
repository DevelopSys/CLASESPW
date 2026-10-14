import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una nota");
        int nota = lector.nextInt();
        // 5
        if (nota<0||nota>10){
            System.out.println("La nota no es valida");
        } else {
            // 0-10
            if(nota<=3){
                System.out.println("Suspenso clarisimo");
            } else if (nota<5){
                System.out.println("Suspenso pelao");
            } else if(nota<7){
                System.out.println("Aprobado justo");
            } else if(nota<9){
                System.out.println("Notable");
            } else if (nota == 9) {
                System.out.println("Sobresaliente");
            } else {
                //10
                System.out.println("Perfecto");
            }
        }

        System.out.println("Terminando el programa de evaluacion del examen");
    }
}
