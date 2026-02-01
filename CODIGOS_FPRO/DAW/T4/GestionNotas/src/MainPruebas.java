import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class MainPruebas {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Alumno1", "Apellido1", "123123", 9);
        Alumno alumno2 = new Alumno("Alumno2", "Apellido2", "234234",5);
        Alumno alumno3 = new Alumno("Alumno3", "Apellido3", "345345",7);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        /*
        for (Alumno alumno: listaAlumnos) {
            alumno.mostrarDatos();
        }
        */

        // funciones lambda o funcipnes de flecha
        // p -> {cuerpo}
        // una funcion que tiene como parametro otra funcion
        // por cada iteracion yo tengo un objeto y ejecuto un cuerpo
        // listaAlumnos.forEach(data->data.mostrarDatos());
        // listaAlumnos.forEach(System.out::println);
        // listaAlumnos.forEach(Alumno::calcularMedia);
        // una funcion que tiene tres datos -> tipo param1 tipo param2 tipo retorno
        BiFunction<Integer, Integer, Integer> sumaBi = Integer::sum;
        BiFunction<Alumno, Integer, Integer> notaDuplicada = (a,n)-> a.getNota()*n;
        // System.out.println(sumaBi.apply(1, 4));
        System.out.println(notaDuplicada.apply(alumno1,5));
        // calcular la nota media -> recorrer

        int notaTotal=0;
        System.out.println("Las notas son");
        listaAlumnos.stream().map(Alumno::getNota).forEach(System.out::println);


        /*public int sumar(int p1, int p2){
            return p1+p2;
        }
        sout(suma(2,5)) -> 7
        */
    }
}


