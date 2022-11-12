/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.JugadorEntidad;
import Entidad.RevolverEntidad;
import java.util.ArrayList;
import Entidad.JuegoEntidad;

import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class JuegoServicio {

    public JuegoEntidad llenarJuego(ArrayList<JugadorEntidad> jugadores, RevolverEntidad r) {
        JuegoEntidad miJuego = new JuegoEntidad();

        miJuego.setJugadores(jugadores);
        miJuego.setRevolver(r);
        return miJuego;
    }

    public void ronda(ArrayList<JugadorEntidad> jugadores, RevolverEntidad r) {
        JugadorServicio miServicio = new JugadorServicio();
        RevolverServicio miRevolver = new RevolverServicio();
        int cont = 1;
        System.out.println("--------------RONDA-------------" + cont);

        miRevolver.mostrar(r);
        miServicio.mostrar(jugadores);
       
        while (jugadores.size() != 1) {
            Iterator<JugadorEntidad> miIterator = jugadores.iterator();
            miServicio.disparo(r, jugadores);

            while (miIterator.hasNext()) {
                if (miIterator.next().getMojado() == true) {
                    miIterator.remove();
                    break;
                }

            }
            cont = cont + 1;

            System.out.println("--------------RONDA-------------" + cont);
            miRevolver.mostrar(r);
            miServicio.mostrar(jugadores);
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("--------------EL GANADOR ES:---------------");
        miServicio.mostrar(jugadores);

    }

}
