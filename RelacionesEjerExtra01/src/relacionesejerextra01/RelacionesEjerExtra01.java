/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesejerextra01;

import Entidad.AdopcionEntidad;
import Entidad.PerroEntidad;
import Entidad.PersonaEntidad;
import Servicio.PersonaPerroServicio;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class RelacionesEjerExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaPerroServicio miServicio = new PersonaPerroServicio();
        
        ArrayList<PersonaEntidad> miPersona = miServicio.crearListaPersona();
        ArrayList<PerroEntidad> miPerro = miServicio.crearListaPerros();
        System.out.println("LOS PERROS A ADOPTAR SON:");
        miServicio.mostrarPerros(miPerro);
        HashMap <PerroEntidad, PersonaEntidad> adoptados = miServicio.adopcion(miPersona, miPerro);

        
         System.out.println("LOS PERROS ADOPTADOS SON:");
        miServicio.perrosAdoptados(adoptados);
    }
}
