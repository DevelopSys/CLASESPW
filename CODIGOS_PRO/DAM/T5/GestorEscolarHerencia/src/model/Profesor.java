package model;

public class Profesor extends Persona{

    private int salario, nExperiencia;

    public Profesor(){}



    public Profesor(String nombre, String apellido, int salario) {
        super(nombre, apellido);
        this.salario = salario;
    }

    public Profesor(String nombre, String apellido, int salario, int nExperiencia) {
        super(nombre, apellido);
        this.salario = salario;
        this.nExperiencia = nExperiencia;
    }

    @Override
    public void saludar() {
        System.out.println("Vamos a saludar, soy un profesor");
    }

    public void corregirExamen(){
        System.out.println("Procedo a corregir el examen de los alumnos");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario = " + salario);
        System.out.println("nExperiencia = " + nExperiencia);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getnExperiencia() {
        return nExperiencia;
    }

    public void setnExperiencia(int nExperiencia) {
        this.nExperiencia = nExperiencia;
    }
}
