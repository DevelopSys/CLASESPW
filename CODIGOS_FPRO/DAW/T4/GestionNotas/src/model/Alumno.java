package model;

public class Alumno {
    private String nombre, apellido, dni;
    private int nota;

    public Alumno(String nombre, String apellido, String dni, int nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = nota;
    }

    // sobrecargar el metodo -> crea el un constructor (mismo nombre de metodo) pero con firma diferente
    public Alumno(String nombre, String apellido, String dni){
        // this(nombre,apellido,dni,-1);
        // this(nombre,apellido,dni,0);
        // nota = 0
        /*this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = -1;*/
        this(nombre,apellido,dni,-1);
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("nota = " + nota);
    }

    public void calcularMedia(){
        double media = ((double) nota*3+nota*4)/2;
        System.out.println("media = " + media);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
