package model;

public final class Interino extends Profesor {

    // saluda
    private int aniosExpericia;

    public Interino() {
    }

    public Interino(String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        // aniosExperiencia = 0
    }

    public Interino(String nombre, String apellido, int salario, int aniosExpericia) {
        super(nombre, apellido, salario);
        this.aniosExpericia = aniosExpericia;
    }

    public Interino(String nombre, String apellido, int salario, int nHora, int aniosExpericia) {
        super(nombre, apellido, salario, nHora);
        this.aniosExpericia = aniosExpericia;
    }

    public void realizarOposicion(){
        System.out.println("Vamos a realizar el examen de oposicion para plaza fija");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("aniosExpericia = " + aniosExpericia);
    }

    @Override
    public void saludar() {
        super.saludar();
        if (aniosExpericia > 0) {
            System.out.println("Solo tengo unos pocos años de experiencia");
        } else {
            System.out.println("Soy novato");
        }
        System.out.println("Vamos a ver que tal se da la clase");
    }

    public int getAniosExpericia() {
        return aniosExpericia;
    }

    public void setAniosExpericia(int aniosExpericia) {
        this.aniosExpericia = aniosExpericia;
    }
}
