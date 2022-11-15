/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobrarelaciones;

import manosalaobrarelaciones.Entidades.Dni;
import manosalaobrarelaciones.Entidades.Persona;
import manosalaobrarelaciones.Servicio.PersonaDniServicio;

/**
 *
 * @author dpicc
 */
public class Manosalaobrarelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona p = new Persona ();
      Dni d = new Dni ();
      PersonaDniServicio s = new PersonaDniServicio();
      
      s.CargarPersona();
      s.mostrar(p);
      
    }
    
}
