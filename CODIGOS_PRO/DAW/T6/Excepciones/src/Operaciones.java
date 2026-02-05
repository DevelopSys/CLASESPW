import utils.ResultadoException;

public class Operaciones {

    public void operar(int op1, int op2) throws ArithmeticException, ResultadoException {
        /*try{

        }catch (){

        }*/
        int suma = op1 + op2;
        int multiplicacion = op1 * op2;
        int division = op1 / op2;
        int resta;
        if (op2 > op1) {
            throw new ResultadoException("El sistema detecta una resta negativa " + (op1 - op2));
        }
        resta = op1 - op2;
        // = op1-op2;
        // en caso de tener una resta negativa, quiero un fallo
        // la solucion será poner la resta a 0
        System.out.println("Los resultado son");
        System.out.println("Suma " + suma);
        System.out.println("Multiplicacion " + multiplicacion);
        System.out.println("Division " + division);
        System.out.println("Resta " + resta);
    }
}
