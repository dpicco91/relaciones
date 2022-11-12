/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.PerroEntidad;
import Entidad.PersonaEntidad;
import Entidad.AdopcionEntidad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaPerroServicio {

    public ArrayList<PersonaEntidad> crearListaPersona() {

        AdopcionEntidad miAdopcion = new AdopcionEntidad();

        ArrayList<PersonaEntidad> grupoDePersonas = new ArrayList();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opc = 1;
        String opc2;

        while (opc != 0) {
            PersonaEntidad miPersona = crearPersona();

            grupoDePersonas.add(miPersona);
            miAdopcion.setPersonas(grupoDePersonas);

            System.out.println("Desea ingresar otra persona?");
            opc2 = leer.next();
            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;

            } else {
                opc = 0;
            }
        }

        return grupoDePersonas;
    }

    public PersonaEntidad crearPersona() {
        PersonaEntidad miPersona = new PersonaEntidad();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("-------------DATOS DE PERSONA--------------");
        System.out.println("Ingrese el nombre");
        miPersona.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        miPersona.setApellido(leer.next());
        System.out.println("Ingrese la edad");
        miPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese el numero de documento");
        miPersona.setDocumento(leer.nextInt());

        return miPersona;
    }

    public ArrayList<PerroEntidad> crearListaPerros() {
        AdopcionEntidad miAdopcion = new AdopcionEntidad();

        ArrayList<PerroEntidad> grupoDePerros = new ArrayList();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opc = 1;
        String opc2;

        while (opc != 0) {
            PerroEntidad miPerro = crearPerro();
            grupoDePerros.add(miPerro);
            miAdopcion.setPerros(grupoDePerros);

            System.out.println("Desea ingresar otro perro?");
            opc2 = leer.next();
            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;

            } else {
                opc = 0;
            }
        }

        return grupoDePerros;
    }

    public PerroEntidad crearPerro() {
        PerroEntidad miPerro = new PerroEntidad();

        String nombre;
        String raza;
        double tamano;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("-------------DATOS DEL PERRO--------------");
        System.out.println("Ingrese nombre:");
        nombre = leer.next();
        System.out.println("Ingrese la raza");
        raza = leer.next();
        System.out.println("Ingrese el tamaño");
        tamano = leer.nextDouble();

        miPerro.setNombre(nombre);
        miPerro.setRaza(raza);
        miPerro.setTamano(tamano);
        miPerro.setAdoptado(false);
        return miPerro;
    }

    public HashMap<PerroEntidad, PersonaEntidad> adopcion(ArrayList<PersonaEntidad> grupoDePersonas, ArrayList<PerroEntidad> grupoDePerros) {
        AdopcionEntidad miAdopcion = new AdopcionEntidad();
        HashMap<PerroEntidad, PersonaEntidad> miHash = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        for (PersonaEntidad miPersona : grupoDePersonas) {
            System.out.println(miPersona.getNombre() + " que perro desea adoptar? Ingrese el nombre");
            String nombre = leer.next();

            for (PerroEntidad miPerro : grupoDePerros) {
                if (miPerro.getNombre().equalsIgnoreCase(nombre)) {
                    if (miPerro.getAdoptado() == false) {
                        miPerro.setAdoptado(true);
                        miPersona.setPerro(miPerro);
                        System.out.println("FELICIDADES!!");
                        miHash.put(miPerro, miPersona);
                        miAdopcion.setAdoptados(miHash);

                    } else {
                        System.out.println("El perro esta adoptado");
                    }
                }else
                {
                    System.out.println("El nombre del perro ingresado no existe");
                }

            }
        }

        return miHash;

    }

    public void perrosAdoptados(HashMap<PerroEntidad, PersonaEntidad> adoptados) {
            System.out.println(adoptados);
    }

    
    
    
    
    public void mostrar(PersonaEntidad mi) {
        System.out.println("-------------DATOS PERSONA Y DE SU PERRO--------------");
        System.out.println(mi.toString());
    }

    public void mostrarPerros(ArrayList<PerroEntidad> grupoDePerros) {
        for (int i = 0; i < grupoDePerros.size(); i++) {
            System.out.println(grupoDePerros.get(i).getNombre());

        }
    }

}
