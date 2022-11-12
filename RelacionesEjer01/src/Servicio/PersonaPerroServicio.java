/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import Entidad.Perro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaPerroServicio {

    public Persona crearPersona() {
        Perro miPerro = new Perro();
        Persona miPersona = new Persona();
        String nombre;
        String raza;
        double tamano;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
        
        System.out.println("-------------DATOS DE PERSONA--------------");
        System.out.println("Ingrese su nombre");
        miPersona.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        miPersona.setApellido(leer.next());
        System.out.println("Ingrese su edad");
        miPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese su numero de documento");
        miPersona.setDocumento(leer.nextInt());
        System.out.println("-------------DATOS DE SU PERRO--------------");
        System.out.println("Ingrese nombre:");
        nombre = leer.next();
        System.out.println("Ingrese la raza");
        raza = leer.next();
        System.out.println("Ingrese el tamaño");
        tamano = leer.nextDouble();

        miPerro.setNombre(nombre);
        miPerro.setRaza(raza);
        miPerro.setTamano(tamano);

        miPersona.setPerro(miPerro);
        return miPersona;

    }
    
    
    
    
    

    public void mostrar(Persona mi) {
        System.out.println("-------------DATOS PERSONA Y DE SU PERRO--------------");
        System.out.println(mi.toString());        
    }
}
