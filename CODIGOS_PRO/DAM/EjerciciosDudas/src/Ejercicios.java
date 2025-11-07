import java.util.Scanner;

public class Ejercicios {

    public void ejercicioT310(){
        /*

        Crea un programa que pida la altura del usuario (en cm)
        y determine si puede subir a una atracción.
        La altura mínima es 120 cm y la máxima es 200 cm.
        Si está dentro del rango, muestra "Puedes subir", si no, i
        ndica el motivo (demasiado bajo o demasiado alto).

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la altura en cm");
        int altura = scanner.nextInt();
        int alturaMax = 220, alturaMin= 120;
        if (altura>=alturaMin && altura<=alturaMax){
            System.out.println("Perfecto puedes subir");
        } else if (altura<alturaMin) {
            System.out.println("Demasiado bajito para subir");
        } else {
            System.out.println("Demansiado alto para subir");
        }
    }
    public void ejercicioT312() {
        /*
        Crea un programa que pida al usuario crear una contraseña.
        La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres de longitud,
        contener al menos un número, y NO puede ser "12345678" o "password".
        El programa debe verificar cada condición por separado usando operadores lógicos y mostrar
        si la contraseña es válida o no, indicando qué requisitos no cumple.
            Nota: Para este ejercicio, asume que tienes funciones auxiliares
            como longitudCadena(texto), contienNumero(texto).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que contraseña quieres evaluar");
        String contrasenia = scanner.next();

        boolean requisitoLong = longCadena(contrasenia) >= 8; // cuantas letras tiene la palabras
        boolean contieneNumero = contieneNumero(contrasenia);
        boolean passInvalida = contrasenia.equals("passwood") || contrasenia.equals("12345678");
        System.out.println("Rquisito long: "+requisitoLong);
        System.out.println("Rquisito numero: "+contieneNumero);
        System.out.println("Rquisito pass invalida: "+passInvalida);
        boolean passOK = requisitoLong && contieneNumero && !passInvalida;
        System.out.println("La evaluacion general es "+passOK);
    }
    private int longCadena (String cadena){
        return cadena.length();
    }

    private boolean contieneNumero(String cadena){
        return cadena.contains("1") || cadena.contains("2") || cadena.contains("3")
                || cadena.contains("4") || cadena.contains("5") || cadena.contains("6")
                || cadena.contains("7") || cadena.contains("8") || cadena.contains("9")
                || cadena.contains("0");
    }
}
