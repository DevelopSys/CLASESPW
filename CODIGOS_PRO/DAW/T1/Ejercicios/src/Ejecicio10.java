import java.util.Scanner;

public class Ejecicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica dmillar");
        int dmillar = lector.nextInt();
        System.out.println("Indica umillar");
        int umillar = lector.nextInt();
        System.out.println("Indica centenas");
        int centenas = lector.nextInt();
        System.out.println("Indica decenas");
        int decenas = lector.nextInt();
        System.out.println("Indica unidades");
        int unidades = lector.nextInt();
        System.out.println("Numero introducido " + dmillar + umillar + centenas + decenas + unidades);
        System.out.println("" + dmillar + umillar + centenas + decenas + unidades);
        System.out.println(dmillar + umillar + centenas + decenas + unidades);
        System.out.println("Ahora indica un numero completo");
        int numeroUsuario = lector.nextInt(); // 87654
        lector.close();
        System.out.println("cuantos numeros hay "+String.valueOf(numeroUsuario).length() );
        dmillar = numeroUsuario/10000; // 8,7654
        umillar = (numeroUsuario%10000)/1000; // 7,654
        centenas = ((numeroUsuario%10000)%1000)/100; // 6,54
        decenas = (((numeroUsuario%10000)%1000)%100)/10; // 5,4
        // unidades = (((numeroUsuario%10000)%1000)%100)%10; // 4
        unidades = numeroUsuario%10; // 8765,4
        System.out.println("El numero es ");
        System.out.println("dmillar "+dmillar);
        System.out.println("umillar "+umillar );
        System.out.println("centenas "+centenas);
        System.out.println("decenas "+decenas);
        System.out.println("unidades "+unidades);
    }
}
