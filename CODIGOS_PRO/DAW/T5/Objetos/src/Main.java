import model.Coche;
import model.Comprador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // primitiva porque no tienen funcionalidad
        int numero = 5;
        Integer numeroComplejo = 7;
        // compleja porque tiene funcionalidades
        String nombre = "Borja";
        nombre.length(); // 5
        String apellido = "Martin";
        apellido.length(); // 6
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        ArrayList<Integer> lista = new ArrayList<>();
        // TIPO_DATO nombreVariable = VALOR
        Coche ford = new Coche("Ford", "Focus", 150, 30000);
        // marca=Ford, modelo=Focus, color=null, numeroPuertas=0, cv=150, precio=30000
        Coche mercedes = new Coche("Mercedes", "ClaseC", 300, 70000);
        // marca=Mercedes, modelo=ClaseC, color=null, numeroPuertas=0, cv=300, precio=70000
        Coche audi = new Coche();
        // marca=null, modelo=null, color=null, numeroPuertas=0, cv=0, precio=20000
        Coche mondeo = new Coche("Ford", "Mondeo", 5, 150, 40000);

        // marca=Ford", modelo=Mondeo, color=null, numeroPuertas=5, cv=150, precio=40000
        // obtener el precio del coche
        Comprador comprador = new Comprador("Borja", "Martin",  "Madrid");
        System.out.println("La direccion de envio del coche sera "+comprador.getDireccion());

        mondeo.setPrecio(1000);
        System.out.println("El precio del mondeo es " + mondeo.getPrecio());

    }
}
