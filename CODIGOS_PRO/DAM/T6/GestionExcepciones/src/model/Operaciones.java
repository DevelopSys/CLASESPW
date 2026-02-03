package model;

import util.ResultadoExcepcion;

import java.util.NoSuchElementException;

public class Operaciones {

    public int operarSuma(int op1, int op2){
        return op1+op2;
    }

    public int operarResta(int op1, int op2) throws ResultadoExcepcion {
        if (op2>op1){
            // hay error
            throw new ResultadoExcepcion("El resultado de la resta es negativo");
        }
        return op1-op2;
    }

    public int operarMulti(int op1, int op2)  {
        return op1*op2;
    }

    // public int operarDiv(int op1, int op2) throws ArithmeticException, Exception
    public int operarDiv(int op1, int op2) throws ArithmeticException{
        return op1/op2;
    }
}
