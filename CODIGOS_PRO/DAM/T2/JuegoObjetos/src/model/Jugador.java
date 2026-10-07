package model;

// importaciones

// model de un jugador
public class Jugador {

    // atributos -> variables que cualifican
    public String nombre, correo;
    public int vidas, habilidad;
    public boolean estrella;

    // constructores -> hace realidad el objeto. 1 a n. Si no escribo nada tengo 1
    // constructores: 1
    // si no tienes ningun constructor escrito -> tienes el vacio
    // si escribes un constructor (cualquiera) -> el vacio queda enmascarado
    // tener mas de 1 constructor -> SOBRECARGA
    public Jugador() {
        this.nombre = "Bot";
        this.estrella = true;
        this.habilidad = (int) (Math.random() * 101); // 76
        this.correo = "sistema@gmail.com";
    }

    public Jugador(String nombre, int vidas, int habilidad, boolean estrella) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.habilidad = habilidad;
        this.estrella = estrella;
    }

    public Jugador(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
        // habilidad = 0
    }

    public Jugador(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // metodos -> funcionalidades
    public void saludar() {
        System.out.println("Hola me llamo " + nombre);
        System.out.printf("Actualmente tengo %d vidas\n", vidas);
    }

    public void recibirImpacto() {
        if (vidas==0){
            System.out.println("Estoy muerto");
        } else if (vidas < 0){
            System.out.println("Para, ya estoy muerto");
        } else {
            vidas--;
        }
    }


}
