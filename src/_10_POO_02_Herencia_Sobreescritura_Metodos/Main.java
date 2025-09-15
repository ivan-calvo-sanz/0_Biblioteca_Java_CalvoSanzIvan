package _10_POO_02_Herencia_Sobreescritura_Metodos;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.hacerSonido(); //Llama al metodo de Animal
        
        Perro p=new Perro();
        p.hacerSonido(); //Llama al metodo sobreescritura en Perro
    }

}
