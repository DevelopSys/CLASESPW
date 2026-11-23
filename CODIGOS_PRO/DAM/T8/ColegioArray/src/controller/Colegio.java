package controller;

import model.Alumno;
import util.NotaException;

import java.util.Arrays;

public class Colegio {

    // atributos
    private String nombre;
    private Alumno[] listaAlumnos;

    // constructores
    public Colegio() {
    }

    public Colegio(String nombre) {
        this.nombre = nombre;
        this.listaAlumnos = new Alumno[5]; // [null,null,null,null,null]
    }

    public Colegio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.listaAlumnos = new Alumno[capacidad]; // [null,null,null,null,null,null,null,null,null,null]
    }
    // metodos

    private void funcionalidades(){

    }
    // mostrarAlumnos - muestra los datos de todos los alumnos de la lista
    public void listarAlumnos() {
        // [null,null,null,null,null]
        for (Alumno item : listaAlumnos) {
            if (item != null) {
                item.mostrarDatos();
            }
        }
    }

    public boolean inscribirAlumno(Alumno alumno) {
        // TODO: inscribir -> necesitareis el buscar
        // cuando puedo inscribir un alumno? -> cuando hay hueco -> cuando alguna de las plazas es nula
        // si hay hueco, solo puedes inscribir si el dni del alumno no esta ya en la lista
        // si en ninguna de las posiciones del array de alumnos hay nulo -> no tienes hueco

        for (int i = 0; i < listaAlumnos.length; i++) {
            if (listaAlumnos[i] == null) {
                // has encontrado hueco
                // hay algun alumno con ese dni
                if (buscarAlumno(alumno.getDni()) == null) {
                    listaAlumnos[i] = alumno;
                    return true;
                }
            }
        }
        return false;
    }

    // expulsarAlumnp
    public boolean expulsarAlumno(String dni) {
        Alumno expulsar = buscarAlumno(dni);
        if (expulsar != null) {
            // cambiar su espacio a null -> cual es su espacio/posicio -> FOR I
            for (int i = 0; i < listaAlumnos.length; i++) {
                if(listaAlumnos[i].getDni().equalsIgnoreCase(dni)){
                    listaAlumnos[i] = null;
                    return true;
                }
            }

        }
        return false;
    }

    // ordenarPorNota

    // calificarAlumno
    public boolean calificarAlumno(String dni, double nota) throws NotaException {
        // buscar al alumno
        // si lo has encontrado, modifica su nota
        Alumno encontrado = buscarAlumno(dni);

        if(encontrado != null){
            encontrado.setNota(nota);
            return true;
        }
        return false;
    }

    // buscarAlumno
    public Alumno buscarAlumno(String dni) {
        for (Alumno item : listaAlumnos) {
            if (item != null && item.getDni().equalsIgnoreCase(dni))
                return item;
        }
        return null;
    }

    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("Las plazas del colegio son " + listaAlumnos.length);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno[] getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(Alumno[] listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
}
