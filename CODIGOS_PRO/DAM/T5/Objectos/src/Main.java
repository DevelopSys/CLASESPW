import model.Coche;

public class Main {

    public static void main(String[] args) {

        // esto es la instancia de la clase -> un objeto de la clase
        Coche vw = new Coche("VW", "Blanco", "23456A", "Tiguan", 150);
        // marca=VW, modelo=Tiguan, bastidor=23456A, color=Blanco
        // cv=150, velocidad=0
        // precio= 0.0
        Coche ford = new Coche("Ford", "Verde", "1234A", "Focus", 150);
        // marca=Ford, modelo=Focus, bastidor=1234A, color=Verde
        // cv=150, velocidad=0
        // precio= 0.0
        Coche opel = new Coche();
        // marca=null, modelo=null, bastidor=null, color=null
        // cv=0, velocidad=0
        // precio=0
        Coche mercedes = new Coche("Mercedes", "Clase C", 80000);
        // marca=Mercedes, modelo=Clase C, bastidor=null, color=null
        // cv=0, velocidad=0
        // precio=80000
        Coche audi = new Coche("Audi", "Etron", 500,120000);
        ford.mostrarDatos();
        // audi.setCv(70);
        // System.out.println("Los CV que tiene el audi son "+audi.getCv());
        // System.out.println("El modelo del audi es "+audi.getModelo());
        // marca=Audi, modelo=Etron, bastidor=null, color=null
        // cv=570, velocidad=0
        // precio=120000
    }
}
