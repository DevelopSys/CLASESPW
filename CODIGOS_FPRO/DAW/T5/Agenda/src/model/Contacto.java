package model;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor

public class Contacto {

    private int id;
    private String nombre, apellido, dni, correo;
    private int telefono;


    public Contacto() {
    }

    public Contacto(String nombre, String apellido, String dni, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println("Mostrando los datos del contacto con nombre "+nombre);
        System.out.println("id = " + id);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("telefono = " + telefono);
    }

    // Constacto{nombre=qasdasdasd,apellido=asdasdasd}

    // getter y setter implicitos desde lombok
}
