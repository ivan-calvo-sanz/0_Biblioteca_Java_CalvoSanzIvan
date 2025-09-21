package _03_Class_Object;

import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 0);
        Punto p3 = new Punto(0, 0);
        Punto p4 = p1;
        // COMPROBAR EL METODO .equals(Object obj)
        // Al haber sobreescrito el metodo .equals() en la Clase Punto imprime "Puntos Iguales"
        // Si NO se sobeescribe el metodo .equals() en la Clase Punto imprime "Puntos distintos" ya que lo que va a comparar por defecto es el codigo hasCode
        if (p1.equals(p2)) {
            System.out.println("Puntos Iguales");
        } else {
            System.out.println("Puntos distintos");
        }

        // Generamos una ArrayList<Punto> al tener la Clase Punto el metodo .equals() sobreescrito
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        puntos.add(p4);
        // al tener la Clase Punto el metodo .equals() sobreescrito borrara el primer punto que coincida esos atributos
        // si no tuviera la Clase Punto sobreescrito el metodo .equals() NO borraria nada, ya que ningun objeto del ArrayList coincidiría en codigo hasCode()
        puntos.remove(new Punto(0, 0));
        System.out.println(puntos);
    }

}
