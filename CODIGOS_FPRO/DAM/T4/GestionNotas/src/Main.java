import controller.Gestor;
import model.Alumno;

public class Main {

    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        gestor.agregarAlumno(new Alumno("Alumno1","Alumno1","123A",1));
        gestor.agregarAlumno(new Alumno("Alumno2","Alumno2","223A",2));
        gestor.agregarAlumno(new Alumno("Alumno3","Alumno3","323A",3));
        gestor.agregarAlumno(new Alumno("Alumno4","Alumno4","423A",4));
        // gestor.calificarAlumnos();
        // gestor.mostrarAlumnos();
        gestor.calcularMedia();
    }
}
