package util;

public class ResultadoExcepcion extends Exception{
    // atributos
    // metodos
    // se produce cuadno el resultado es < 0
    public ResultadoExcepcion(String message) {
        super(message);
        System.out.println("Lanzando excepcion");
    }
}
