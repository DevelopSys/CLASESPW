package model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Asignatura {
    // atributos
    private int id;
    private double calificacion;
    // constructor por defecto -> queda enmascarado cuando escrito explicitamente un constructor


    public Asignatura(int id){
        this.id = id;
    }
    public void mostrarDatos(){
        System.out.println("Mostrando los datos de la asignatura requerida");
        System.out.println("id = " + id);
        System.out.println("calificacion = " + calificacion);
    }

}
