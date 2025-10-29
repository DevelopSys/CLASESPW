package controller;

import utils.GestionConexion;

public class GestorDocumentos {

    public static int consultas =0;
    public static void ejecutarDocumento(){
        consultas++;
    }

    public static void verConsultas(){
        System.out.println(consultas);
    }
    public void imprimirFactura(int cantidad){
        GestionConexion gestionConexion = new GestionConexion();
        gestionConexion.abrirConexion();
    }

    public void enviarDocumento(String tituloDocumento, String correp){

    }

    public void validarDocumento(String documento, int nPaginas){

    }
}
