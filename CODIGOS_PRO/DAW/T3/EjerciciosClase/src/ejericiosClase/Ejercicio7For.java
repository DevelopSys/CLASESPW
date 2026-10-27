package ejericiosClase;


import java.util.Random;
import java.util.Scanner;

/*
Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo o mayor que 0,
 se establecerá a 100)
y se mostrará el resumen de los lanzamientos. Se mostraán cuantas veces ha salido cada número. (Dado)
 */
public class Ejercicio7For {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas veces vas a tirar el dado");
        int veces = lector.nextInt();
        /*if(veces<=0){
            veces = 100;
        }*/
        veces = veces < 1 ? 100 : veces;
        int veces1 = 0, veces2 = 0, veces3 = 0, veces4 = 0, veces5 = 0, veces6 = 0;
        for (int i = 0; i < veces; i++) {
            Random random = new Random();
            // 1-6
            // int aleatorio = random.nextInt(6)+1;
            // 0.0 - 0.99
            // 0.0-10.999
            int aleatorio = (int) (Math.random() * 6) + 1;
            switch (aleatorio){
                case 1-> veces1++;
                case 2-> veces2++;
                case 3-> veces3++;
                case 4-> veces4++;
                case 5-> veces5++;
                case 6-> veces6++;
            }
        }

        System.out.println("El numero de veces del 1 es "+veces1);
        System.out.println("El numero de veces del 2 es "+veces2);
        System.out.println("El numero de veces del 3 es "+veces3);
        System.out.println("El numero de veces del 4 es "+veces4);
        System.out.println("El numero de veces del 5 es "+veces5);
        System.out.println("El numero de veces del 6 es "+veces6);

        // el uno ha salido X veces
        // el dos ha salido X veces
    }
}
