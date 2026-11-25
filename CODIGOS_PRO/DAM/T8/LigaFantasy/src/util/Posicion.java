package util;

public enum Posicion {

    // conjunto de objetos con tamaño fijo donde se pueden cambiar los valores
    // conjunto de objetos con tamaño fijo, con valores predefinidos
    POR("Portero", "Alta"), DEL("Delantero", "Alta"),
    MED("Medio", "Media"), DEF("Defensa", "Media");

    private String nombre;
    private String incidencia;

    private Posicion(String nombre, String incidencia) {
        this.nombre = nombre;
        this.incidencia = incidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIncidencia() {
        return incidencia;
    }
}
