package controller;

public class ControllerMatematico {

    // 0 1 1 2
    public int calculoNumeroFB(int posicion) {
        if (posicion == 0) return 0;
        if (posicion == 1) return 1;
        return calculoNumeroFB(posicion-1) + calculoNumeroFB(posicion-2);
    }

}
