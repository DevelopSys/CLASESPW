package model;

public class Director extends Persona implements Inspector{

    public Director(){}
    public Director(String nombre, String apellido ){
        super(nombre,apellido);
    }
    @Override
    public void saludar() {
        System.out.println("Soy Seymour Skinner y vamos a clase");
    }

    public void mandarMensaje(){
        System.out.println("Bienvenidos a un nuevo dia de clase");
    }

    @Override
    public void realizarInspeccion(int nivel) {
        System.out.println("Procedemos a una inspeccion de las buenas");
        System.out.println("El nivel es el que hay");
    }
}
