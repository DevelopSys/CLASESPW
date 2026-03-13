package controller;

public class EjerciciosNumericos {

    public int numerosFibonacci(int posicion){
        // calcular el numero de la posicion n de fobonacci
        // 0,1
        if(posicion==0) return 0;
        if(posicion==1) return 1;
        return numerosFibonacci(posicion-1)+numerosFibonacci(posicion-2);
        // return numerosFibonacci(6)+numerosFibonacci(5);
    }

}
