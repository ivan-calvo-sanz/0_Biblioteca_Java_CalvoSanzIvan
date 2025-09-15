package _10_POO_Herencia;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _10_POO_Herencia_Teoia {

    /**
     * ***** HERENCIA****
     *
     * Clases padres que tiene Clases hijas, las Clases hijas heredan de la
     * Clase Padre, por lo tanto tendrán atributos o métodos que heredan de la
     * Clase Padre.
     *
     * Es decir, cuando tenemos varias Clases que tienen en común varios
     * atributos o métodos iguales, se puede crear una Clase Padre con estos
     * atributos o métodos comunes y las hijas que hereden de está y así tenemos
     * concentrado en una única Clase todos los atributos o métodos que son
     * comunes y NO es necesario repetirlos en cada una de las Clases.
     */
    /**
     * ***** private VS protected****
     *
     * En las Clases Padres que heredan se puede utilizar el protected en vez de
     * private Esto tiene ventaja ya que el protected es privado y heredado, es
     * decir es lo mismo que el privado solo que el privado es privado solo
     * tiene acceso para esa Clase por lo tanto las Clases hijas NO pueden
     * acceder directamente a los atributos o métodos de la Clase padre, sino
     * que hay que acceder mediante super. Mientras con el protected las Clases
     * hijas pueden acceder a los atributos y métodos de la Clase padre
     * directamente sin tener que utilizar el super.
     */
}
