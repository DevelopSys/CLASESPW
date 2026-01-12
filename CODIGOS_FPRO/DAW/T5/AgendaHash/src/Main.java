import controller.Agenda;
import model.Persona;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Persona("Borja1","Martin1","1234"));
        agenda.agregarPersona(new Persona("Borja2","Martin2","2234"));
        // agenda.borrarPersona("2234");
        // agenda.obtenerPersona("2234").mostrarDatos();
        agenda.mostrarPersonas();
    }
}
