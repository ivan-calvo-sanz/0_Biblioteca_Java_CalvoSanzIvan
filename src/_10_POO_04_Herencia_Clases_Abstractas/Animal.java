package _10_POO_04_Herencia_Clases_Abstractas;

/**
 *
 * @author ivanc
 */
abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto (sin cuerpo se implementa en subclases)
    abstract void hacerSonido();

    // Metodo concreto (ya implementado)
    void dormir() {
        System.out.println(nombre + " Esta durmiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
