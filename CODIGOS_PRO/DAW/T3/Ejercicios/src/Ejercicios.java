import java.util.Scanner;

public class Ejercicios {

    public void ejercicio12() {
        /*
        Crea un programa que pida al usuario crear una contraseña.
        La contraseña debe cumplir estos requisitos:
        tener al menos 8 caracteres de longitud, contener al menos un número, y
        NO puede ser "12345678" o "password". El programa debe verificar cada condición
        por separado usando operadores lógicos y mostrar si la contraseña es válida o no,
        indicando qué requisitos no cumple.

Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce contraseña");
        String pass = scanner.next();
        boolean nCaracteres = pass.length() >= 8;
        System.out.println("La contraseña tiene al menos 8 caracteres " + nCaracteres);
        //12345678
        boolean esValida = !(pass.equals("12345678") || pass.equals("password")); // !true -> false
        System.out.println("La pass es invalida " + esValida);
        boolean contieneNumero = pass.contains("1") || pass.contains("2")
                || pass.contains("3") || pass.contains("4") || pass.contains("5") || pass.contains("6")
                || pass.contains("7") || pass.contains("9") || pass.contains("8") || pass.contains("0");
        System.out.println("La pass contiene al menos un numero " + contieneNumero);
        boolean passValida = nCaracteres && esValida && contieneNumero;
        System.out.println("La contraseña es valida: " + passValida);
    }

    public void ejercicio13() {
        /*
        Escribe un programa para calcular el precio de entrada a un museo.
        Pide la edad del usuario y el día de la semana (1=Lunes, 2=Martes... 7=Domingo).
        Las reglas son: Menores de 12 años: entrada gratis.
        Entre 12 y 17 años: 5€ (pero gratis los martes).
        Entre 18 y 64 años: 10€ (pero 7€ los jueves).
        65 años o más: 6€.
        Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu edad");
        int edad = scanner.nextInt();
        System.out.println("Indicame el dia de la semana");
        int dia = scanner.nextInt();
        int calculoEntrada = 0;
        if (edad < 12) {
            calculoEntrada = 0;
        } else if (edad < 17) {
            if (dia == 2) {
                calculoEntrada = 0;
            } else {
                calculoEntrada = 5;
            }
        } else if (edad < 64) {
            if (dia == 4) {
                calculoEntrada = 7;
            } else {
                calculoEntrada = 10;
            }
        } else {
            calculoEntrada = 6;
        }
        String diaSemana = "";

        if (dia == 1) {
            diaSemana = "Lunes";
        } else if (dia == 2) {
            diaSemana = "MArtes";
        } else if (dia == 3) {
            diaSemana = "Miercoles";
        } else if (dia == 4) {
            diaSemana = "Jueves";
        } else if (dia == 5) {
            diaSemana = "Viernes";
        } else if (dia == 6) {
            diaSemana = "Sabado";
        } else if (dia == 7) {
            diaSemana = "Domingo";
        }
        System.out.println("La entrada para la edad indicada es " + calculoEntrada+" para el dia "+diaSemana);

    }
}
