import controller.Gestor;
import model.Alumno;

public class Main {

    public static void main(String[] args) {
        // lista de elementos
        Gestor gestor = new Gestor();
        gestor.agregarUsuario(new Alumno("Alumno1","Alumno1","123A",11));
        gestor.agregarUsuario(new Alumno("Alumno2","Alumno2","223B",12));
        gestor.agregarUsuario(new Alumno("Alumno3","Alumno3","323B",13));
        gestor.agregarUsuario(new Alumno("Alumno4","Alumno4","423B",14));
        gestor.agregarUsuario(new Alumno("Alumno5","Alumno5","523B",15));
        gestor.calificarAlumnos();
        // gestor.mostrarUsuarios();
        gestor.calcularNotaMedia();
    }
}
