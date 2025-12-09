package model;

import lombok.*;

import java.util.Objects;

// @Getter
// @Setter
// @Getter
// @Setter
@Data
@AllArgsConstructor
public class Coche
{
    private String marca, modelo, bastidor, color;
    private int cv, velocidad;
    private double precio;
    private boolean usado;

    // por defecto, en toda clase hay un constructor que se denomina constructor vacio
        // desaparece implicito cuando escribo otro constructor
    // public Coche(){ cuerpo }
    public Coche(){}
    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Coche(String marca, String modelo, int cv, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
    }
    public Coche(String marca,String color, String bastidor, String modelo,int cv) {
        this.marca = marca;
        this.cv = cv;
        this.color = color;
        this.bastidor = bastidor;
        this.modelo = modelo;
    }

    public void mostrarDatos(){
        System.out.println("Mostrando los datos del coche");
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("bastidor = " + bastidor);
        System.out.println("color = " + color);
        System.out.println("cv = " + cv);
        System.out.println("velocidad = " + velocidad);
        System.out.println("precio = " + precio);
        System.out.println("usado = " + usado);
    }

    /*
    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCv(){
        // puedo hacer validaciones de datos
            // los cv del coche han sido modificados;
                // en caso de estar modificados retorno los reales
        return this.cv;
    }

    public void setCv(int cv){
        // this.cv = this.cv +cv;
        // si el coche al cambiarlos pasa de 1000CV, se queda con 1000, es el tope
        this.cv += cv;
    }

     */

    /*
    @Override
    public String toString() {
        return this.modelo +" "+this.marca+" "+this.precio;
    }*/

}

