import controller.*;
import java.util.Scanner;

// necesito funcionalidad de otra clase
// import controller.GestorDocumentan
public class Main {

    public static void main(String[] args) {
        System.out.println("Ejecutables");
        Scanner scanner = new Scanner(System.in);
        GestorDocumental gestorDocumental = new GestorDocumental();
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.evaluarUsuario("");
        gestorDocumental.archivarDocumento("");

        //GestorDocumental.gestionarStatico();

    }

}
