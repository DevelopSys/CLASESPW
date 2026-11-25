import model.Equipo;
import model.Jugador;
import util.Posiciones;

public class Main {

    // TODO. Crear la clase Liga y modelarla: attr como los metodos

    public static void main(String[] args) {
        final String[] posiciones = new String[]{"POR", "DEF", "MED", "DEL"};
        Jugador courtua = new Jugador(1, "Tibua", "Curtois", 99, 300000, Posiciones.POR);
        Jugador vinicius = new Jugador(2, "Vinicius", "Junior", 92, 100000, Posiciones.DEL);
        Jugador lamine = new Jugador(3, "Lamine", "Yamal", 95, 100000, Posiciones.DEL);
        Jugador pedri = new Jugador(4, "Pedri", "Gonzalez", 99, 100000, Posiciones.MED);
        Equipo madrid = new Equipo("Madrid",700000);
        Equipo barsa = new Equipo("Barsa",600000);
        barsa.ficharJugador(vinicius);
        madrid.ficharJugador(vinicius);
        //madrid.mostrarPlantilla();
        madrid.ficharJugador(pedri);
        madrid.ficharJugador(lamine);
        madrid.ficharJugador(courtua);
        madrid.venderJugador(2);
        madrid.mostrarDatos();
        madrid.ficharJugador(courtua);
        madrid.mostrarDatos();
        // madrid.mostrarPlantilla();
        // vinicius.mostrarDatos();
        // pedri.mostrarDatos();
    }
}
