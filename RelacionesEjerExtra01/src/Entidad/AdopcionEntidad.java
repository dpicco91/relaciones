/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Entidad.PerroEntidad;
import Entidad.PersonaEntidad;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class AdopcionEntidad {

    private HashMap<PerroEntidad, PersonaEntidad> adoptados;
    private ArrayList<PersonaEntidad> personas;
    private ArrayList<PerroEntidad> perros;

    public AdopcionEntidad() {
    }

    public AdopcionEntidad(HashMap<PerroEntidad, PersonaEntidad> adoptados, ArrayList<PersonaEntidad> personas, ArrayList<PerroEntidad> perros) {
        this.adoptados = adoptados;
        this.personas = personas;
        this.perros = perros;
    }

    public HashMap<PerroEntidad, PersonaEntidad> getAdoptados() {
        return adoptados;
    }

    public void setAdoptados(HashMap<PerroEntidad, PersonaEntidad> adoptados) {
        this.adoptados = adoptados;
    }

    public ArrayList<PersonaEntidad> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<PersonaEntidad> personas) {
        this.personas = personas;
    }

    public ArrayList<PerroEntidad> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<PerroEntidad> perros) {
        this.perros = perros;
    }

   

}
