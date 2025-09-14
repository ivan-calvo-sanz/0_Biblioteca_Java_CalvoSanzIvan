package _10_POO_Herencia;

/**
 *
 * @author ivanc
 */
// CLASE QUE HEREDA DE LA CLASE Persona
public class Estudiante extends Persona {

    private int creditos;

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
        this.creditos = 60;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

}
