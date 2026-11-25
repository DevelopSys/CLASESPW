import model.Equipo;
import model.Jugador;
import util.Posicion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int id = 0;
        ArrayList<Jugador> lista;
        final String[] posiciones = new String[]{"POR", "DEF", "MED", "DEL"};
        Jugador pedri = new Jugador(2, "Pedri", 95, 200000, Posicion.MED);
        Jugador arbeloa = new Jugador(3, "Alvaro", 50000, Posicion.DEF);
        Jugador vinicius = new Jugador(1, "Vinicius", 89, 100000, Posicion.DEL);
        Jugador lamine = new Jugador(4, "Lamine", 350000, Posicion.DEL);
        Equipo madrid = new Equipo("Real Madrid",900000);
        // pedri.mostrarDatos();
        madrid.mostrarDatos();


    }
}
