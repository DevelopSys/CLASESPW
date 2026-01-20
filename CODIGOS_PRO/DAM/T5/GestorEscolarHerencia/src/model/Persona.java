package model;

public abstract class Persona {

    private String nombre, apellido;

    // TODO: me olvido del constructor vacio -> mas adelante
    public Persona(){}

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // TODO darle una vuelta de abstraccion
    public abstract void saludar();

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
