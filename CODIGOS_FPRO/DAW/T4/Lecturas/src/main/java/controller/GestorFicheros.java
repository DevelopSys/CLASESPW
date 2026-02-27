package controller;


import model.Agenda;
import model.Direccion;
import model.Usuario;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class GestorFicheros {

    public void exportarXML() {
        Agenda agenda = new Agenda();
        agenda.getLista().add(new Usuario(1, "Borja1", "Martin1", new Direccion("Madrid1", "Madrid", "Madrid"), "123123A", 41));
        agenda.getLista().add(new Usuario(2, "Borja2", "Martin2", new Direccion("Madrid2", "Madrid", "Madrid"), "223123A", 42));
        agenda.getLista().add(new Usuario(3, "Borja3", "Martin3", new Direccion("Madrid3", "Madrid", "Madrid"), "323123A", 43));
        agenda.getLista().add(new Usuario(4, "Borja4", "Martin4", new Direccion("Madrid4", "Madrid", "Madrid"), "423123A", 44));
        agenda.getLista().add(new Usuario(5, "Borja5", "Martin5", new Direccion("Madrid5", "Madrid", "Madrid"), "523123A", 45));

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
}
