import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Programa para explicar los operadores");
        // scanner permite realizar lecturas por teclado
        Scanner lector = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        // depende del tipo de dato que quieras leer la variable lector tiene metodos para ello
        String nombre = lector.nextLine();
        System.out.println("En que ciclo te has matriculado");
        String ciclo = lector.nextLine();
        System.out.println("Que nota quieres sacar de media en "+ciclo);
        double media = lector.nextDouble();
        System.out.println("Nombre: "+nombre.toUpperCase());
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Media: "+media);
        // Aritmeticos -> operaciones + - * / %
        // Asignacion -> da un valor = +=  -=  *=  /=  %=
        // Relacionales -> Comparacion. comparan dos o mas variables entre si < <= > >= == !=
        // Logicos -> sentencias && ||

    }
}
