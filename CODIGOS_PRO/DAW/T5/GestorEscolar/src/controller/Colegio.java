package controller;

import lombok.Getter;
import lombok.Setter;
import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

@Getter
@Setter
public class Colegio {

    private ArrayList<Alumno> alumnos;
    private Profesor profesor;

    public Colegio(){
        this.alumnos = new ArrayList<>();
    }

    public Colegio(Profesor profesor){
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    public void matricularAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        System.out.println("Matriculado correctamente");
    }

    public void calificarAlumnos(){
        System.out.println("Procedemos a calificar");
        for (Alumno alumno: alumnos) {
            profesor.ponerNotas(alumno);
        }
    }

    public void mostrarResultados(){
        System.out.println("Vamos a ver la media de los alumnos");
        double mediaTotal =0;
        for (Alumno alumno: alumnos) {
            double mediaAlumno = profesor.calcularMedia(alumno);
            System.out.println("La media del alumno es "+mediaAlumno);
            mediaTotal+=mediaAlumno;
        }

        System.out.println("La nota media de los alumnos es de "+mediaTotal/alumnos.size());
    }

    /*
    public ArrayList<Alumno> getAlumnos(){
        return this.alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos){
        this.alumnos = alumnos;
    }*/
}
