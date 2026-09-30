import java.util.Scanner;

public class Ejercicio5 {

    // Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica cuantos segundos quieres pasar");
        int segundosSistema = lector.nextInt(); // 34567
        // 1 hora -> 3600 (60 * 60)
        // 1 hora -> 60 minutos
        // 1 minuto -> 60 segundos
        int horas = segundosSistema / 3600; // 9,601
        System.out.println("Horas "+horas);
        // int segundosRestantes = segundosSistema%3600; // 0.601 horas -> 2167 segundos
        // System.out.println(segundosRestantes);
        int minutos = (segundosSistema%3600)/60; // 36,11
        System.out.println("Minutos "+minutos);
        int segundos = (segundosSistema%3600)%60;
        System.out.println("Segundos "+segundos);
        lector.close();

    }
}
