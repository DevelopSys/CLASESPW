package model;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private int presupuesto, calidad, puntos;
    private ArrayList<Jugador> plantilla;

    public Equipo() {
    }

    public Equipo(String nombre, int presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto > 2000000 ? 1000000 : presupuesto;
        // this.punto = 0
        // this.calidad = 0
        this.plantilla = new ArrayList<>(); // size 0
    }

    public Equipo(String nombre, int presupuesto, ArrayList<Jugador> plantilla) {
        this.nombre = nombre;
        this.presupuesto = presupuesto > 100000000 ? 1000000 : presupuesto;
        // this.punto = 0
        this.plantilla = plantilla; // size ?
        for (Jugador item : plantilla) {
            calidad += item.getCalidad();
        }
        calidad /= plantilla.size();
    }

    // TODO -> completar los metodos del equipo
    // fichar
    // vender
    // mostrarJugadores
    // mostrarEstrellas

    // TODO -> Completnrar el modelo de la liga
    /*
    	Clase -> Liga
		nombre: string
		equipos: ArrayList<Equipo>
		ganador: Equipo
		¿¿¿??? -> atributo
     */

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("presupuesto = " + presupuesto);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
