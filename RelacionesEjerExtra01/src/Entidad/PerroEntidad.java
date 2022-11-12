/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class PerroEntidad {

    private String nombre;
    private String raza;
    private double tamano;
    private boolean adoptado;

    public PerroEntidad() {
    }

    public PerroEntidad(String nombre, String raza, double tamano, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "PerroAdoptado: \n" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + ", adoptado=" + adoptado + "\n";
    }

    
    
    
}
