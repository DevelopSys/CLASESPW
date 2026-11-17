import controller.Colegio;
import model.Alumno;

public class Main {

    public static void main(String[] args) {

        Colegio thepw = new Colegio("THEPW"); // n = THEPW a = [null,null,null,null,null]
        // thepw.mostrarAlumnos();
        if (thepw.inscribirAlumno(new Alumno("Borja", "1234A"))) {
            System.out.println("Alumno agregado correctamente");
        } else {
            System.out.println("No hay hueco");
        }

        if (thepw.inscribirAlumno(new Alumno("Marta", "1234A"))) {
            System.out.println("Alumno agregado correctamente");
        } else {
            System.out.println("Fallo en la inscripcion");

        }

        thepw.mostrarAlumnos();


    }
}
