package model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private int puntos;
    private int presupuesto;
    private ArrayList<Jugador> plantilla;

    public Equipo() {
    }

    public Equipo(String nombre, int presupuesto) {
        this.nombre = nombre;
        // this.puntos = 0;
        this.presupuesto = presupuesto;
        this.plantilla = new ArrayList<>();
        // this.plantilla = plantilla;
    }

    public Equipo(String nombre, int presupuesto, ArrayList<Jugador> plantilla) {
        this.nombre = nombre;
        // this.puntos = 0;
        this.presupuesto = presupuesto;
        this.plantilla = plantilla;
    }

    // fichar jugadores
    public void ficharJugador(Jugador jugador) {
        // no mas de 3 jugadores por plantilla
        // presupuesto suficiente
        if (plantilla.size() < 3 && presupuesto >= jugador.getPrecio()) {
            this.plantilla.add(jugador);
            presupuesto -= jugador.getPrecio();
            System.out.println("Jugador fichado!!!");
        } else {
            System.out.println("No se puede dar el fichaje");
        }
    }
    public void venderJugador(int id){
        // buscar!
        Jugador jugador = buscarJugador(id);
        if(jugador!=null){
            presupuesto += jugador.getPrecio();
            plantilla.remove(jugador);
            System.out.printf("%s vendido correctamente",jugador.getNombre());
        } else {
            System.out.println("No se puede vender, no esta en plantilla");
        }
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("presupuesto = " + presupuesto);
    }

    public void mostrarPlantilla(){
        System.out.println("Mostrando la plantilla del "+nombre);
        for (Jugador item: plantilla) {
            item.mostrarDatos();
        }
    }

    private Jugador buscarJugador(int id){
        for (Jugador item: plantilla) {
            if(item.getId() == id)
                return item;
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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
}
