package model;

public class JuezDeLinea extends Juez {

    public JuezDeLinea(String nombre, int edad, int nivelExperiencia) {
        super(nombre, edad, nivelExperiencia);
    }

    // Sobreescritura del método abstracto
    @Override
    public String asignarPosicion() {
        return "Estoy asignado a una línea específica para verificar si la pelota cae dentro o fuera.";
    }

    public String observarPelota() {
        return "Estoy observando si la pelota queda dentro o fuera";
    }
}