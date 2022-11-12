/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.JugadorEntidad;
import Entidad.RevolverEntidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JugadorServicio {

    public ArrayList<JugadorEntidad> inicio() {

        ArrayList<JugadorEntidad> miJugador = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");  
        System.out.println("Cuantos jugadores son:");
        int jug = leer.nextInt();
        int cont2 = 0;
        while (cont2 != jug) {
            if (miJugador.size() < 6) {
                cont2 = cont2 + 1;
                JugadorEntidad miJugador1 = crearJugador();
                miJugador.add(miJugador1);
            } else {
                System.out.println("SE COMPLETARON LOS 6 JUGADORES");
                break;
            }
        }
        int cont = 0;
        for (JugadorEntidad m : miJugador) {
            cont = cont + 1;
            m.setId(cont);
        }
        return miJugador;
    }
    
    int cont = 1;

    public JugadorEntidad crearJugador() {

        JugadorEntidad miJugador = new JugadorEntidad();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese nombre del " + cont + "° jugador");
        miJugador.setNombre(leer.next());
        cont = cont + 1;
       
        miJugador.setMojado(false);

        return miJugador;
    }

    public void disparo(RevolverEntidad m, ArrayList<JugadorEntidad> jugadores) {
        RevolverServicio miRevolverServicio = new RevolverServicio();

        boolean miBool = miRevolverServicio.mojar(m);

        for (JugadorEntidad mi : jugadores) {
            if (miBool == true) {

                mi.setMojado(true);
                if (mi.getMojado() == true) {
                    System.out.println(" ");

                    System.out.println(" ");
                    System.out.println("JUGADOR: " + mi.getNombre() + " ESTA ELIMINADO");
                    System.out.println(" ");

                    System.out.println(" ");
                }
                break;
            }

        }

        miRevolverServicio.siguienteChorro(m);

    }

    public void mostrar(ArrayList<JugadorEntidad> mi) {
        System.out.println(mi);
    }
}
