package org.miempresa.miapp;

import org.miempresa.miapp.model.Jugador;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Iniciando programa de juego");

        Jugador jugador1 = new Jugador("Borja", "clan1", 10, 100);
        //jugador1.saludar();
        // nombre=null, clan=clan1, estrella=false, vidas=10, habilidad=100
        Jugador jugador2 = new Jugador("Manuel", "clan2", 5, 9);
        // nombre=Manuel, clan=clan2, estrella=false, vidas=5, habilidad=9
        Jugador jugador3 = new Jugador("Marta", "clan1", 10, 100);
        // nombre=Marta, clan=clan1, estrella=false, vidas=10, habilidad=100
        Jugador jugador4 = new Jugador("Maria", "clan2", 7, 90);
        // jugador4.saludar();
        // nombre=Maria, clan=clan2, estrella=false, vidas=7, habilidad=90
        Jugador jugador5 = new Jugador();
        Jugador jugador6 = new Jugador("Lucas","clan4",8);
        Jugador jugador = new Jugador();
        jugador1.saludar();
        System.out.println("El jugador 1 esta muerto "+jugador1.estaMuerto());; // true o false
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        System.out.println("El jugador 1 esta muerto "+jugador1.estaMuerto());; // true o false
        jugador1.recibirImpacto();
        System.out.println("El jugador 1 esta muerto "+jugador1.estaMuerto());; // true o false
        jugador1.saludar();
        jugador2.recibirImpacto();

        // jugador1.lanzarMensaje("Este juego lo voy a ganar");

        // jugador2.lanzarMensaje("Ni de coña, lo gano yo");
        // jugador2.saludar();
        // jugador3.saludar();
        // jugador5.saludar();

        // nombre=Lucas, clan=clan4, estrella=false, vidas=8, habilidad=0

        // nombre=null, clan=null, estrella=false, vidas=0, habilidad=0

        // System.out.println("Es estrella el jugador 1 es " +jugador1.estrella);

    }

}
