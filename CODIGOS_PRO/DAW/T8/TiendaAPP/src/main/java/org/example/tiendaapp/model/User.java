package org.example.tiendaapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String nombre, apellido, correo, pass, dni, genero, perfil;
    private int edad;

}
