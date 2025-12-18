package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Profesor {
    // no tengo atributos -> el const default esta implicito
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura2().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura3().setCalificacion((Math.random()*10)+0.1);
    }

    public double calcularMedia(Alumno alumno){
        double media = alumno.getAsignatura1().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getCalificacion();
        return (media)/3;
    }
}
