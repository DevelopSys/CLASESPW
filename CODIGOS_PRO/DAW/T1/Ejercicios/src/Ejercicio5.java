import java.util.Scanner;

public class Ejercicio5 {

    // Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Que cantidad de segundos queres pasar a h:m:s");
        int segundosSistema = lector.nextInt(); // 25678s
        // 1h -> 3600s
        // 1h -> 60 m
        // 1m -> 60 s
        lector.close();
        int horas = segundosSistema/3600; // 7.13333
        int segundosRestantes = segundosSistema%3600; // 478
        System.out.println("Horas "+horas);
        int minutos = segundosRestantes/60; // 7,92222222
        System.out.println("Minutos "+minutos);
        int segundos = segundosRestantes%60;
        System.out.println("Segundos "+segundos);
        System.out.printf("%d:%d:%d",horas,minutos,segundos);
    }
}
