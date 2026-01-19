import controller.Registrador;
import model.Equipo;
import model.Partido;

public class Main {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Equipo1");
        Equipo equipo2 = new Equipo("Equipo2");
        Equipo equipo3 = new Equipo("Equipo3");
        Equipo equipo4 = new Equipo("Equipo4");
        Equipo equipo5 = new Equipo("Equipo5");

        Partido partido1 = new Partido(equipo1,equipo2,3,0);
        Partido partido2 = new Partido(equipo1,equipo3,2,1);
        Partido partido3 = new Partido(equipo1,equipo4,0,1);
        Partido partido4 = new Partido(equipo1,equipo5,3,1);
        Partido partido5 = new Partido(equipo5,equipo1,1,1);
        Partido partido6 = new Partido(equipo4,equipo1);

        Registrador registrador = new Registrador();
        registrador.anadirPartido(partido1);
        registrador.anadirPartido(partido2);
        registrador.anadirPartido(partido3);
        registrador.anadirPartido(partido4);
        registrador.anadirPartido(partido5);
        registrador.anadirPartido(partido6);

        // registrador.jugarAplazados();
        // registrador.mostrarPartidos();
        // registrador.mostrarPartidos("Equipo4");
        registrador.mostrarEstadisticas("Equipo5");

        // partido2.jugarPartido();
        // partido3.jugarPartido();
        // partido3.mostrarDatos();

        // equipo2.mostrarEstadisticas();


    }
}
