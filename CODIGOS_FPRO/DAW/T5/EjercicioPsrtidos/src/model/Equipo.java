package model;

public class Equipo {
    private String nombre;
    private int gFavor, gContra;

    public Equipo(){}
    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public void mostrarEstadisticas(){
        System.out.println("nombre = " + nombre);
        System.out.println("Los goles a favor son: "+gFavor);
        System.out.println("Los goles a contra son: "+gContra);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getgFavor() {
        return gFavor;
    }

    public void setgFavor(int gFavor) {
        this.gFavor = gFavor;
    }

    public int getgContra() {
        return gContra;
    }

    public void setgContra(int gContra) {
        this.gContra = gContra;
    }
}
