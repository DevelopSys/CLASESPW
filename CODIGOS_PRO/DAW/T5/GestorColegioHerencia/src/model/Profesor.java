package model;

public abstract class Profesor extends Persona {

    private int salario;
    private int nHoras;
    public Profesor(){}

    public Profesor(String nombre, String apellido, int salario){
        super(nombre,apellido);
        this.salario = salario;
    }

    public Profesor(String nombre, String apellido, int salario, int nHora){
        super(nombre,apellido);
        this.salario = salario;
        this.nHoras = nHora;
    }

    @Override
    public void saludar() {
        // TODO escribir el contenido del metodo
        System.out.println("Soy profesor y vamos a impartir la clase");
    }

    public void corregirExamen(){
        System.out.println("Empezando la tarea");
        System.out.println("Vamos a corregir el examen");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario = " + salario);
        System.out.println("nHoras = " + nHoras);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }
}
