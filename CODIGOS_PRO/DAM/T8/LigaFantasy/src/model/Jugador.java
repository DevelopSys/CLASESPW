package model;

import util.Posicion;

public class Jugador {
    private int id;
    private String nombre;
    private int calidad;
    private boolean estrella;
    private int precio;
    private Posicion posicion;

    public Jugador(){}

    public Jugador(int id, String nombre, int calidad, int precio, Posicion posicion) {
        this.id = id;
        this.nombre = nombre;
        this.calidad = calidad;
        this.precio = precio;
        this.posicion = posicion;
        this.estrella = this.calidad > 90;
    }

    public Jugador(int id, String nombre, int precio, Posicion posicion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        this.calidad = (int) (Math.random() *21)+60; // 60-80
    }

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("calidad = " + calidad);
        System.out.println("estrella = " + estrella);
        System.out.println("precio = " + precio);
        System.out.println("posicion = " + posicion.getNombre());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
