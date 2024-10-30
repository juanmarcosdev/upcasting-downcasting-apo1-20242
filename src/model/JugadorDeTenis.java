package model;
import model.ManoDominante;

public class JugadorDeTenis extends Persona {
    protected int ranking;
    protected ManoDominante manoDominante;

    public JugadorDeTenis(String nombre, int edad, int ranking, ManoDominante manoDominante) {
        super(nombre, edad);
        this.ranking = ranking;
        this.manoDominante = manoDominante;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }


    public ManoDominante getManoDominante() {
        return manoDominante;
    }

    public void setManoDominante(ManoDominante manoDominante) {
        this.manoDominante = manoDominante;
    }

    // Sobreescritura: Implementación del método abstracto describirOcupacion
    @Override
    public String describirOcupacion() {
        return "Soy un jugador de tenis profesional, mi ranking es " + ranking +
               " y juego con la mano " + manoDominante.toString().toLowerCase() + ".";
    }

    // Método para comportamiento específico de JugadorDeTenis
    public String entrenar() {
        return getNombre() + " esta entrenando para mejorar su ranking.";
    }
}