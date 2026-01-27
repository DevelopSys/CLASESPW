package controller;

import model.Llamada;
import model.Tarificable;

import java.util.ArrayList;

public class Centralita {
    private ArrayList<Llamada> listaLLamadas;
    private double caja;

    public Centralita() {
        listaLLamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada) {
        if (llamada != null) {
            listaLLamadas.add(llamada);
            this.caja += llamada.getCoste();
            System.out.println("Llamada registrada con exito\n");

        } else {
            System.out.println("Llamada no registrada, error en el proceso");
        }
        /*if (llamada instanceof Tarificable) {
            ((Tarificable) llamada).calcularCoste();
        }*/
    }

    public void mostraLlamads() {
        // foreach
        /*for (Llamada llamada: listaLLamadas) {
            llamada.mostrarDatos();
        }*/
        // listaLLamadas.forEach(item->item.mostrarDatos());
        if (!listaLLamadas.isEmpty()) {
            listaLLamadas.forEach(Llamada::mostrarDatos);
        } else {
            System.out.println("Esta vacia");
        }
    }

    public ArrayList<Llamada> getListaLLamadas() {
        return listaLLamadas;
    }

    public void setListaLLamadas(ArrayList<Llamada> listaLLamadas) {
        this.listaLLamadas = listaLLamadas;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
