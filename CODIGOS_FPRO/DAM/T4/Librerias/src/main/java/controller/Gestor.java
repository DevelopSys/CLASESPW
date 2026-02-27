package controller;

import model.Libreria;
import model.Libro;
import model.Personaje;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class Gestor {

    public void exportarXML() {
        Libreria libreria = new Libreria();
        Libro libro1 = new Libro(1994, 123123, 100, "Libro1", "Escritor1", "Ciencia Ficcion");
        libro1.getPersonajes().add(new Personaje("P1Libro1", "Principal", false));
        libro1.getPersonajes().add(new Personaje("P2Libro1", "Principal", true));
        libro1.getPersonajes().add(new Personaje("P3Libro1", "Secundario", false));
        Libro libro2 = new Libro(2000, 234234, 200, "Libro2", "Escritor2", "Narrativa");
        libro2.getPersonajes().add(new Personaje("P1Libro2", "Principal", false));
        libro2.getPersonajes().add(new Personaje("P2Libro2", "Principal", false));
        Libro libro3 = new Libro(2020, 334534, 300, "Libro3", "Escritor3", "Humor");
        libro3.getPersonajes().add(new Personaje("P1Libro3", "Principal", true));
        libreria.getLibros().add(libro1);
        libreria.getLibros().add(libro2);
        libreria.getLibros().add(libro3);

        try {
            JAXBContext context = JAXBContext.newInstance(Libreria.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(libreria,new File("src/main/java/ficheros/libreria.xml"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("Error en la gestion del fichero");
        }

    }
}
