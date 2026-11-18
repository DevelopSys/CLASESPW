package controller;

import model.Alumno;
import utils.NotaException;

import java.util.Arrays;
import java.util.Comparator;

public class Colegio {

    // atributos
    private String nombre;
    private Alumno[] alumnos;

    // constructores
    public Colegio() {
    }

    public Colegio(String nombre) {
        this.nombre = nombre;
        this.alumnos = new Alumno[5]; // [null, null, null, null, null]
    }

    public Colegio(String nombre, int plazas) {
        this.nombre = nombre;
        this.alumnos = new Alumno[plazas]; // [null*plazas]
    }

    // metodos

    // calificarAlumno - del alumno con un dni, modifica la nora
    public boolean calificarAlumno(String dni, double nota) throws NotaException {
        // busca al alumno
        Alumno encontrado = buscarAlumno(dni);
        if (encontrado != null) {
            encontrado.setNota(nota);
            return true;
        }
        return false;

    }

    // inscribirAlumno - meterá en el array el alumno pasado por parametros - lo meto en el primer sitio disponible
    public boolean inscribirAlumno(Alumno alumno) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                // hay hueco, meto al alumno
                // TODO * solo si no hay uno con dni identico -> buscar el dni del alumno que quieres agregar
                if (buscarAlumno(alumno.getDni()) == null) {
                    alumnos[i] = alumno;
                    // alumno agregado correctamente
                    return true;
                }
            }
        }
        return false;
    }

    // expulsarAlumno -> eliminar
    public Alumno eliminarAlumno(String dni) {

        if (buscarAlumno(dni) != null) {
            // cambiar valores a null -> los de la posicion del alumno con el dni encontado
            for (int i = 0; i < alumnos.length; i++) {
                if (alumnos[i].getDni().equalsIgnoreCase(dni)) {
                    Alumno encontrado = alumnos[i];
                    alumnos[i] = null;
                    return encontrado;
                }
            }
        }
        return null;
    }

    // ordenar notas -> muestra los alumnos con notas de mayor a menor
    public void ordenarNotas(){
        Arrays.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                // TODO ordenar los alumnos por notas de mayor a menor
                // 1  / -1
                return 0;
            }
        });
        // ordenacion natural (numericamente, alfabeticamente)
    }


    // buscarAlumno -> buscar un alumno con un dni concreto
    public Alumno buscarAlumno(String dni) {

        // recorre y en cada vuelta pregunta al alumno que iteras por su dni
        for (Alumno item : alumnos) {
            if (item != null && item.getDni().equalsIgnoreCase(dni)) {
                return item;
            }
        }
        return null;
    }

    // mostrarAlumnos - mostrará los datos de todos los alumnos matriculados
    public void mostrarAlumnos() {
        for (Alumno item : alumnos) {
            if (item != null) {
                item.mostrarDatos();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
}
