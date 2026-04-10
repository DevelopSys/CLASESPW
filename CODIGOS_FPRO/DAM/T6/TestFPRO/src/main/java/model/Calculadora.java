package model;

public class Calculadora {

    public int sumar(int a, int b){
        return a+b;
    }
    public int restar(int a, int b){
        return a-b;
    }

    public int multiplico(int a, int b){
        return a*b;
    }

    public double divido(int a, int b){
        if (b ==0){
            // Exception
                // RunTimeEx
                // IOEx
            throw new IllegalArgumentException("Error en el parametro divison");
            // System.out.println("Error en el parametro");
        }
        return a/b;
    }
}
