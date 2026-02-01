import model.Alumno;

import java.util.ArrayList;

public class MainPruebas {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Borja", "Martin", "1234A", 8);
        Alumno alumno2 = new Alumno("Maria", "Lopez", "2345A");
        Alumno alumno3 = new Alumno("Juan", "Gomez", "3456A");
        Alumno alumno4 = new Alumno("Pepe", "Jimenez", "4567B");
        Alumno alumno5 = new Alumno("Laura", "Gomez", "5678");

        alumnos.add(new Alumno("Borja", "Martin", "1234A", 8));
        alumnos.add(new Alumno("Maria", "Lopez", "2345A"));
        alumnos.add(new Alumno("Juan", "Gomez", "3456A"));
        alumnos.add(new Alumno("Pepe", "Jimenez", "4567B"));
        alumnos.add(new Alumno("Laura", "Gomez", "5678"));

        /*
        List<Alumno> lista = Arrays.asList(new Alumno("Borja1", "Martin", "1234A", 8),
                new Alumno("Borja2", "Martin2", "1234A", 5),
                new Alumno("Borja3", "Martin3", "1234A", 2),
                new Alumno("Borja4", "Martin4", "1234A", 1),
                new Alumno("Borja5", "Martin5", "1234A", 6),
                new Alumno("Borja6", "Martin6", "1234A"),
                new Alumno("Borja7", "Martin7", "1234A"));

         */
        /*for (Alumno item: alumnos) {
            item.mostrarDatos();
        }*/
        // funcion de flecha - lambda se llaman despues de otras funciones
        // param -> cuerpo
        // tras la llamada a la funcion foreach, se llama en cada iteracion
        // a la funcion de flecha definida en los parametros
        /*alumnos.forEach(element-> {
            System.out.println("Vamos a imprimir los datos de "+element.getNombre());
            element.mostrarDatos();
        });*/
        // y si quiero imprimir solo las notas
        // alumnos.forEach(data-> System.out.println(data.getNota()));
        // foreach -> recorro y en cada iteracion obtengo un alumno
        // map -> recorro y transformo




    }
}
