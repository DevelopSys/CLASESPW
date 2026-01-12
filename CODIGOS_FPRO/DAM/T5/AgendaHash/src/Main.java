import controller.Agenda;
import model.Persona;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Persona("Borja1","Martin1","1234"));
        agenda.agregarPersona(new Persona("Borja2","Martin2","1235"));
        agenda.borrarPersona("1234");
        agenda.obtenerPersonas();
        //agenda.obtenerPersona("1239").mostarDatos();
    }
}
