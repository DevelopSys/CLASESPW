import java.util.Scanner;

public class EntradaWhile {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int intentos = 3;
        boolean bloqueado = true;
        int numeroUsuario;
        /*while (intentos>0){
            intentos--;
            System.out.println("Indica el pin del movil");
            int pin = lector.nextInt();
            if (pin!=0000){
                System.out.println("Pin incorrecto, intentalo de nuevo");
            } else {
                System.out.println("Pin correcto");
                bloqueado = false;
                break;
            }

        }
        if (bloqueado){
            System.out.println("Movil bloqueado");
        } else {
            System.out.println("Movil desbloqueado");
        }*/
        do {
            intentos--;
            System.out.println("Indica el pin");
            numeroUsuario = lector.nextInt();
            if (numeroUsuario == 1111){
                bloqueado = false;
                break;
            }
            else {
                System.out.println("Numero incorrecto");
            }
        }while (intentos>0);

        if(bloqueado){
            System.out.println("Movil bloqueado");
        } else {
            System.out.println("Movil desbloqueado");
        }
    }
}
