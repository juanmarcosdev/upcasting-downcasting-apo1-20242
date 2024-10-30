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

    // Sobreescritura de metodo describirOcupacion
    @Override
    public String describirOcupacion() {
        return "Mi ocupacion es ser un juez de tenis profesional con " + nivelExperiencia + " años de experiencia y la silla es comoda.";
    }
}