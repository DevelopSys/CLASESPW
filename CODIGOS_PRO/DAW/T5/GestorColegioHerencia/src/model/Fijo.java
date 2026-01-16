package model;

public final class Fijo extends Profesor implements Inpector{

    private int nHorasCotizadas;

    public Fijo() {
    }

    public Fijo(String nombre, String apellido, int salario, int nHorasCotizadas) {
        super(nombre, apellido, salario);
        this.nHorasCotizadas = nHorasCotizadas;
    }

    public Fijo(String nombre, String apellido, int salario, int nHora, int nHorasCotizadas) {
        super(nombre, apellido, salario, nHora);
        this.nHorasCotizadas = nHorasCotizadas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nHorasCotizadas = " + nHorasCotizadas);
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Soy un profesor fijo, doy la clase genial");
        System.out.println("Mi puesto no me lo quita nadie");
    }

    public void pedirAumento(int aumentar){
        // como le sumo salario
        this.setSalario(getSalario()+aumentar);
        System.out.println("Aumentas salario en "+aumentar);
    }

    public int getnHorasCotizadas() {
        return nHorasCotizadas;
    }

    public void setnHorasCotizadas(int nHorasCotizadas) {
        this.nHorasCotizadas = nHorasCotizadas;
    }

    @Override
    public void realizarInspeccion() {
        System.out.println("Inspeccionare pero pasare cosas por alto");
    }
}
