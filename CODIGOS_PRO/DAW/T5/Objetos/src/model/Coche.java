package model;

// TODA CLASE JAVA EXTIENDE OBJECT
public class Coche {
    // tengo toda la funcionalidad que me ha dado la clase object
    private String marca, modelo, color;
    private int numeroPuertas, cv, precio;


    // tipo_acceso tipo_retorno nombre_metodo (argumentos){cuerpo metodo}
    // tipo_acceso nombre_metodo (argumentos){cuerpo metodo} -> no le digo que retorna
    // CONSTRUCTORES -> mínimo tengo 1, el vacio esta por defecto (implicito) solo si no hay uno ya escrito (enmascara)


    public Coche() {
    }

    public Coche(String marca, String modelo, int cv, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, int numeroPuertas, int cv, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.cv = cv;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}