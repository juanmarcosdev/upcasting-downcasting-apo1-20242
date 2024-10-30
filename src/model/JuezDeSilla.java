package model;

public class JuezDeSilla extends Juez {

    public JuezDeSilla(String nombre, int edad, int nivelExperiencia) {
        super(nombre, edad, nivelExperiencia);
    }

    // Implementación del método asignarPosicion
    @Override
    public String asignarPosicion() {
        return "Estoy asignado a la silla central, supervisando el partido.";
    }
}