import controller.Registrador;
import model.Equipo;
import model.Partido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Equipo1");
        Equipo equipo2 = new Equipo("Equipo2");
        Equipo equipo3 = new Equipo("Equipo3");
        Equipo equipo4 = new Equipo("Equipo4");
        Equipo equipo5 = new Equipo("Equipo5");
        Registrador registrador = new Registrador();
        registrador.registrarPartido(new Partido(equipo1,equipo2,3,3));
        registrador.registrarPartido(new Partido(equipo1,equipo3,0,3));
        registrador.registrarPartido(new Partido(equipo1,equipo4,1,3));
        registrador.registrarPartido(new Partido(equipo1,equipo5,2,3));
        registrador.registrarPartido(new Partido(equipo2,equipo1,2,3));
        registrador.registrarPartido(new Partido(equipo3,equipo1,1,3));
        registrador.registrarPartido(new Partido(equipo4,equipo1,4,3));
        registrador.registrarPartido(new Partido(equipo5,equipo1,0,0));

        // registrador.registrarPartido(new Partido(equipo1,equipo1,2,2));

        registrador.mostrarPartidos();
        registrador.buscarEstadisticas("Equipo1");

        /*Partido partido1 = new Partido(equipo1,equipo2,5,3);
        Partido partido2 = new Partido(equipo2,equipo3,2,0);
        equipo2.mostrarEstadisticas();*/

    }
}
