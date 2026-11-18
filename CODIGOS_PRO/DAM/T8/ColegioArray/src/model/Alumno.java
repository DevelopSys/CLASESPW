package model;

import util.NotaException;

// molde - plantilla -> futuro objeto
public class Alumno {

    // atributos: culifican -> depende de las necesidades de tu programa
    private String nombre, dni;
    private double nota;

    // constructores: crear el objeto - hacer realizad
    public Alumno() {
    }

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        nota = -1; // indico que no se ha calificado
    }

    // metodos: funcionalidades
    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("dni = " + dni);
        System.out.println(nota < 0 ? "Sin calificar" : "Nota: "+nota);
        /*if (nota < 0) {
            System.out.println("Sin calificar");
        } else {
            System.out.println("nota = " + nota);
        }*/
    }

    public String getNombre() {
        // validacion
        return nombre;
    }

    public void setNombre(String nombre) {
        // validacion
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) throws NotaException {
        // validando

        if (nota < 0 || nota > 10) {
            throw new NotaException("Nota invalida");
        }
        this.nota = nota;
    }
}
