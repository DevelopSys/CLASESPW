

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
    String cosa = "asdasd";
    public static void main(String[] args) {

        // variables:
            // segun el dato que guarda: String, char, byte/shot/int/long, double/float, boolean
            // segun la forma de construirse: primitivos (solo guarda el valor) / complejos (ademas del valor y la funcionadad)
            // segun la mutabilidad del dato: mutables / no mutables (constante)
            // segun el scope de la variable: metodo (bloque) / clase

        // tipo nombre = valor
        final String DNI = "123A";
        System.out.println("Mi dni es: " +DNI);
        String nombreLegal = new String("Borja");
        nombreLegal = "Borja M";
        char letra = 'a';
        Character letraCompleta = 'a';
        // byte, short, long
        int edad = 41;
        edad = 43;
        Integer numeroComplejo = 2;
        double altura = 1.74;
        // float alturaFloat = 1.74f;
        Double alturaCompleto = 1.98;
        boolean acierto = false;
        Boolean aciertoCompleto = true;

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



        System.out.println(acierto);
    }




    /**
     * @param arg explica el parametro
     * @return explicate el retort
     */
    public int metodo(String arg) {

        System.out.println(cosa);
        return 1;
    }
    public int metodo1(String arg) {
        System.out.println(cosa);
        return 1;
    }
}