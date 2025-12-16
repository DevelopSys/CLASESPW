package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Asignatura {

    private int id;
    private double calificacion;
    public Asignatura(int id) {
        this.id = id;
    }

    public void mostrarDatos(){
        System.out.println("id: "+id);
        System.out.println("calificacion: "+calificacion);
    }

}
