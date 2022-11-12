/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesejer02;

import Entidad.JugadorEntidad;
import Entidad.RevolverEntidad;
import java.util.ArrayList;
import Servicio.JugadorServicio;
import Servicio.JuegoServicio;
import Servicio.RevolverServicio;

/**
 *
 * @author Usuario
 */
public class RelacionesEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RevolverServicio miSevicioRevolver = new RevolverServicio();
        RevolverEntidad miRevolver = miSevicioRevolver.llenarRevolver();

        JugadorServicio miServicioJugador = new JugadorServicio();
        JuegoServicio miServicioJuego = new JuegoServicio();

        ArrayList<JugadorEntidad> miArrayList = miServicioJugador.inicio();

        miServicioJuego.llenarJuego(miArrayList, miRevolver);
//System.out.print("\033[H\033[2J");  
//System.out.flush();  

        System.out.println("LOS JUGADORES SON:");
        miServicioJugador.mostrar(miArrayList);
        System.out.println(" ");
        System.out.println("EMPIEZA EL JUEGO!!!");
        miServicioJuego.ronda(miArrayList, miRevolver);

    }

}
