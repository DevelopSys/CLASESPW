import controller.Colegio;
import model.Alumno;
import util.NotaException;

public class Main {

    public static void main(String[] args) {

        /*Alumno a = new Alumno();
        Alumno alumno = new Alumno("Borja", "1234A"); // Borja 1234A -1
        Alumno alumno1 = new Alumno("Marta", "1234B"); // Marta 1234B-1
        alumno.mostrarDatos();*/
        // alumno.setNota(100);
        Colegio thpw = new Colegio("THEPW"); // [null,null,null,null,null]
        thpw.inscribirAlumno(new Alumno());
        thpw.listarAlumnos();


    }
}
