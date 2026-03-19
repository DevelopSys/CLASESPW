package org.example.tiendaapp.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String nombre, apellido, correo, pass, dni, genero, perfil;
    private int edad;

    @Override
    public String toString() {
        return nombre;
    }
}
