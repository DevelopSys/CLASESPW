import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    static ArrayList<Object[]> listaContactos = new ArrayList<>();

    public static void main(String[] args) {
        // Agenda de contactos -> ArrayList<Object[]>
            // poder guardar tantos conctactos como necesite
            // cada contacto tiene unos datos fijos -> nombre, apellido, dni, telefono -> Object[]
            // Object[]{"Borja","Martin","1234A",12345}
            // ArrayList<Object[]> -> [{"B","N","1234A",1234}]
                // lista.get(0) -> Object[][0]-> "B"
            // ArrayList<Object>   -> [{"B","N","1234A",1234}]
                // lista.get(0) ->  ((Object[])Object)[0] o@123fca

        // [{"B","M","1234A",1234},{"M","L","2345A",2345},{"J","G","3456A",3456}]
        listaContactos.add(new Object[]{"Borja","Martin","1234A",1234}); // 0
        listaContactos.add(new Object[]{"Juan","Gomez","3456A",3456}); // 1
        listaContactos.add(new Object[]{"Maria","Lopez","2345A",2345}); // 2
        mostrarContactos();
        System.out.println("Vamos a sacar solo el nombre del ultimo conctacto");
        listaContactos.addFirst(new Object[]{"Marta","Gomez","4567A",3456});
        // Object[] contacto =  listaContactos.get(listaContactos.size()-1);
        Object[] contacto =  listaContactos.getLast();
        System.out.println(contacto[0]);
        System.out.println("Procedemos ahora a borrar un elemento");
        // borrarContacto("1234A");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que DNI quieres borrar");
        String dni = scanner.next();
        listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return objects[2].equals(dni);
            }
        });
        mostrarContactos();

    }

    public static void mostrarContactos(){
        for ( Object[] contacto : listaContactos) {
            System.out.println("Imprimiendo datos del contacto");
            System.out.printf("\tNombre: %s Apellido %s DNI: %s Telf: %d%n",
                    contacto[0],contacto[1],contacto[2],(int)contacto[3]);
        }
    }
    public static void borrarContacto(String dni){
        // listaContactos.remove(posicion) -> borra el elemento de dicha posicion
        for (int i = 0; i < listaContactos.size(); i++) {
            if(listaContactos.get(i)[2].equals(dni)){
                // listaContactos.remove(i);
                listaContactos.remove(listaContactos.get(i));
                break;
            }
        }
    }

}
