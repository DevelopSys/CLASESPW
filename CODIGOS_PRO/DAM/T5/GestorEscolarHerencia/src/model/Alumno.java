package model;

public class Alumno extends Persona implements Manifestable {
    private int nMatricula;
    private String curso;

    public Alumno(){}
    public Alumno(String nombre, String apellido, int nMatricula){
        super(nombre,apellido);
        this.nMatricula = nMatricula;
    }

    public Alumno(String nombre, String apellido, int nMatricula, String curso){
        super(nombre,apellido);
        this.nMatricula = nMatricula;
        this.curso = curso;
    }

    @Override
    public void saludar() {
        System.out.println("Voy a aprender un monton");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("nMatricula = " + nMatricula);
        System.out.println("curso = " + curso);
        super.mostrarDatos();
    }

    public void realizarExamen(){
        System.out.println("vamos a realizar el examen");
        int nota = (int) (Math.random()*11);
        System.out.println("La nota del examen ha sido "+nota);
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void manifestar() {

    }
}
