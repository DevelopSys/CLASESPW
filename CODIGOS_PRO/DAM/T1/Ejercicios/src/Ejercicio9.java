import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas bebidas pides");
        int nBebidas = lector.nextInt();
        System.out.println("Cuanto vale cada bebida");
        double bebidaUnidad = lector.nextDouble(); // ,
        System.out.println("Cuantas bocatas pides");
        int nBocatas = lector.nextInt();
        System.out.println("Cuanto vale cada bocata");
        double bocataUnidad = lector.nextDouble(); // ,
        System.out.println("Cuantos sois");
        int comensales = lector.nextInt();
        lector.close();
        double costeBebidas = nBebidas * bebidaUnidad;
        double costeBocatas = nBocatas * bocataUnidad;
        double costeTotal = costeBebidas + costeBocatas;
        double costeIndividual = costeTotal / comensales;
        System.out.println("ARTICULO\t\t\t\tCANTIDAD\t\t\t\tPRECIO\t\t\t\tCOSTE");
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n","Bebida",nBebidas,bebidaUnidad,costeBebidas);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n","Bocata",nBocatas,bocataUnidad,costeBocatas);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%d\t\t\t\t\t%.2f\n","Unidad",comensales,comensales,costeIndividual);
        System.out.printf("%s\t\t\t\t\t%.1f\t\t\t\t\t%.1f\t\t\t\t\t%.2f\n","Total",1.0,1.0,costeTotal);

    }
}
