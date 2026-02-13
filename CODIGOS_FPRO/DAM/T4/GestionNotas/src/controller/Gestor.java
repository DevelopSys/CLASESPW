package controller;

import model.Alumno;

import javax.lang.model.type.MirroredTypeException;
import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {
    private List<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor() {
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    }

    // agregar un alumno
    // solo se pueden agregar alumnos con un dni que no este ya en la lista
    public void agregarAlumno(Alumno alumno) {
        /*
        if(alumnosMap.containsKey(alumno.getDni())){
            System.out.println("No se puede agregar");
        } else {
            alumnosMap.put(alumno.getDni(),alumno);
            System.out.println("Agregado correctamente");
        }
        // el put retorna un null si lo puede agregar
        // el put retorna un Alumno si no lo puede agregar
        Alumno agregado = alumnosMap.put(alumno.getDni(), alumno);
        if(agregado==null){
            System.out.println("Alumno agregado correctamente");
        } else {
            System.out.println("Alumno no agregado correctamente, dni duplicado");
        }  */
        /*
        for (Alumno item: alumnos) {
            if(item.getDni().equals(alumno.getDni())){
                System.out.println("No puedo");
                return;
            }
        }
        alumnos.add(alumno);*/
        /*
        alumnos  ----------------
        stream   ----------------
        anyMatch true/false
        filter   -------

         */
        boolean esta = alumnos.stream().anyMatch(item -> item.getDni().equals(alumno.getDni()));
        if (alumnos.stream().anyMatch(item -> item.getDni().equals(alumno.getDni()))) {
            System.out.println("El dni esta en la lista, no se puede agregar");
        } else {
            System.out.println("Usuario agregado con existo");
            alumnos.add(alumno);
        }
        /*alumnos.forEach(item -> {
            if (item.getDni().equals(alumno.getDni())){

            }
        });*/
    }

    public void ordenarNotas(){
        // recorro y comparo de 2 en 2
        /*Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                if(o1.getNota()>o2.getNota()){
                    return -1;
                } else {
                    return 1;
                }
            }
        });*/
        alumnos = alumnos.stream()
                .sorted(Comparator.comparingInt(Alumno::getNota).reversed()).toList();
    }
    public void mostrarAlumnos() {
        /*
        alumnos.forEach(item -> {
            if (item.getNota() >= 5) {
                item.mostrarDatos();
            }
        });

         */
        alumnos.forEach(Alumno::mostrarDatos);
        // alumnosMap.values().forEach(Alumno::mostrarDatos);
    }
    public void calificarAlumnos() {
        /*
        alumnos ---------------
        stream  x--x---x-------
         */
        alumnos.forEach(item -> {
            if (item.getNota() == -1) {
                item.setNota((int) (Math.random() * 11));
            }
        });
    }
    public void calcularMedia() {
        // variable sumatorio
        // foreach
        // suma
        // divido
        double acumulador = 0;
        // alumnos.stream().map(item->item.getNota()).forEach(item->acumulador+=item)/size;
        // double media = alumnos.stream().mapToDouble(Alumno::getNota).sum()/alumnos.size();
        OptionalDouble media = alumnos.stream().mapToDouble(Alumno::getNota).average();
        // alumnos.stream().map(Alumno::getNota).mapToDouble().
        System.out.println(media.getAsDouble());
        /*
        alumnos       ---------------
        stream        ---------------
        mapDouble     ---------------
         */
    }
    // el numero de usuario que han aprobado
    public long getNumeroAprobados() {
        // recorro, pregunto, incremento
        /*int nAP =0;
        for ( Alumno alumno: alumnos ) {
            if (alumno.getNota()>=5){
                nAP++;
            }
        }
        return nAP;*/
        return alumnos.stream().filter(item -> item.getNota() >= 5).count();
    }
    public List<Alumno> getAprobados() {
        // recorro - pregunto y añado list
        /*ArrayList<Alumno> filtrados = new ArrayList<>();
        for (Alumno alumno: alumnos) {
            if (alumno.getNota()>=5){
                filtrados.add(alumno);
            }
        }

        alumnos.forEach(item->{
            if(item.getNota()>=5){
                filtrados.add(item);
            }
        });*/

        return alumnos.stream()
                .filter(item -> item.getNota() >= 5).toList();

        /*
        ------------------------
        ------
         */

    }
    public Optional<Alumno> getAlumnoByDNI(String dni) {
        // recorro y pregunto
        // con filter obtengo un -----
        /*
        ---------------------
        -
         */

        /*for (Alumno item: alumnos) {
            if (item.getDni().equals(dni)){
                return item;
            }
        }
        return null;*/
        return alumnos.stream().filter(item -> item.getDni().equals(dni)).findFirst();
    }

    public void getAlumnosUmbral(int nota){
        alumnos.stream().filter(item->item.getNota()>=nota).forEach(Alumno::mostrarDatos);
    }

    public void getAlumnosUmbral(BiPredicate<Alumno,Integer> predicate, int nota){
        // recorrer - preguntar por el predicado - recorrer el resultado - mostrar datos
        alumnos.stream().filter(item->predicate.test(item,nota)).forEach(Alumno::mostrarDatos);
    }

}
