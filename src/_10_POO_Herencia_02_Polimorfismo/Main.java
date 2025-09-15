package _10_POO_Herencia_02_Polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {

        /**
         * estamos guardando en un ArrayList Instancias de diferentes Clases,
         * pero como todas son Animal (heredan de Animal) todas son Animales y
         * por lo tano podemos acceder al metodo, esto es Polimorfismo
         */
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Pitbull());
        for (Animal a : animales) {
            a.hacerRuido();
        }
    }

}
