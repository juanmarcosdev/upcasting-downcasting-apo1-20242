package ui;

import java.util.*;
import model.Controller;
import model.ManoDominante;

public class Executable {

    private Scanner reader;
    private Controller cont;

    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        reader = new Scanner(System.in);
        cont = new Controller();
    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {

        cont.crearJugadorDeTenis("Camila Osorio", 22, 64, ManoDominante.DERECHA);
        cont.crearJugadorDeTenis("Jaqueline Cristian", 26, 73, ManoDominante.DERECHA);
        cont.crearJuezDeSilla("Pepito Perez", 40, 15);
        cont.crearJuezDeLinea("Jaimito", 30, 2);
        cont.crearJuezDeLinea("Perencito", 37, 10);

    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}