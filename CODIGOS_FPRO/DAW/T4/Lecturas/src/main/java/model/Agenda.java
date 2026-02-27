package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name ="agenda")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agenda {

    @XmlElement(name = "usuario")
    private List<Usuario> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }
}
