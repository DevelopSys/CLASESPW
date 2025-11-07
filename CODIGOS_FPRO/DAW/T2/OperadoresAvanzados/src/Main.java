
// import nombrePaquete.NombreClase
// import controller.GestorDocumentos
// import controller.GestorUsuarios
// import controller.*
import controller.*;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuario("Borja",41,"borja@gmail.com");*/
        /*GestorDocumentos gestorDocumentos1 = new GestorDocumentos();
        GestorDocumentos gestorDocumentos2 = new GestorDocumentos();
        // gestorDocumentos.imprimirFactura(12);
        gestorDocumentos1.ejecutarDocumento();
        gestorDocumentos1.ejecutarDocumento();
        gestorDocumentos1.verConsultas(); // 2

        gestorDocumentos2.ejecutarDocumento();
        gestorDocumentos2.ejecutarDocumento();
        gestorDocumentos2.verConsultas(); // 4

        gestorDocumentos1.verConsultas(); // 4*/
        // CASTING
        // int -> double
        // double -> int
        // AutoBoxing
        // Integer numero = 20;
        // UnBoxing
        // Integer numero1 = 20;
        // int numeroBase = numero1;
        // PARSING
        // String -> int
        // String -> boolean
        // ARIMETICOS -> + - * / %
        // ASIGNACION -> = += -= *= /= %=
        // RELACIONALES < <= > >= == !=
        // LOGICOS && (AND)  || (OR)
        /*
                int numero1 = 5;
        int nuermo2 = 6;
        int resultado = numero1 & nuermo2;
        System.out.println("El resultado de la comparacion & a nivel de bit es "+resultado);
        resultado = numero1 | nuermo2;
        System.out.println("El resultado de la comparacion | a nivel de bit es "+resultado);
        String palabra = null;
        int comparar1 = 1111111111111101;
        int comparar2 = 1111111111111120;
        ^
        boolean resultadoComparacion = comparar1>comparar2 && comparar1>=0 && comparar2<100 && palabra.length()==0;
        // System.out.println(palabra.length()); // me ha dado fallo porque esto es null.length, por lo tanto error NullPointerException
        System.out.println("El resultado de la comparacion boorleana es "+resultadoComparacion);
         */
        /*
        String palabra1 = "Borja";
        String palabra2 = "borja";
        boolean resultadoPalabras = palabra1.equalsIgnoreCase(palabra2);
        System.out.println("El resultado de comparar las dos palabras es "+resultadoPalabras);*/

        /*
        // CASTEO -> pasar temporalmente una variable de un tipo a otro (double)variable
        int numero = 69;
        System.out.println("El numero correspodiente es: "+numero);
        char letra = (char) numero;
        System.out.println("Esta es la letra correspondiente a "+letra);
        char letraByte = 'A';
        int numeroLetra = letraByte;
        System.out.println("Esta es la letra correspondiente a "+numeroLetra);
        char utlimoNumeroASCII = 56121;
        System.out.println("El ultimo numero ASCII es "+utlimoNumeroASCII);
        String palabraCifrar = "Esta frase la quiero cirar";
        for (int i = 0; i < palabraCifrar.length(); i++) {
            int codigo = palabraCifrar.charAt(i);
            if(i%2==0){
                codigo*=2;
            } else {
                codigo*=3;
            }
            System.out.print(codigo +" ");
        }*/


        // Recolector de basura -> recopilar todas las variables o elementos del codigo que no se utilice y tengan
        // un valor de null
        String nombre = "Borja";
        System.out.println(nombre);
        boolean esCorreo = nombre.contains("@");
        System.out.println("El nombre es; "+nombre);
        System.out.println("Es correo; "+esCorreo);
        nombre = null; // candidata a ser capturada por el gc
        System.gc(); // fuerza la recoleccion de elementos en null
        nombre = "asd";

    }
}
