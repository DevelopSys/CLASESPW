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

    public void resta(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 - this.operando2;
        this.tipo = "resta";
        System.out.println("Resta terminada");
    }

    public void multiplicacion(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 * this.operando2;
        this.tipo = "multiplicacion";
        System.out.println("Multiplicacion terminada");
    }

    public void division(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = (double) this.operando1 / this.operando2;
        this.tipo = "division";
        System.out.println("Division terminada");
    }
    public void modulo(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 % this.operando2;
        this.tipo = "modulo";
        System.out.println("Modulo terminada");
    }

    public double getResultado(){
        return resultado;
    }

    public String getTipo() {
        return tipo;
    }

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

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // resta, multiplicacion, division, modulo
}
