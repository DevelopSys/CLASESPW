package model;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private int gLocales, gVisitantes;
    private boolean jugado;

    public Partido() {
    }

    // Albacete 3 Madrid 2
    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int gLocales, int gVisitantes) {
        /*if (equipoVisitante.getNombre().equals(equipoVisitante.getNombre())){
            System.out.println("Tongo, este partido no vale");
        } else {}*/


        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.gLocales = gLocales;
        this.gVisitantes = gVisitantes;
        equipoLocal.setgFavor(equipoLocal.getgFavor() + gLocales);
        equipoLocal.setgContra(equipoLocal.getgContra() + gVisitantes);
        equipoVisitante.setgFavor(equipoVisitante.getgFavor() + gVisitantes);
        equipoVisitante.setgContra(equipoVisitante.getgContra() + gLocales);
        jugado = true;

    }

    public void mostrarDatos() {
        System.out.printf("%s:%d vs %d:%s%n", equipoLocal.getNombre(), gLocales, gVisitantes, equipoVisitante.getNombre());
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getgLocales() {
        return gLocales;
    }

    public void setgLocales(int gLocales) {
        this.gLocales = gLocales;
    }

    public int getgVisitantes() {
        return gVisitantes;
    }

    public void setgVisitantes(int gVisitantes) {
        this.gVisitantes = gVisitantes;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }
}
