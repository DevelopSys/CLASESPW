package controller;

import model.Alumno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;

public class Gestor {
    private ArrayList<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor() {
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    }

    // agregar usuarios
    public void agregarUsuario(Alumno alumno) {
        // solo se puede agregar si el dni que me dices no esta en el mapa
        // if()
        // lanzar una excepcion
        // si lo agregas y no esta retorno un nulo
        // si lo agregas y esta retorno el que esta
        /*
        Alumno alumnoAgregado = alumnosMap.put(alumno.getDni(),alumno);
        if(alumnoAgregado!=null){
            System.out.printf("DNI %s duplicado, error en el proceso%n",alumno.getDni());
        } else {
            System.out.printf("Alumno con nombre %s agregado correctamente%n",alumno.getNombre());
        }

         */
        // recorro y pregunto en iteracion
        /*
        for (Alumno a : alumnos ) {
            if (a.getDni().equals(alumno.getDni())){

            }
        }*/
        boolean esta = alumnos.stream()
                .anyMatch(element -> element.getDni().equals(alumno.getDni()));
        if (esta) {
            System.out.println("No puedo utilizar este dni, usuario no agregado");
        } else {
            System.out.println("Alumno agregado correctamente");
            alumnos.add(alumno);
        }
        /*
           lista  -------------------
           stream ------------------- // -------------------
         */
    }

    public void calificarAlumnos() {
        // recorre una copia y lo modificas
        // alumnos.stream().forEach(element->element.setNota(10));
        alumnos.forEach(data ->
                {
                    if (data.getNota() < 0) {
                        data.setNota((int) (Math.random() * 10) + 1);
                    }
                }
        );
    }

    public void mostrarUsuarios() {
        alumnos.forEach(Alumno::mostrarDatos);
    }

    public void calcularNotaMedia() {
        // variable general
        // foreach -> sumar notas
        // divido entre n alumnos
        /*
        double media = 0.0;
        for (Alumno item : alumnos) {
            media += item.getNota();
        }
        media /= alumnos.size();*/
        double media = alumnos.stream().mapToDouble(Alumno::getNota).sum()/alumnos.size();
        System.out.println(media);
        /*
        alumnos -------------- Alumnos
        stream  -------------- Alumnos`
        map     -------------- Doubles (operables)
         */
    }
}
