package controller;

import model.Alumno;

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

    // mostrarAlumnos - muestra los datos de todos los alumnos de la lista
    public void listarAlumnos() {
        // [null,null,null,null,null]
        for (Alumno item : listaAlumnos) {
            if (item != null) {
                item.mostrarDatos();
            }
        }
    }

    public void inscribirAlumno(Alumno alumno){
        // TODO: inscribir -> necesitareis el buscar
        // cuando puedo inscribir un alumno? -> cuando hay hueco -> cuando alguna de las plazas es nula
            // si hay hueco, solo puedes inscribir si el dni del alumno no esta ya en la lista
        // si en ninguna de las posiciones del array de alumnos hay nulo -> no tienes hueco
    }
    // expulsarAlumnp
    // ordenarPorNota
    // calificarAlumno
    // buscarAlumno

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
