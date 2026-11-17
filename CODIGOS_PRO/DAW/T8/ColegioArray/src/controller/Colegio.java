package controller;

import model.Alumno;

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

    // calificarAlumno
    // inscribirAlumno - meterá en el array el alumno pasado por parametros - lo meto en el primer sitio disponible
    public boolean inscribirAlumno(Alumno alumno) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                // hay hueco, meto al alumno (TODO * solo si no hay uno con dni identico)
                alumnos[i] = alumno;
                // alumno agregado correctamente
                return true;
            }
        }
        return false;
    }
    // expulsarAlumno
    // buscarAlumno

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
