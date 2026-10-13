package model;

public class Calculadora {
    // atributos
        // operador1, operador2, tipoOperacion, resultado
    private int operando1, operando2;
    private double resultado;
    private String tipo;
    // constructores -> el vacio lo tengo por defecto. Ojo, desaparece si escribo otro!
    public Calculadora(){}
    // metodos
        // suma, resta, multiplica, divide, modula
    public void sumar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2;
        this.tipo = "suma";
        System.out.println("Suma terminada");
    }

    public double getResultado(){
        return resultado;
    }

    public String getTipo() {
        return tipo;
    }

    // resta, multiplicacion, division, modulo
}
