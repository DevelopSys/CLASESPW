import controller.Colegio;
import model.Alumno;
import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

/*
Enunciado: Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

- Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
- Alumno: tres Asignatura; constructores con 3 Asignatura o con 3 ids.
- Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
        - Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.*/
public class Main {

    public static void main(String[] args) {
        /*
        Asignatura programacion = new Asignatura(4);
        // id = 4, calificacion = 0
        Asignatura sistemas = new Asignatura(5);
        // id = 5, calificacion = 0
        Asignatura marcas = new Asignatura(6);
        // id = 6, calificacion = 0
        */

        /*ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Profesor profesor = new Profesor();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Introduce el nombre del alumno");
            String nombre = scanner.next();
            listaAlumnos.add(new Alumno(i, nombre, new Asignatura(1), new Asignatura(2), new Asignatura(3)));
        }
        System.out.println("Vamos a proceder a poner las notas de todos los alumnos.");
        for (Alumno item : listaAlumnos) {
            profesor.ponerNotas(item);
            item.mostrarDatos();
            System.out.println("La media del alumno es "+profesor.calcularMedia(item));
        }*/

        /*
        Alumno borja = new Alumno (1,2,3);
        // as1 => id = 1, calificacion = 6, as2 => id = 2, calificacion = 10, as3 => id = 3, calificacion = 0
        // borja.mostrarDatos();
        Alumno celia = new Alumno(new Asignatura(4),new Asignatura(5),new Asignatura(6));
        // as1 => id = 4, calificacion = 6, as2 => id = 5, calificacion = 10, as3 => id = 6, calificacion = 0
        Alumno claudia = new Alumno(new Asignatura(4),new Asignatura(5),new Asignatura(6));
        // as1 => id = 4, calificacion = 6, as2 => id = 5, calificacion = 10, as3 => id = 6, calificacion = 0
        Profesor profesor = new Profesor();
        profesor.ponerNotas(borja);
        profesor.ponerNotas(celia);
        System.out.println("La media obtenida por celia es "+profesor.calcularMedia(celia));
        System.out.println("La media obtenida por borja es "+profesor.calcularMedia(borja));
        System.out.println("La media obtenida por claudia es "+profesor.calcularMedia(claudia));*/
        Scanner scanner = new Scanner(System.in);
        Colegio colegio = new Colegio();
        // alumnos = [], profesor = p
        // Colegio colegio1 = new Colegio(new Profesor());

        int opcion = 0;
        do{

            System.out.println("1- Matricular alumno");
            System.out.println("2- Poner notas alumnos");
            System.out.println("3- Ver notas alumnos y media");
            System.out.println("4- Buscar expediente");
            System.out.println("5- Salir");
            System.out.println("que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Procedemos a matricular");
                    System.out.println("Indica el nombre del alumno a matricular");
                    String nombre = scanner.next();
                    colegio.matricularAlumno(nombre);
                }
                case 2->{
                    colegio.ponerNotas();
                }
                case 3->{
                    colegio.mostrarDatos();
                }
                case 4->{
                    System.out.println("Indicame la matricula del alumno a buscar");
                    int nAlumno = scanner.nextInt();
                    colegio.buscarExpediente(nAlumno);
                }
                case 5->{
                    System.out.println("Saliendo....");
                }
            }
        }while (opcion!=5);

    }


}
