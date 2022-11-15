/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import enumeraciones.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 3. Realizar una baraja de cartas españolas orientada a objetos. Una carta
 * tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo
 * (espadas, bastos, oros y copas). Esta clase debe contener un método
 * toString() que retorne el número de carta y el palo. La baraja estará
 * compuesta por un conjunto de cartas, 40 exactamente. Las operaciones que
 * podrá realizar la baraja son: • barajar(): cambia de posición todas las
 * cartas aleatoriamente. • siguienteCarta(): devuelve la siguiente carta que
 * está en la baraja, cuando no haya más o se haya llegado al final, se indica
 * al usuario que no hay más cartas. • cartasDisponibles(): indica el número de
 * cartas que aún se puede repartir. • darCartas(): dado un número de cartas que
 * nos pidan, le devolveremos ese número de cartas. En caso de que haya menos
 * cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al
 * usuario. • cartasMonton(): mostramos aquellas cartas que ya han salido, si no
 * ha salido ninguna indicárselo al usuario • mostrarBaraja(): muestra todas las
 * cartas hasta el final. Es decir, si se saca una carta y luego se llama al
 * método, este no mostrara esa primera carta.
 */
public class ServicioBaraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public LinkedList<Baraja> crear_baraja() {
        Baraja p1 = new Baraja();
        LinkedList<Baraja> car = new LinkedList();

        for (int i = 1; i <= 12; i++) {
            if (i != 9 && i != 8) {
                car.add(new Baraja(Palos.BASTO, i));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (i != 9 && i != 8) {
                car.add(new Baraja(Palos.ORO, i));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (i != 9 && i != 8) {
                car.add(new Baraja(Palos.COPA, i));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (i != 9 && i != 8) {
                car.add(new Baraja(Palos.ESPADA, i));
            }
        }

        return car;
    }

    public void recorrerMazo(LinkedList<Baraja> car) {

        for (Baraja baraja : car) {
            System.out.println(baraja);
        }

    }

    public void barajar(LinkedList<Baraja> car) {

        Collections.shuffle(car);

    }

    public void siguienteCarta(LinkedList<Baraja> car) {
        /**
         * devuelve la siguiente carta que está en la baraja, cuando no haya más
         * o se haya llegado al final, se indica al usuario que no hay más
         * cartas.
         */
        System.out.println(car.getLast());
        if (car.isEmpty() == true) {
            System.out.println("No quedan mas cartas");
        } else {
            System.out.println("Todavia quedan cartas");
        }
    }

    public void cartasDisponibles(LinkedList<Baraja> car){
    
        System.out.println("Quedan para repartir: "+ car.size());
    
    
    
    }
    public List<Baraja> darCartas(LinkedList<Baraja> car) {
        /**
         * dado un número de cartas que nos pidan, le devolveremos ese número de
         * cartas. En caso de que haya menos cartas que las pedidas, no
         * devolveremos nada, pero debemos indicárselo al usuario.
         */
        List<Baraja> dadas = new ArrayList();
        System.out.println("Ingrese cantidad de cartas que desea entregar: ");
        int dar = leer.nextInt();

        if (dar <= car.size()) {
            for (int i = 0; i < dar; i++) {
                dadas.add(car.getLast());
                car.removeLast();
            }
        } else {
            System.out.println("La cantidad de cartas solicitadas es mayor a las disponibles.");
            System.out.println("Cartas disponibles: " + car.size());

        }
    return dadas;
    }
    
    public void darMonton(List<Baraja> dadas){
    /**
     * mostramos aquellas cartas que ya han salido, si no
 * ha salido ninguna indicárselo al usuario 
     */
     System.out.println("Las cartas que ya han salido son: ");
        for (Baraja dada : dadas) {
           
            System.out.println(dada);
        }
        if(dadas.isEmpty()== true){
            System.out.println("Todavia no han salido cartas");
        }else{
            System.out.println("Ya han salido cartas");
        }
    }
}
