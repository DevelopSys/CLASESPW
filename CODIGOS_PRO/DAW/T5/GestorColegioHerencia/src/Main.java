import model.Alumno;
import model.Persona;

public class Main {

    public static void main(String[] args) {
        // Persona juan = new Persona("Juan", "Gomez");
        Alumno alumno1 = new Alumno("Borja", "Martin",1234);
        Persona alumno2 = new Alumno("Maria","Lopez",12345);
        // Profesor profesor1 = new Profesor();
        // ArrayList<Persona> lista = new ArrayList()
        // foreach -> Persona -> p.saluda()
        ((Alumno)alumno2).realizarExamen();
        // alumno2.realizarExamen();
        // alumno2.mostrarDatos();
        // alumno1.saludar();
    }
}
