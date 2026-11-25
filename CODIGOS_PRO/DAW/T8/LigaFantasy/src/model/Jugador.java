package model;

import util.Posiciones;

import java.util.Map;

public class Jugador {

    private int id;
    private String nombre, apellido;
    private int goles, calidad,precio;
    private Posiciones posicion;
    private boolean estrella;

    public Jugador(){}


    public Jugador(int id, String nombre, String apellido, int calidad, int precio, Posiciones posicion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calidad = calidad;
        this.precio = precio;
        this.posicion = posicion;
        if(this.calidad>90){
            estrella = true;
        }
    }

    public Jugador(int id, String nombre, String apellido, int precio, Posiciones posicion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.precio = precio;
        this.posicion = posicion;
        this.calidad = (int) (Math.random() *21)+60; // 60-80
        if(this.calidad>90){
            estrella = true;
        }
    }

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("goles = " + goles);
        System.out.println("calidad = " + calidad);
        System.out.println("precio = " + precio);
        System.out.println("posicion = " + posicion.getNombre());
        System.out.println("estrella = " + estrella);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
