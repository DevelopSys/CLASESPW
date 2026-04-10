import model.Calculadora;

import java.net.CacheRequest;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la app de testing");
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(55,8));
        System.out.println(calculadora.restar(55,8));
        System.out.println(calculadora.multiplico(5,7));
        System.out.println(calculadora.divido(4,0));
    }
}
