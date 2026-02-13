package controller;

import model.Alumno;

import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {
    private List<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor() {
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    }

    // agregar usuarios
    public void agregarUsuario(Alumno alumno) {
        // solo se puede agregar si el dni que me dices no esta en el mapa
        // if()
        // lanzar una excepcion
        // si lo agregas y no esta retorno un nulo
        // si lo agregas y esta retorno el que esta
        /*
        Alumno alumnoAgregado = alumnosMap.put(alumno.getDni(),alumno);
        if(alumnoAgregado!=null){
            System.out.printf("DNI %s duplicado, error en el proceso%n",alumno.getDni());
        } else {
            System.out.printf("Alumno con nombre %s agregado correctamente%n",alumno.getNombre());
        }

         */
        // recorro y pregunto en iteracion
        /*
        for (Alumno a : alumnos ) {
            if (a.getDni().equals(alumno.getDni())){

            }
        }*/
        boolean esta = alumnos.stream()
                .anyMatch(element -> element.getDni().equals(alumno.getDni()));
        if (esta) {
            System.out.println("No puedo utilizar este dni, usuario no agregado");
        } else {
            System.out.println("Alumno agregado correctamente");
            alumnos.add(alumno);
        }
        /*
           lista  -------------------
           stream ------------------- // -------------------
         */
    }

    public void calificarAlumnos() {
        // recorre una copia y lo modificas
        // alumnos.stream().forEach(element->element.setNota(10));
        alumnos.forEach(data ->
                {
                    if (data.getNota() < 0) {
                        data.setNota((int) (Math.random() * 10) + 1);
                    }
                }
        );
    }

    public void mostrarUsuarios() {

        alumnos.forEach(Alumno::mostrarDatos);
    }

    public void calcularNotaMedia() {
        // variable general
        // foreach -> sumar notas
        // divido entre n alumnos
        /*
        double media = 0.0;
        for (Alumno item : alumnos) {
            media += item.getNota();
        }
        media /= alumnos.size();*/
        double media = alumnos.stream().mapToDouble(Alumno::getNota).sum() / alumnos.size();
        System.out.println(media);
        /*
        alumnos -------------- Alumnos
        stream  -------------- Alumnos`
        map     -------------- Doubles (operables)
         */
    }

    // cuantos aprobados tengo en la lista
    public long getNumeroAprobados() {
        // recorro, pregunto >=5 sumatorio
        /*int numeroAprobados=0;
        for (Alumno a: alumnos ) {
            if(a.getNota()>=5){
                numeroAprobados++;
            }
        }*/
        /*
        ----------------------
        ------------
         */
        // return alumnos.stream().filter(item->item.getNota()>=5).count();
        return getAprobados().size();

    }

    public List<Alumno> getAprobados() {
         /*ArrayList<Alumno> aprobados = new ArrayList<>();
       alumnos.stream().filter(item-> {
            if (item.getNota()>=5){
                aprobados.add(item);
            }
        });*/

        return alumnos.stream().filter(item -> item.getNota() > 4).toList();
    }

    public Optional<Alumno> buscarDNI(String dni) {
        // si el correo que estas buscando no esta -> null
        /*for (Alumno a : alumnos) {
            if (a.getDni().equals(dni)){
                return a;
            }
        }
        return null;*/
        return alumnos.stream().filter(item -> item.getDni().equals(dni)).findFirst();
        // return alumnos.stream().findAny();
    }

    public void ordenarAlumnos() {
        /*alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                if (o1.getNota() > o2.getNota()) {
                    return 1;
                } else if (o1.getNota() < o2.getNota()) {
                    return -1;
                }
                return 0;
            }
        });*/
        alumnos = alumnos.stream().sorted(Comparator.comparingInt(Alumno::getNota).reversed()).toList();
        // alumnos.forEach(Alumno::mostrarDatos);
    }

    // obtener los alumnos que tengan una nota > 7.5
    public List<Alumno> getAlumnosNota(int nota) {
        return (ArrayList<Alumno>)alumnos.stream().filter(item -> item.getNota() > 7.5).toList();
    }

    public List<Alumno> getAlumnosNota(BiPredicate<Alumno, Double> predicado, double nota) {
        return alumnos.stream().
                filter(item -> predicado.test(item, nota)).toList();
    }

}
