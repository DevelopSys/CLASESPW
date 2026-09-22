

/**
 * @author borja
 * @version 1.0
 */
public class Entrada {
    // aqui explicas BREVEMENTE algo para aclararte las ideas
    // TODO esta tarea la dejo pendiente para el martes
    // en esta otra linea hago una claracion diferente
    /*
    Este comentario admite unas cuantas lineas
    Esta es la segunda linea
     */
    // TODO esta tarea la dejo pendiente para el lunes
    // mod_acceso retorno nombre (args){ funcionalidad }
    public static void main(String[] args) {

        // variables:
            // segun el dato que guarda: String, char, byte/shot/int/long, double/float, boolean

        // tipo nombre = valor
        String nombreLegal = "Borja";
        nombreLegal = "Borja M";
        char letra = 'a';
        int edad = 41;
        double altura = 1.74;
        // float alturaFloat = 1.74f;
        boolean acierto = true;
        // ordenes
        System.out.println("Mi nombre es "+nombreLegal);
        System.out.println("La letra de mi DNI es "+letra);
        System.out.println("El resultado de la evaluacion es "+acierto);
        System.out.println("Hola Mundo");
        System.out.println('a');
        System.out.println(9*6);
        System.out.println(true);
        System.out.println(7.98);
        System.out.println("Segunda linea");
        System.out.println("Tercera linea de codigo");
        System.out.print("\tCuarta linea\n");
        System.out.print("Quinta linea");
        // la suma de 9 y 6 es 15
        System.out.println("La suma de "+9+" y "+6+" tiene como resultado "+ (9+6));


    }




    /**
     * @param arg explica el parametro
     * @return explicate el retort
     */
    public int metodo(String arg) {
        return 1;
    }
}