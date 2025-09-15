package _10_POO_03_Herencia_Polimorfismo;

/**
 *
 * @author ivanc
 */
public class Ejemplo_Polimorfismo_de_Sobrecarga {

    void suma(int a, int b) {
        System.out.println("a+b" + (a + b));
    }

    void suma(double a, double b) {
        System.out.println("a+b" + (a + b));
    }

    void suma(int a, int b, int c) {
        System.out.println("a+b+c" + (a + b + c));
    }

}
