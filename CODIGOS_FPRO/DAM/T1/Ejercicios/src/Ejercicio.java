import java.util.Scanner;

public class Ejercicio {
    private Scanner lecturaTeclado; // null
    /*
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales. (CosteBar)
     */
    public void ejercicio1(){
        // 1. Introducir valores
        // 2. Guardar en variables
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos bocatas vais a pedir");
        int numeroBocatas = lecturaTeclado.nextInt();
        System.out.println("Cuantos bebidas vais a pedir");
        int numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuanto cuesta cada bocatas");
        double precioBocata = lecturaTeclado.nextDouble();
        System.out.println("Cuanto cuesta cada bebida");
        double precioBebida = lecturaTeclado.nextDouble();
        System.out.println("Cuantas personas entran en la cuenta");
        int personas = lecturaTeclado.nextInt();
        // 3. Realizar calculos
        double precioBocatas = numeroBocatas*precioBocata;
        double precioBebidas = numeroBebidas*precioBebida;
        double costeTotal = precioBocatas+precioBebidas;
        // int/int -> int
        double precioPersona = costeTotal/personas;
        // 4. Mostrar datos
        System.out.printf("El precio de los bocatas es %.2f%n",precioBocatas);
        System.out.printf("El precio de los bebidas es %.2f%n",precioBebidas);
        System.out.printf("El precio total es %.2f%n",costeTotal);
        System.out.printf("El precio por persona es %.2f%n",precioPersona);
        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    /*
    Hágase un programa que convierta segundos en horas, minutos y segundos.
     */
    public void ejercicio4(){
        lecturaTeclado = new Scanner(System.in);
        // 1- pedir datos
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int seguntosTotal = lecturaTeclado.nextInt(); // 24973
        // 2- realizar calculos
            // segundos -> 1 hora -> 3600
            // minutos -> 1 hora -> 60
            // segundos -> 1 minuto -> 60
        int horas = seguntosTotal/3600;
        int minutos = (seguntosTotal%3600)/60;
        int segundo = seguntosTotal%60;
        // 3- mostrar datos
        System.out.println("El numero de horas es "+horas);
        System.out.println("El numero de minutos es "+minutos);
        System.out.println("El numero de segundos es "+segundo);
        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public void ejercicio3(){
        // 79050
        /*
        Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
        centenas, decenas y unidades), y se obtiene el número correspondiente.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un numero de 5 digitos");
        int numeroAnalizar = scanner.nextInt();
        if (numeroAnalizar >9999 && numeroAnalizar<100000){
        // 79050
            int decenasMil = numeroAnalizar/10000; // 7,9050
            // decenas de mil
            int unidadesMil = (numeroAnalizar%10000)/1000; // 9,050
            // unidades mil
            int centenas = ((numeroAnalizar%10000)%1000)/100; //0,50
            // centenas
            int decenas = (((numeroAnalizar%10000)%1000)%100)/10; // 5,0
            // decenas
            int unidades = (((numeroAnalizar%10000)%1000)%100)%10; // 0
            // unidades
        } else {
            System.out.println("Numero incorrecto");
        }

        // 98765 -> "98765"
        String numeroPalabra = String.valueOf(numeroAnalizar);
        int decenasMil = Integer.parseInt(String.valueOf(numeroPalabra.charAt(0)));
        String unidadesMil = String.valueOf(numeroPalabra.charAt(1));
        String centenas = String.valueOf(numeroPalabra.charAt(2));
        String decenas = String.valueOf(numeroPalabra.charAt(3));
        String unidades = String.valueOf(numeroPalabra.charAt(4));


    }
}
