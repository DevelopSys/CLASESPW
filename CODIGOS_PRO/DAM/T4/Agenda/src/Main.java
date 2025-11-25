import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre de la persona");
        String nombre = scanner.next();
        System.out.println("Dime el apellido de la persona");
        String apellido = scanner.next();
        System.out.println("Dime el correo de la persona");
        String correo = scanner.next();
        System.out.println("Dime el telefono de la persona");
        int telefono = scanner.nextInt();
        // nombre,apellido,correo,telefono
        Object[] persona1 = new Object[]{nombre,apellido,correo,telefono};
        Objecto[][] personas new Object[][]
        System.out.println("los datos del usuario son:");
        for ( Object item : persona1 ) {
            System.out.println(item);
        }*/
        int[][] numeros = new int[4][4];
        // 0 0 0 0
        // 0 0 0 0
        // 0 0 0 0
        // 0 0 0 0
        //System.out.println(numeros[2][1]);
        // numeros[2][0] = 20;
        // numeros.length -> cuantas filas
        // numeros[0].length -> cuantas columnas tiene la fila indicada (0)
        // rellenamos
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                // System.out.print(numeros[i][j] + "\t");
                // 0,0 0,1 0,2 0,3
                // 1,0 1,1 1,2
                // 2,0 2,1 2,2
                // 3,0 3,1 3,2 3,3
                numeros[i][j] = (int) (Math.random()*16)+1; // 1-16
            }
        }
        // mostramos
        for ( int[] fila : numeros ) {
            for ( int  item: fila) {
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

        /*
        final int dato = 2;
        switch (true){
            case dato<2->{}
            case dato>=2->{}

        }

         */
    }
}
