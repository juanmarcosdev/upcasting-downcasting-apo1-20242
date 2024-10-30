package model;

public abstract class Juez extends Persona {
    private int nivelExperiencia;  // Nivel de experiencia del juez en años

    public Juez(String nombre, int edad, int nivelExperiencia) {
        super(nombre, edad);
        this.nivelExperiencia = nivelExperiencia;
    }


    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    // Método abstracto
    public abstract String asignarPosicion();

    // Implementación del método describirOcupacion de Persona
    @Override
    public String describirOcupacion() {
        return "Soy un juez de tenis con " + nivelExperiencia + " años de experiencia.";
    }
}
