package utils;

// error
public class BancoException extends Exception {
    // heredado de Exception -> tengo todas las caract / func de la clase padre
    // constructores -> solo tengo el por defecto, si quieres los de la clase padre, los pides
    public BancoException(){}
    public BancoException(String data){
        // llamada al constructor de la clase padre
        super(data);
        // mas cosas
    }



}
