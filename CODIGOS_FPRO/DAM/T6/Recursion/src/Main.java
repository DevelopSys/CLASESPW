import controller.ControllerMatematico;

public class Main {

    public static void main(String[] args) {

        ControllerMatematico controllerMatematico = new ControllerMatematico();

        for (int i = 0; i < 100; i++) {
            System.out.println("El numero de Fb de la posicion "+i +" es "+ controllerMatematico.calculoNumeroFB(i));
        }
    }


}
