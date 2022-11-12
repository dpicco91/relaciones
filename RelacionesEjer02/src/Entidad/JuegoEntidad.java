/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class JuegoEntidad {
    private ArrayList<JugadorEntidad> jugadores;
    private RevolverEntidad revolver;

    public JuegoEntidad() {
    }

    public JuegoEntidad(ArrayList<JugadorEntidad> jugadores, RevolverEntidad revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<JugadorEntidad> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadorEntidad> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverEntidad getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverEntidad revolver) {
        this.revolver = revolver;
    }

    
    
}
