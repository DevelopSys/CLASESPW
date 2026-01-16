package controller;

import model.Partido;

import java.util.ArrayList;

public class Registrador {
    private ArrayList<Partido> listaPartidos;

    public Registrador() {
        this.listaPartidos = new ArrayList<>();
    }

    public void registrarPartido(Partido partido){
        // se puede duplicar equipos tanto el local como en visitante
        this.listaPartidos.add(partido);
    }

    public void mostrarPartidos(){
        for (Partido partido: listaPartidos) {
            partido.mostrarDatos();
        }
    }

    public void buscarEstadisticas(String nombre){
        // buscar por nombre de equipo y sacar sus estadisticas
        // busco en el array de partidos
        for (Partido partido: listaPartidos) {
            if (partido.getEquipoLocal().getNombre().equals(nombre)){
                partido.getEquipoLocal().mostrarEstadisticas();
                return;
            } else if(partido.getEquipoVisitante().getNombre().equals(nombre)){
                partido.getEquipoVisitante().mostrarEstadisticas();
                return;
            }
        }
        System.out.println("Equipo no encontado en la relacion de partidos");
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
}
