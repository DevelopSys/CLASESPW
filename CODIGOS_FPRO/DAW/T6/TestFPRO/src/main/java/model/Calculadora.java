package model;

public class Calculadora {

    public int sumar(int a, int b){
        return  a+b;
    }

    public int resta(int a, int b){
        return  a-b;
    }
    public int multi(int a, int b){
        return  a*b;
    }

    public double division(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("El segundo operando no es valido");
        }
        return  a/b;
    }
}
