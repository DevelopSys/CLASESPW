/**
 * Clase dedicada a la ejecicion del programa
 */
public class Entrada {
    // TODO. Definir alguna variable
    // definicion de un metodo
    // este metodo es el principal
    /*
        el metodo main es la puerta
        de entrada del programa
     */
    // TODO. Realizar el metodo main

    // mod_acceso retorno nombre(argumentos){
    //  Ejecuciones del metodo
    // }

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        // variable guardar un dato y utilizalo -> tipos nombre valor
        // segun el tipo de dato que tengo guardado: palabras-letras / numeros / boolean
        // segun el origen del dato que tengo guardado: primitivos / complejos

        String nombreLegal = "Borja";
        String apellido1 = "Martin";
        String apellido2 = "Herrera";
        nombreLegal = "Borja M";
        char letra = 'A';
        letra = 'B';
        // byte, short, long
        int edad = 41;
        double altura = 1.74;
        float alturaFloat = 1.74f;
        boolean acierto = false;
        
        // %s -> palabra
        // %d -> numero sin decimales
        // %f -> numero con decimales
        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años", nombreLegal, apellido1, apellido2, edad);
        // INSERT INTO alumnos (name, surname, email, phone, address, nia, work_phone) VALUES ('Borja', 'Martin',41,'asdasd@asdasd.com')
    }


}