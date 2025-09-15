package _10_POO_01_Herencia;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {
        Estudiante e = new Estudiante("Luis Diaz", 20);
        Persona p = new Persona("Marta Gomez", 20);

        System.out.println(e.getNombre() + " : " + e.getCreditos() + " creditos");
        System.out.println(p.getNombre());
    }

}
