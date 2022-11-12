/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Entidad.PerroEntidad;

/**
 *
 * @author Usuario
 */
public class PersonaEntidad {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private PerroEntidad perro;

    public PersonaEntidad() {
    }

    public PersonaEntidad(String nombre, String apellido, int edad, int documento, PerroEntidad perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public PerroEntidad getPerro() {
        return perro;
    }

    public void setPerro(PerroEntidad perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Los datos de la persona y su perro adoptado: \n" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", " + perro.toString() + '}';
    }

}
