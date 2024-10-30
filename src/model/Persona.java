package model;

public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /* Método abstracto 
    debe ser implementado por cada subclase para proporcionar 
    una descripción de la ocupación o rol de la persona. 
    Esto ayuda a definir el comportamiento de las subclases y hacer la clase Persona más versátil.
    */

    public String describirOcupacion() {
        return "Soy " + getNombre();
    }

    // public abstract String describirOcupacion();

    // Método común
    public String darSaludo() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años";
    }
}