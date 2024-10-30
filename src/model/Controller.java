package model;

import model.Persona;
import model.JugadorDeTenis;
import model.JuezDeSilla;
import model.JuezDeLinea;
import model.ManoDominante;

public class Controller {


    private Persona[] personas;

    /**
     * Constructor de la clase Controller para inicializar el arreglo de personas.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller con un arreglo de personas vacío.
     */
    public Controller() {
        personas = new Persona[12];
    }

    public void crearJugadorDeTenis(String nombre, int edad, int ranking, ManoDominante manoDominante) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = new JugadorDeTenis(nombre, edad, ranking, manoDominante);
                break;
            }
        }
    }

    public void crearJuezDeSilla(String nombre, int edad, int nivelExperiencia) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = new JuezDeSilla(nombre, edad, nivelExperiencia);
                break;
            }
        }
    }

    public void crearJuezDeLinea(String nombre, int edad, int nivelExperiencia) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = new JuezDeLinea(nombre, edad, nivelExperiencia);
                break;
            }
        }
    }

    // Upcasting y downcasting
    public void mostrarDetallesDePersonas() {
        for (Persona persona : personas) {
            if (persona != null) {
                // Upcasting: tratar a todas las personas como el tipo general Persona
                System.out.println(persona.describirOcupacion());

                // Downcasting: verificar el tipo real de la instancia y hacer un cast explícito
                if (persona instanceof JugadorDeTenis) {
                    JugadorDeTenis jugador = (JugadorDeTenis) persona;
                    System.out.println("Soy un jugador de tenis con ranking: " + jugador.getRanking());
                    jugador.entrenar();  // Método específico de JugadorDeTenis
                } else if (persona instanceof JuezDeSilla) {
                    JuezDeSilla juezSilla = (JuezDeSilla) persona;
                    juezSilla.asignarPosicion(); // Método específico de JuezDeSilla
                } else if (persona instanceof JuezDeLinea) {
                    JuezDeLinea juezLinea = (JuezDeLinea) persona;
                    juezLinea.asignarPosicion(); // Método específico de JuezDeLinea
                }
            }
        }
    }

    // Ejemplo de despacho dinámico
    public void saludarPersonas() {
        for (Persona persona : personas) {
            if (persona != null) {
                // Despacho dinámico: llama al método presentarse, ejecutando la implementación específica de cada subclase
                System.out.println(persona.presentarse());
            }
        }
    }
}