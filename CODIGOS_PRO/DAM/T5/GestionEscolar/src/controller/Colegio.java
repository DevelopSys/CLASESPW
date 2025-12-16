package controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

@Data
public class Colegio {
    private ArrayList<Alumno> alumnos;
    private Profesor profesor;
    private int matriculas;
    // 1,2,3

    public Colegio() {
        alumnos = new ArrayList<>();
        profesor = new Profesor();
        matriculas = 1;
    }

    public Colegio(Profesor profesor) {
        this.alumnos = new ArrayList<>();
        this.profesor = profesor;
    }

    public void matricularAlumno(String nombre){
        // si me das un correo que ya esta en la lista de mis alumnos, error
        alumnos.add(new Alumno(matriculas,nombre,1,2,3));
        System.out.println("Usuario agregado correctamente");
        matriculas++;
    }

    public void ponerNotas(){

        for (Alumno item: alumnos) {
            profesor.ponerNotas(item);
        }
        System.out.println("Notas puestas correctamente, podemos hacer el acta");
    }

    public void buscarExpediente(int nMatricula){
        for (Alumno alumno: alumnos) {
            if (alumno.getNMat() == nMatricula){
                alumno.mostrarDatos();
                System.out.println("Su media es "+profesor.calcularMedia(alumno));
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }
    public void mostrarDatos(){
        for (Alumno item: alumnos) {
            System.out.println("Mostrando datos de "+item.getNombre());
            item.mostrarDatos();
            System.out.println("La nota media del alumno es "+profesor.calcularMedia(item));
        }
    }
}
