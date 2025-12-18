import model.Alumno;
import model.Asignatura;
import model.Profesor;

/*
Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

- Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
- Alumno: tres Asignatura; constructores con 3 Asignatura o con 3 ids.
- Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
- Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.
 */
public class Main {

    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        // id=1  calificacion=6.4
        Asignatura sistemas = new Asignatura(2);
        // id=2  calificacion=0.0
        Asignatura entornos = new Asignatura(3);
        // id=3  calificacion=0.0
        Asignatura baseDatos = new Asignatura();
        // id=0  calificacion=0.0
        Asignatura fundamentos = new Asignatura();

        Alumno borja = new Alumno(1, 2, 3);
        // asi1 = programacion(1,0.0) - asi2 = sistemas(2,0.0) - asi3 = entornos(3,0.0)

        Alumno maria = new Alumno(programacion, sistemas, entornos);
        Alumno marcos = new Alumno(programacion, sistemas, entornos);
        Alumno celia = new Alumno(1, 2, 3);

        System.out.println("Comprobamos cuales son las notas de los alumnos");
        System.out.println("De marcos");
        marcos.mostrarDatos();
        System.out.println("De celia");
        celia.mostrarDatos();
        Profesor profesor = new Profesor();
        System.out.println("Procedemos a poner notas");
        profesor.ponerNotas(marcos);
        profesor.ponerNotas(celia);
        System.out.println("Comprobamos cuales son las notas de los alumnos despues de ponerlas");
        System.out.println("La media de celia es "+profesor.calcularMedia(celia));
        System.out.println("La media de marcos es "+profesor.calcularMedia(marcos));
        System.out.println("La media de maria es "+profesor.calcularMedia(maria));



    }
}
