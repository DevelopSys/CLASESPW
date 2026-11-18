package model;

import utils.NotaException;

// plantllla - molde de lo que sera un objeto
public class Alumno {

    // atributos -> cualifica
    private String nombre, dni;
    private double nota;

    // constructores -> crear / construir el futuro objeto -> 1 por defecto
    public Alumno() {
    }

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        nota = -1.0;
    }

    // metodos -> funcionalidad
    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("dni = " + dni);
        if (nota >= 0) {
            System.out.println("nota = " + nota);
        } else {
            System.out.println("Sin calificar");
        }
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
            if (nota < 0 || nota>10) {
                throw new NotaException("Nota invalida");
            }
            this.nota = nota;
        }

    public String getNombre() {
        // validacion
        return nombre;
    }

    public void setNombre(String nombre) {
        // validacion
        this.nombre = nombre;
    }
}
