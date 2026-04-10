import model.Calculadora;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bievenidos a la app para ejecutar pruebas");
        Calculadora calculadora = new Calculadora();
        // System.out.println(calculadora.sumar(5,8));
        // System.out.println(calculadora.resta(5,8));
        // System.out.println(calculadora.multi(5,8));
        System.out.println(calculadora.division(5,0));

    }
}
