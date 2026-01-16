import model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Persona juan = new Persona("Juan", "Gomez");
        Alumno alumno1 = new Alumno("Borja", "Martin", 1234);
        Alumno alumno2 = new Alumno("Celia", "Martin", 1234);
        Persona alumno3 = new Alumno("Marco", "Lopez", 1234);
        // Profesor profesor1 = new Profesor("Juan", "Gomez", 10000);
        // Persona profesor2 = new Profesor("Maria", "Jimenez", 10000, 7);
        // Profesor profesor3 = new Profesor("Roberto", "Gonzales", 30000, 14);
        Interino interino1 = new Interino("Roberto", "Gonzales", 30000, 1);
        Interino interino2 = new Interino("Maria", "Gonzales", 20000, 1,1);
        Fijo fijo1 = new Fijo("Celia","Gomez",20000,10);
        Fijo fijo2 = new Fijo("Julia","Martin",20000,10,6);
        Director director1 = new Director("Seymour", "Skinner");
        // Inpector inpector = new Inpector() {};


        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(interino1);
        listaPersonas.add(interino2);
        listaPersonas.add(fijo2);
        listaPersonas.add(fijo1);
        listaPersonas.add(director1);

        for (Persona persona : listaPersonas) {
            // persona.saludar();
            // persona.mostrarDatos();
            if (persona instanceof Inpector){
                ((Inpector)persona).realizarInspeccion();
                persona.mostrarDatos();
            }
        }

        /*for (Persona persona : listaPersonas) {
            persona.saludar();
            persona.mostrarDatos();
            if (persona instanceof Alumno) {
                // solo podria llamarse alumno
                ((Alumno) persona).realizarExamen();
            } else if (persona instanceof Profesor) {
                // solo podria llamarse profesor
                ((Profesor) persona).corregirExamen();
            }

        }*/





        /*profesor2.saludar();
        profesor2.corregirExamen();
        profesor2.mostrarDatos();
        */
        // Persona alumno2 = new Alumno("Maria","Lopez",12345);
        // Profesor profesor1 = new Profesor();
        // ArrayList<Persona> lista = new ArrayList()
        // foreach -> Persona -> p.saluda()
        // ((Alumno)alumno2).realizarExamen();
        // alumno2.realizarExamen();
        // alumno2.mostrarDatos();
        // alumno1.saludar();
    }
}
