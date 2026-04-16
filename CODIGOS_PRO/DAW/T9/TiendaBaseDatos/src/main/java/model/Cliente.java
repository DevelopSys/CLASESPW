package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private long id;
    private String nombre, apellido, correo;
    private int saldo, idPerfil;

    public Cliente(String nombre, String apellido, String correo, int saldo, int idPerfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.saldo = saldo;
        this.idPerfil = idPerfil;
    }
}
