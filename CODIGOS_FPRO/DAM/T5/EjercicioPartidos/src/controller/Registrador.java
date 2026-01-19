package controller;

import model.Partido;

import java.util.ArrayList;

public class Registrador {
    private ArrayList<Partido> listaPartidos;

    public Registrador(){
        this.listaPartidos = new ArrayList<>();
    }

    public void anadirPartido(Partido partido){
        this.listaPartidos.add(partido);
    }

    public void jugarAplazados(){
        for (Partido partido: listaPartidos) {
            if(!partido.isJugado()){
                partido.jugarPartido();
            }
        }
    }
    public void mostrarPartidos(){
        for (Partido partido: listaPartidos) {
            partido.mostrarDatos();
        }
    }

    public void mostrarPartidos(String nombre){
        for (Partido partido: listaPartidos) {
            if (partido.isJugado()
                    && (partido.getEquipoLocal().getNombre().equals(nombre)
                    || partido.getEquipoVisitante().getNombre().equals(nombre))
            ){
                partido.mostrarDatos();
            }
        }
    }

    public void mostrarEstadisticas(String nombre){
        for (Partido partido: listaPartidos) {
            if(partido.getEquipoVisitante().getNombre().equals(nombre)){
                partido.getEquipoVisitante().mostrarEstadisticas();
                return;
            } else if(partido.getEquipoLocal().getNombre().equals(nombre)){
                partido.getEquipoLocal().mostrarEstadisticas();
                return;
            }
        }
    }
}
