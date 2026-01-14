import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al gestor escolar");

        /*Persona borja = new Persona("Borja", "Martin");
        borja.saludar();
        borja.mostrarDatos();*/

        Alumno alumno1 = new Alumno("Borja1", "Martin", 1234, "DAM");
        Alumno alumno2 = new Alumno("Borja2", "Martin", 1234, "DAM");
        Alumno alumno3 = new Alumno("Borja3", "Martin", 1234, "DAM");
        Alumno alumno4 = new Alumno("Borja4", "Martin", 1234, "DAM");
        Profesor profesor1 = new Profesor("Maria1", "Lopez", 30000, 6);
        Profesor profesor2 = new Profesor("Maria2", "Lopez", 30000, 6);
        Profesor profesor3 = new Profesor("Maria3", "Lopez", 30000, 6);
        Profesor profesor4 = new Profesor("Maria4", "Lopez", 30000, 6);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno4);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);
        listaPersonas.add(profesor4);

        for (Persona persona : listaPersonas) {
            persona.saludar();
            persona.mostrarDatos();

            // CASTEO
            if (persona instanceof Alumno) {
                ((Alumno) persona).realizarExamen();
            } else if (persona instanceof Profesor) {
                ((Profesor) persona).corregirExamen();
            }
            // ((Alumno)persona).realizarExamen();
            // ((Profesor)persona).corregirExamen();
            // persona.realizarExamen(); // solo si soy alumno
            // persona.corregirExamen(); // solo si soy profesor
        }


        /*alumno.setNombre("Borja");
        alumno.setApellido("Martin");
        alumno.setCurso("DAM");
        alumno.setnMatricula(1234);*/
        // alumno.mostrarDatos();
        // alumno.realizarExamen();
        // nombre =   apellido =

    }
}
