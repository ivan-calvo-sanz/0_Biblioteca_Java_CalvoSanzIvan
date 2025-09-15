package _10_POO_Herencia_01_Sobreescritura_Metodos;

/**
 *
 * @author ivanc
 */
// CLASE QUE HEREDA DE LA CLASE Animal
public class Perro extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }

}
