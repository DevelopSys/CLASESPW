import controller.Gestor;
import model.Alumno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        gestor.agregarAlumno(new Alumno("Alumno2", "Alumno2", "223A", 7));
        gestor.agregarAlumno(new Alumno("Alumno4", "Alumno4", "423A", 9));
        gestor.agregarAlumno(new Alumno("Alumno3", "Alumno4", "423A", 10));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "123A", 1));
        gestor.agregarAlumno(new Alumno("Alumno3", "Alumno3", "323A", 6));
        gestor.agregarAlumno(new Alumno("Alumno3", "Alumno5", "523A", 2));
        // gestor.calificarAlumnos();
        // gestor.mostrarAlumnos();
        // gestor.calcularMedia();
        // System.out.println(gestor.getNumeroAprobados());
        // gestor.getAprobados().forEach(Alumno::mostrarDatos);
        /*if (gestor.getAlumnoByDNI("123B").isPresent()){
            System.out.println("El usuarios esta");
        } else {
            System.out.println("El usuarios no esta");
        }*/
        String dni = "678B";
        // gestor.getAlumnoByDNI(dni).ifPresent(Alumno::mostrarDatos);
        gestor.getAlumnoByDNI(dni).ifPresentOrElse(Alumno::mostrarDatos,
                () -> gestor.agregarAlumno(new Alumno("Nuevo", "Nuevo", dni, 4)));
        // gestor.ordenarNotas();
        // gestor.mostrarAlumnos();
        // gestor.getAlumnosUmbral(6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que nota quires como umbral");
        int umbra= scanner.nextInt();
        gestor.getAlumnosUmbral((item,nota)-> item.getNota()>nota,umbra);
        gestor.getAlumnosUmbral((item,nota)-> item.getNota()<nota,8);
        gestor.getAlumnosUmbral((item,nota)-> (item.getNota()*2)/3<nota,8);
    }
}
