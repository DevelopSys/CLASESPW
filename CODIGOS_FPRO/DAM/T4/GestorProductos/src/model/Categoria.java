package model;

public enum Categoria {

    ALIMENTO,
    MUEBLE("este producto es un mueble para decorar"),
    ROPA,
    TECNOLOGIA("producto con capacidades tecnologicas");

    private String descripcion;
    private Categoria(String descripcion){
        this.descripcion = descripcion;
    }

    private Categoria() {
    }

    public String getDescripcion() {
        return descripcion;
    }
}
