package _10_POO_02_Herencia_Sobreescritura_Metodos;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _10_POO_02_Herencia_Sobreescritura_Metodos_Teoria {
    /**
     * ***** HERENCIA SOBREESCRITURA DE METODOS****
     */
    /**
     * La sobreescritura de métodos (method overriding) ocurre cuando una clase
     * hija (subclase) define un método con el mismo nombre, parámetros y tipo
     * de retorno que un método ya definido en la clase padre (superclase).
     *
     * Esto permite que la subclase redefina el comportamiento heredado,
     * adaptándolo a sus necesidades.
     */
    /**
     * Reglas de la sobreescritura
     *
     * - Mismo nombre, mismos parámetros: el método en la subclase debe
     * coincidir exactamente con la firma del método en la superclase.
     *
     * - Tipo de retorno: debe ser el mismo o un subtipo (retorno covariante).
     *
     * - Modificadores de acceso: no puede reducir la visibilidad (ejemplo: si
     * es public en el padre, no puede ser protected en el hijo).
     *
     * - Excepciones: la subclase no puede lanzar excepciones más amplias que
     * las declaradas en la superclase.
     *
     * - Se aplica sobre métodos de instancia (no static ni final, ya que estos
     * no se pueden sobrescribir).
     *
     * - Se puede usar la anotación @Override para mayor claridad (y para que el
     * compilador avise si no coincide bien).
     *
     */
}
