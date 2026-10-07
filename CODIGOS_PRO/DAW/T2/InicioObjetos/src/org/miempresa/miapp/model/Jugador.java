package org.miempresa.miapp.model;

public class Jugador {

    // representa el "molde" de lo que sera un jugador real
    // atributos que cualifican -> nombre, nVidas, nHabilidad,
    public String nombre, clan;
    public int vidas, habilidad;
    public boolean estrella;

    // constructor -> la manera en la que se inicia el jugador -> 1 (de momento el vacio) a n
        // si creas mas de 1 constructor -> SOBRECARGA
        // si no hay constructor escrito, el vacio lo tienes disponible
        // si escribes un constructor diferente al vacio, el vacio se enmascara
            // 1 constuctor
            // 3 constructores
    // mod_acc (public) Jugador(tipo p1, tipo p2, tipo p3) {  }

    public Jugador(){}
    public Jugador(String nombre, String clan,
                   int vidas, int habilidad) {
        this.nombre = nombre; // la variable nombre del metodo = la variable nombre del metodo
        this.clan = clan;
        this.vidas = vidas;
        this.habilidad = habilidad;
        estrella = true;
    }
    public Jugador(String nombre, String clan, int vidas) {
        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        // this.habilidad;
        this.habilidad = (int) (Math.random() * 101);  // (0) (0 - 0.9999999999999) *101 -> 0-100.999999999999
    }
    public Jugador(int vidas,String nombre, String clan) {
        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        // this.habilidad;
        this.habilidad = (int) (Math.random() * 101);  // (0) (0 - 0.9999999999999) *101 -> 0-100.999999999999
    }

    // metodos -> las funcionalidades del elemento cuando sea real
    // mod_acc (private/public/protected) retorno (void/int/double) nombre( param ) {  }
    public void saludar()
    {
        System.out.println("Hola, mi nombre es "+this.nombre);
        System.out.println("Tengo una cantidad de habilidad de "+this.habilidad);
        System.out.printf("Tengo %d vidas\n",this.vidas);
    }
    public void lanzarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void recibirImpacto(){
        vidas--;
        System.out.printf("Mierda, me han dado, me quedan %d vidas\n",vidas);
    }


    public boolean estaMuerto(){
        System.out.println("Entro en el hospital, voy a comprobar si estoy muerto");
        boolean muerto = vidas<=0;
        return muerto;
    }


}
