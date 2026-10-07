import model.Jugador;

public class Entrada {
    // metodo main

    // acceso static retorno main( argumentos ) { algoritmo }
    public static void main(String[] args){
        System.out.println("Iniciamos el juego de los objetos");

        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador("Maria",5,100,true);
        Jugador jugador3 = new Jugador("Marcos",8);
        Jugador jugador4 = new Jugador("Borja","borja@gmail.com");
        Jugador jugador5 = new Jugador();
        jugador2.saludar();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        System.out.println("Despues de la guerra....");
        jugador2.saludar();



    }
}
