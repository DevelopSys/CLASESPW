package model;

import lombok.NoArgsConstructor;


public class Profesor {
    // si no escribo ningun constructor, el por defecto esta aqui
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura2().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura3().setCalificacion((Math.random()*10)+0.1);
    }

    public double calcularMedia(Alumno alumno){
        // ponerNotas(alumno);
        double media = (alumno.getAsignatura1().getCalificacion()
                + alumno.getAsignatura2().getCalificacion()
                +alumno.getAsignatura3().getCalificacion())/3;
        return media;
    }


}
