import controller.Gestor;
import model.Alumno;

public class Main {

    public static void main(String[] args) {
        // lista de elementos
        Gestor gestor = new Gestor();
        gestor.agregarUsuario(new Alumno("Alumno1", "Alumno1", "123A", 8));
        gestor.agregarUsuario(new Alumno("Alumno2", "Alumno2", "223B", 6));
        gestor.agregarUsuario(new Alumno("Alumno3", "Alumno3", "323B", 3));
        gestor.agregarUsuario(new Alumno("Alumno4", "Alumno4", "423B", 10));
        gestor.agregarUsuario(new Alumno("Alumno5", "Alumno5", "523B", 2));
        gestor.agregarUsuario(new Alumno("Alumno6", "Alumno6", "723B", 9));
        gestor.agregarUsuario(new Alumno("Alumno7", "Alumno7", "823B", 10));
        /*if (gestor.buscarDNI("123B").isPresent()){
            // el usuario con dni se ha encontrado
            System.out.println("el usuario se ha encontrado con existo");
            gestor.buscarDNI("123A").get().mostrarDatos();
        } else {
            // no se ha encontrado
            System.out.println("No se han encontrado coincidencias");
        }*/
        // gestor.buscarDNI("123A").ifPresent(Alumno::mostrarDatos);
        String dni = "623B";
        gestor.buscarDNI(dni)
                .ifPresentOrElse(Alumno::mostrarDatos,
                        () -> gestor.agregarUsuario(new Alumno("Nuevo", "Nuevo", dni)));
        gestor.calificarAlumnos();
        gestor.ordenarAlumnos();
        gestor.mostrarUsuarios();
        gestor.getAlumnosNota((e, n) -> e.getNota() > n, 5.5);
        gestor.getAlumnosNota((e, n) -> e.getNota() < n, 5.5);
        gestor.getAlumnosNota((e, n) -> e.getNota() == n, 5.5);
        // gestor.getAprobados().forEach(Alumno::mostrarDatos);
        // gestor.buscarDNI(dni).ifPresentOrElse(Alumno::mostrarDatos, () -> gestor.agregarUsuario(new Alumno("Nuevo", "Nuevo", dni)));
        // gestor.calificarAlumnos();
        // gestor.getAprobados().forEach(Alumno::mostrarDatos);
        // System.out.println(gestor.getNumeroAprobados());
        // gestor.mostrarUsuarios();
        // gestor.calcularNotaMedia();
        // dime que correo quieres buscar -> un alumno

    }
}
