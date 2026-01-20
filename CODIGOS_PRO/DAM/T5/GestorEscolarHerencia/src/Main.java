import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al gestor escolar");
        /*Fijo fijo1 = new Fijo("Profesor1","Apellido1",10000,3000,30);
        Fijo fijo2 = new Fijo("Profesor2","Apellido2",20000);
        Interno interno = new Interno("ProfeInterino1", "ApellidoInterino1",4000,1,1);
        interno.realizarOposion();
        interno.mostrarDatos();*/
        Fijo fijo2 = new Fijo("Profesor2","Apellido2",20000);
        // fijo2.realizarInspeccion(3);
        Interno interno = new Interno("ProfeInterino1", "ApellidoInterino1",4000,1,1);
        // interno.mostrarDatos();
        Director director = new Director("Director1","Apellido1");
        // director.realizarInspeccion(2);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(fijo2);
        listaPersonas.add(interno);
        listaPersonas.add(director);

        for ( Persona persona : listaPersonas) {
            if(persona instanceof Inspector){
                ((Inspector) persona).realizarInspeccion(5);
            }

            if(persona instanceof Manifestable){
                ((Manifestable) persona).manifestar();
            }
        }


        // Profesor profesor = new Profesor();

        /*Persona borja = new Persona("Borja", "Martin");
        borja.saludar();
        borja.mostrarDatos();*/

        /*lumno alumno1 = new Alumno("Borja1", "Martin", 1234, "DAM");
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
        }*/

        /*alumno.setNombre("Borja");
        alumno.setApellido("Martin");
        alumno.setCurso("DAM");
        alumno.setnMatricula(1234);*/
        // alumno.mostrarDatos();
        // alumno.realizarExamen();
        // nombre =   apellido =

    }
}
