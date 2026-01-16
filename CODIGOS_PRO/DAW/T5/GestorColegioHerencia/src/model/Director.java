package model;

public class Director extends Persona implements Inpector{
    public Director() {
    }
    public Director(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void saludar() {
        System.out.println("Soy el jefe, yo mando");
    }

    @Override
    public void realizarInspeccion() {
        System.out.println("Soy el jefe y vamos a inspeccionar a fondo");
    }
}
