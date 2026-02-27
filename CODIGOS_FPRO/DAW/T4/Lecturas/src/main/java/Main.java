import controller.GestorFicheros;

public class Main {

    public static void main(String[] args) {
        GestorFicheros gestorFicheros = new GestorFicheros();
        gestorFicheros.exportarXML();

        //marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    }
}
