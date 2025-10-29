package controller;

public class GestorDocumental {

    public static void gestionarStatico(){

    }

    private void clasificarDocumento(){
        
    }

    public void enviarDocumento(String titulo, String correo){
        System.out.println("Enviando documento para el correo "+correo);
        // logica de como se hace un envio de correo
        clasificarDocumento();
    }

    public void archivarDocumento(String documento){
        System.out.println("Archivando documento");
        // logica de como se archiva un documento
    }

}
