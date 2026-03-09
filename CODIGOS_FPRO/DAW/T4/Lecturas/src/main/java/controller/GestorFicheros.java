package controller;


import com.fasterxml.jackson.core.exc.StreamReadException;
import model.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class GestorFicheros {

    private String urlBase = "https://dummyjson.com/products/";

    public void exportarXML() {
        Agenda agenda = new Agenda();
        agenda.getLista().add(new Usuario(1, "Borja1", "Martin1", new Direccion("Madrid1", "Madrid", "Madrid"), "123123A", 41));
        agenda.getLista().add(new Usuario(2, "Borja2", "Martin2", new Direccion("Madrid2", "Madrid", "Madrid"), "223123A", 42));
        agenda.getLista().add(new Usuario(3, "Borja3", "Martin3", new Direccion("Madrid3", "Madrid", "Madrid"), "323123A", 43));
        agenda.getLista().add(new Usuario(4, "Borja4", "Martin4", new Direccion("Madrid4", "Madrid", "Madrid"), "423123A", 44));
        agenda.getLista().add(new Usuario(5, "Borja5", "Martin5", new Direccion("Madrid5", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(6, "Borja6", "Martin6", new Direccion("Madrid6", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(7, "Borja7", "Martin7", new Direccion("Madrid7", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(8, "Borja8", "Martin8", new Direccion("Madrid8", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(9, "Borja9", "Martin59", new Direccion("Madrid9", "Madrid", "Madrid"), "523123A", 45));

        try {
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Marshaller marshaller = context.createMarshaller();
            //marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(agenda, new File("src/main/java/ficheros/usuarios.xml"));
        } catch (JAXBException e) {
            System.out.println("Error en la codificacion del fichero XML");
            System.out.println(e.getMessage());
        }

        /*
        try {
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            File out = new File("target/usuarios.xml");
            out.getParentFile().mkdirs();
            marshaller.marshal(agenda, out);
        } catch (JAXBException e) {
            System.out.println("Error en la codificacion del fichero XML");
            System.out.println(e.getMessage());
        }*/
    }
    public void importarXML(){
        try {
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Agenda respuesta = (Agenda) unmarshaller.unmarshal(new File("src/main/java/ficheros/usuarios.xml"));
            respuesta.getLista().forEach(Usuario::mostrarDatos);

        } catch (JAXBException e) {
            System.out.println("Error en la traducion XML -> JAVA");
        } catch (ClassCastException e){
            System.out.println("Clases incopatibles");
            System.out.println(e.getMessage());
        }
    }

    public void lecturaJSON(){
        // httpclient
        // httprequest
        // httpresponse
        // reponse.body -> json -> hson
        ObjectMapper mapper = new ObjectMapper();
        try{

        URL url = new URL(urlBase);
        ProductosRespuesta respuesta = mapper.readValue(url, ProductosRespuesta.class);
        respuesta.getProducts().forEach(Producto::mostrarDatos);
        } catch (MalformedURLException e){
            System.out.println("Esto no es una URL");
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
