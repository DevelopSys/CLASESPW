package controller;

public class Calculadora {
    // atributos
    private int operando1,operando2;
    private double resultado;

    // constructores -> el vacio esta por defecto, siempre y cuando no tenga ningun constructor escrito
    public Calculadora(){}

    // realizar el resto de funcionalidades del sistema -> resta, multiplicacion, division, modulo
    public void sumar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2;
        System.out.println("Suma completada");
    }

    // metodos
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
