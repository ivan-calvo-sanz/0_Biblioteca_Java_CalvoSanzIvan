package _10_POO_04_Herencia_Clases_Abstractas;

/**
 *
 * @author ivanc
 */
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println(super.getNombre() + " dice: !Guau guauuu!");
    }
}
