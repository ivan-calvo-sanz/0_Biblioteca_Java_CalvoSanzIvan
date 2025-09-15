package _10_POO_04_Herencia_Clases_Abstractas;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {
        // Animal a =new Animal("Generico");  NO ES POSIBLE INSTANCIAR UN OBJETO DE UNA CLASE ABSTRACTA

        Animal perro = new Perro("Boby");
        Animal gato = new Gato("Misu");

        perro.hacerSonido();
        gato.hacerSonido();
        perro.dormir();
        gato.dormir();
    }
}
