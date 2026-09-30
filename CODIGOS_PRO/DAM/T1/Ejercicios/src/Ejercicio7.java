import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Que radio tiene el circulo");
        double radio = lector.nextDouble();
        lector.close();
        double area = Math.PI * Math.pow(radio,2);
        double longitud = 2*Math.PI*radio;
        System.out.println("El radio es "+area);
        System.out.println("El long es "+longitud);
    }

}
