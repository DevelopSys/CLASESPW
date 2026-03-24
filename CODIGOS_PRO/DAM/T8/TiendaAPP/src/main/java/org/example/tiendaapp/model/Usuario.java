package org.example.tiendaapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String nombre, apellido, direccion, correo, pass;
    private int edad;
    private String perfil, genero;

    @Override
    public String toString() {
        return nombre +" "+apellido;
    }
}
