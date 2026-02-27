package model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {
    @XmlAttribute
    private int id;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    @XmlAttribute
    private String dni;
    @XmlAttribute
    private int edad;

    public Usuario(String nombre, String apellido, Direccion direccion, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.edad = edad;
    }
}
