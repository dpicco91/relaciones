/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobrarelaciones.Servicio;

import java.util.Scanner;
import manosalaobrarelaciones.Entidades.Dni;
import manosalaobrarelaciones.Entidades.Persona;

/**
 *
 * @author dpicc
 */
public class PersonaDniServicio {
     
    Persona p = new Persona ();
    Dni d = new Dni();
    String serie;
    int numero;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
    public Persona CargarPersona(){
        System.out.println("-------------------------------------");
        System.out.println("INGRESE SU NOMBRE");
        p.setNombre(leer.next());
        System.out.println("-------------------------------------");
        System.out.println("INGRESE SU APELLIDO");
        p.setApellido(leer.next());
        System.out.println("--------------------------------------");
        System.out.println("INGRESE LA SERIE DE SU DNI");
        serie = leer.next();
        System.out.println("-------------------------------------");
        System.out.println("INGRESE SU NUMERO DE DOCUMENTO");
        numero=leer.nextInt();
                       
       d.setSerie(serie);
       d.setNumero(numero);
       p.setDni(d);
       return p;
    }
    public void mostrar(Persona p) {
        System.out.println("SUS DATOS INGRESADOS SON: ");
        System.out.println(p.toString());
        
      
    }
}
