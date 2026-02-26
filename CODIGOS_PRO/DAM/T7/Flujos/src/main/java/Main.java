import controller.GestorFicheros;
import model.Usuario;

public class Main {

    public static void main(String[] args) {
        GestorFicheros gestor = new GestorFicheros();
        // gestor.crearFichero("src/main/java/recursos/escritura.txt");
        // gestor.crearCarpeta("src/main/java/recursos/cosa/ejemplo");
        // gestor.lectorFichero("src/main/java/recursos/lectura.txt");
        // gestor.lectorLineas("src/main/java/recursos/lectura.txt");
        // gestor.escribirCaracteres("src/main/java/recursos/escritura.txt");
        //gestor.escribirLineas("src/main/java/recursos/escritura.txt");
        // gestor.codificarMensaje("src/main/java/recursos/codificado.txt");
        // gestor.descifrarMenasje("src/main/java/recursos/codificado.txt");
        // gestor.escribirObjetos();
        // gestor.leerObjeto();
        // gestor.escribirUsuario(new Usuario("Borja","Martin","123123"));
        gestor.leerUsuario();
    }
}
