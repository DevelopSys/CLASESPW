package model;

public enum Categoria {

    ALIMENTICION(),
    MUEBLES("esta categoria es de muebles para decorar"),
    ROPA(),
    TECNOLOGICO("esta categoria marca productos de ultima generacion");

    private String descipcion;

    Categoria() {
    }

    Categoria(String descipcion) {
        this.descipcion = descipcion;
    }

    public String getDescipcion() {
        return descipcion;
    }
}
