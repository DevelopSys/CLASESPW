package controller;

import lombok.Getter;
import lombok.Setter;
import model.Llamada;
import model.LlamadaLocal;

import java.awt.datatransfer.FlavorListener;
import java.util.ArrayList;

@Setter
@Getter

public class Centralita {

    private ArrayList<Llamada> listaLlamadas;
    private double caja;

    public Centralita() {
        listaLlamadas = new ArrayList<>();
        // caja = 0.0
    }

    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        caja += llamada.getCoste();
    }

    public void mostraDatosLlamadas(){
        System.out.printf("Hay un total de %d llamadas%n",listaLlamadas.size());
        if (!listaLlamadas.isEmpty()){
            for (Llamada llamada: listaLlamadas) {
                llamada.mostrarDatos();
            }
        }
    }

    public void mostrarCaja(){
        System.out.println("Los beneficios del dia de hoy son: "+caja);
    }
}
