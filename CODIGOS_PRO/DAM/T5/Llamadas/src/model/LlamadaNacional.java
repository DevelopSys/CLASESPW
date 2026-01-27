package model;

public final class LlamadaNacional extends Llamada implements Tarificable, Regulable {
    private int franja;

    public LlamadaNacional() {
    }

    public LlamadaNacional(long nOrigen, long nDestino, int duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
        // asigna nO nD d
        calcularCoste();
    }

    @Override
    public void calcularCoste() {
        switch (franja) {
            case 1 -> {
                setCoste(getDuracion() * 0.20);
            }
            case 2 -> {
                setCoste(getDuracion() * 0.25);
            }
            case 3 -> {
                setCoste(getDuracion() * 0.30);
            }

        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Llamada NACIONAL");
        super.mostrarDatos();
        System.out.println("franja = " + franja);
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }

    @Override
    public boolean regularNumeros() {
        return getnDestino() % 2 == 0 && getnOrigen() % 2 == 0 && getDuracion() % 2 == 0;
    }
}
