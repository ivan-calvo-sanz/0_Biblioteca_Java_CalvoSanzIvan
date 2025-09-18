package _10_POO_05_Herencia_Interfaces;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _10_POO_05_Herencia_Interfaces_Teoria {

    /**
     * ***** INTERFACES****
     */
    /**
     * Se crean mediante Java Interface // Sirven para Obligar a implementar en
     * otra Clase los métodos que hemos indicado en la Clase Interface //En la
     * Interface NO se implementan los métodos, solo se definen (se indican) los
     * métodos que tienen que tener las Clases que sean interface de esta y en
     * ellas se desarrollan estos métodos
     */
    /**
     * a diferencia de las Clases Abstractas que en las que sí se pueden
     * desarrollar los metodos en las Interfaces NO se pueden desarrollar solo
     * se indican y se implementa en la Clase hija
     */
    /**
     * Características principales de una interfaz
     *
     * 1- Se declara con la palabra clave interface.
     *
     * 2-Puede contener: - Métodos abstractos (sin cuerpo). -Métodos estáticos.
     * -Constantes (public static final por defecto).
     *
     * 3- JAVA NO PERMITE LA HERENCIA MULTIPLE pero si puede implementar varias
     * interfaces de esta forma es como si pudiera heredar multiple
     *
     * 4-Todos los métodos de una interfaz son por defecto: - public o -abstract
     * (excepto los que sean default o static).
     */
    /**
     * INTERFACES VS CLASES ABSTRACTAS
     *
     * - En las Interfaces los atributos deben ser constantes. En una Clase
     * Abstracta pueden ser de cualquier tipo
     *
     * - Una Clase Abstracta puede contener metodos implementados. Una interfaz
     * solo dispone de metodos sin implementar (abstractos)
     *
     * - Como todos los metodos de una Interfaz son abstractos NO es necesario
     * incluir abstract en su definición. Mientras en una Clase Abstracta si es
     * necesario en aquellos que lo sean
     *
     * - Una Clase Abstracta NO es mas que una Clase común la cual posee
     * atributos, metodos, constructores y por lo menos un metodo abstracto. Una
     * Clase Abstracta NO puede ser instanciada solo heredada.
     *
     */
}
