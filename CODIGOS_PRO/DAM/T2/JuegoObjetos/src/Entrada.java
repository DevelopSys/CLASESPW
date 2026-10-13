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
        jugador2.setNombre("Jose");
        jugador2.setNombre("");
        System.out.println("El nombre del jugador es "+jugador2.getNombre());
        System.out.println("El estrellas del jugador es "+jugador2.isEstrella());
        System.out.println("El habilidad del jugador es "+jugador2.getHabilidad());
        System.out.println("El vidas del jugador es "+jugador2.getVidas());
        System.out.println("El correo del jugador es "+jugador2.getCorreo());
        // jugador2.saludar();
        // jugador2.saludar("Comanzar la partida");




    }
}
