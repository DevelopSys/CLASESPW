import controller.Colegio;
import model.Alumno;
import utils.NotaException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Colegio thepw = new Colegio("THEPW"); // n = THEPW a = [null,null,null,null,null]
        // thepw.mostrarAlumnos();
        try (Scanner scanner = new Scanner(System.in)) {

            int opcion;
            do {

                System.out.println("1. Agregar alumno");
                System.out.println("2. Expulsar alumno");
                System.out.println("3. Buscar alumno");
                System.out.println("4. Mostra alumnos");
                System.out.println("5. Calificar alumno");
                System.out.println("6. Ordenar aprobados / suspenso");
                System.out.println("7. Salir");
                System.out.println("Que quieres hacer");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Indica el nombre del alumno");
                        String nombre = scanner.next();
                        System.out.println("Indica el dni");
                        String dni = scanner.next();
                        Alumno alumno = new Alumno(nombre, dni); // -1
                        if (thepw.inscribirAlumno(alumno)) {
                            System.out.println("Agregado correctamente");
                        } else {
                            System.out.println("Fallo en agregar");
                        }
                    }
                    case 2 -> {
                        System.out.println("Indica el dni del alumno que quieres expulsar");
                        String dni = scanner.next();
                        Alumno eliminado = thepw.eliminarAlumno(dni);
                        if (eliminado != null) {
                            System.out.println("El alumno eliminado correctamente, con nombre: " + eliminado.getNombre());
                        } else {
                            System.out.println("No hay alumno con ese dni");
                        }
                    }
                    case 3 -> {
                        System.out.println("Indica el dni del usuario que quieres buscar");
                        String dni = scanner.next();
                        Alumno alumnoEncontrado = thepw.buscarAlumno(dni);
                        if (alumnoEncontrado != null) {
                            System.out.println("Los datos del alumno encontado son");
                            alumnoEncontrado.mostrarDatos();

                        } else {
                            System.out.println("El dni no esta en la lista");
                        }
                    }
                    case 4 -> thepw.mostrarAlumnos();
                    case 5 -> {
                        System.out.println("Indica el dni del alumno a calificar");
                        String dni = scanner.next();
                        boolean fallo = false;
                        do {
                            System.out.println("Indica la nota que quieres calificar");
                            double nota = scanner.nextDouble();
                            try {
                                thepw.calificarAlumno(dni, nota);
                                fallo = false;
                            } catch (NotaException e) {
                                System.out.println(e.getMessage());
                                fallo = true;
                            }
                        } while (fallo);
                    }
                    case 6 -> {
                    }
                    case 7 -> System.out.println("Saliendo");
                }
            } while (opcion != 7);
        }


    }
}
