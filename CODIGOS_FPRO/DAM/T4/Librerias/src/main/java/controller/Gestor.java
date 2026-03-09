package controller;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Gestor {

    private String urlBase = "https://dummyjson.com/products";

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
            marshaller.marshal(libreria, new File("src/main/java/ficheros/libreria.xml"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error en la gestion del fichero");
        }

    }
    public void importarXML() {
        try {
            JAXBContext context = JAXBContext.newInstance(Libreria.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Libreria libreria = (Libreria) unmarshaller.unmarshal(new File("src/main/java/ficheros/libreria.xml"));
            libreria.getLibros().forEach(item -> System.out.println(item.getTitulo()));
        } catch (JAXBException e) {
            System.out.println("Error en la traduccion de los datos");
        }
    }

    public void lectorJSON(){
        // httpclient
        // httprequest
        // httpresponse
        // reponse.body -> JSON -> GSON -> JAVA
        try {
            URL url = new URL(urlBase);
            ObjectMapper mapper = new ObjectMapper();
            ProductosRespuesta productosRespuesta = mapper.readValue(url, ProductosRespuesta.class);
            productosRespuesta.getProducts().forEach(Producto::mostrarDatos);
        } catch (MalformedURLException e) {
            System.out.println("URL no valida");
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getProductoById(int id){
        try {
            // crea la url donde vas a consultar
            URL url = new URL(urlBase+"/"+id);
            // crea el mapeador -> el encargado de colocar cada propiedad en su sitip
            ObjectMapper objectMapper = new ObjectMapper();
            // Captura la lectura de le URL y utiliza la clase indicada para poder colocar las
            // propiedades de forma correcta
            Producto producto = objectMapper.readValue(url, Producto.class);
            producto.mostrarDatos();
            producto.mostrarResenias();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
