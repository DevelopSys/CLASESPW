package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "libreria")
public class Libreria {
    @XmlElement(name = "libroo")
    private List<Libro> bookss;
    public Libreria() {
        bookss = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return bookss;
    }

    public void setLibros(List<Libro> libros) {
        this.bookss = libros;
    }
}
