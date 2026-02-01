package controller;

import model.Alumno;

import javax.lang.model.type.MirroredTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.OptionalDouble;

public class Gestor {
    private ArrayList<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor() {
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    }

    // agregar un alumno
    // solo se pueden agregar alumnos con un dni que no este ya en la lista
    public void agregarAlumno(Alumno alumno) {
        /*
        if(alumnosMap.containsKey(alumno.getDni())){
            System.out.println("No se puede agregar");
        } else {
            alumnosMap.put(alumno.getDni(),alumno);
            System.out.println("Agregado correctamente");
        }
        // el put retorna un null si lo puede agregar
        // el put retorna un Alumno si no lo puede agregar
        Alumno agregado = alumnosMap.put(alumno.getDni(), alumno);
        if(agregado==null){
            System.out.println("Alumno agregado correctamente");
        } else {
            System.out.println("Alumno no agregado correctamente, dni duplicado");
        }  */
        /*
        for (Alumno item: alumnos) {
            if(item.getDni().equals(alumno.getDni())){
                System.out.println("No puedo");
                return;
            }
        }
        alumnos.add(alumno);*/
        /*
        alumnos  ----------------
        stream   ----------------
        anyMatch true/false
        filter   -------

         */
        boolean esta = alumnos.stream().anyMatch(item -> item.getDni().equals(alumno.getDni()));
        if (alumnos.stream().anyMatch(item -> item.getDni().equals(alumno.getDni()))) {
            System.out.println("El dni esta en la lista, no se puede agregar");
        } else {
            System.out.println("Usuario agregado con existo");
            alumnos.add(alumno);
        }
        /*alumnos.forEach(item -> {
            if (item.getDni().equals(alumno.getDni())){

            }
        });*/
    }

    public void mostrarAlumnos() {
        /*
        alumnos.forEach(item -> {
            if (item.getNota() >= 5) {
                item.mostrarDatos();
            }
        });

         */
        alumnos.forEach(Alumno::mostrarDatos);
        // alumnosMap.values().forEach(Alumno::mostrarDatos);
    }

    public void calificarAlumnos() {
        /*
        alumnos ---------------
        stream  x--x---x-------
         */
        alumnos.forEach(item -> {
            if(item.getNota()==-1){
                item.setNota((int) (Math.random() * 11));
            }
        });
    }

    public void calcularMedia(){
        // variable sumatorio
        // foreach
        // suma
        // divido
        double acumulador=0;
        // alumnos.stream().map(item->item.getNota()).forEach(item->acumulador+=item)/size;
        // double media = alumnos.stream().mapToDouble(Alumno::getNota).sum()/alumnos.size();
        OptionalDouble media = alumnos.stream().mapToDouble(Alumno::getNota).average();
        // alumnos.stream().map(Alumno::getNota).mapToDouble().
        System.out.println(media.getAsDouble());
        /*
        alumnos       ---------------
        stream        ---------------
        mapDouble     ---------------
         */
    }
}
