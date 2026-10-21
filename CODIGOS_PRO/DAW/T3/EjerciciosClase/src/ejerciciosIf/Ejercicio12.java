package ejerciciosIf;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica la contraseña a validar");
        String pass = lector.next();
        System.out.println("Procedemos a validar la pass");
        boolean longitudValida = pass.length() >= 8;
        // asd
        boolean contenidoValida = !pass.equalsIgnoreCase("12345678") && !pass.equalsIgnoreCase("password");
        int contador = 0;
        // asdasdasd1
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))){
                contador++; // cuantos numeros tengo
            }
        }
        boolean numeroValida = contador>=1;
        boolean valida = numeroValida && contenidoValida && longitudValida;
        if(valida){
            System.out.println("La pass cumple todos los requisitos");
        } else {
            System.out.println("La pass no es valida");
        }
        // numeroValida = pass.contains("1")||pass.contains("2");
        // regex

        /*
        tener al menos 8 caracteres de longitud,
        contener al menos un número, y NO puede ser "12345678" o "password".
         */
    }
}
