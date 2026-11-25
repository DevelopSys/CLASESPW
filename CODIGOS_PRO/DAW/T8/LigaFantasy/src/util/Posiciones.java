package util;

public enum Posiciones {

    // dime cuales son los valores que tiene este "array"
    POR("portero", "alta"), DEF("defensa", "media"), MED("mediocampista", "media"), DEL("delanterio", "alta");

    private String nombre;
    private String incidencia;

    private Posiciones(String nombre, String incidencia) {
        this.incidencia = incidencia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIncidencia() {
        return incidencia;
    }
}
