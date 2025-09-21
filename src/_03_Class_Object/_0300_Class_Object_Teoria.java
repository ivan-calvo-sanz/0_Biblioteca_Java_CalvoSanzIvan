package _03_Class_Object;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Object_Teoria {

    // CONCEPTOS BASICOS CLASE Object
    // Todos los Objetos en Java Heredan de la Clase Object por lo tanto todos los metodos de Object estan disponibles en el resto de Clases
    public static void main(String[] args) {

        // METODOS CLASE Object
        // .clone()                                         (return Object)     crea y devuelve una copia del objeto actual
        // .equals(Object obj)                              (return boolean)    Compara el objeto actual con el objeto dado y devuelve verdaero si ambos objetos son iguales
        // .getClass()                                                          Devuelve la Clase del Objeto actual
        // .hasCode()                                                           Devuelve un código hash único para el objeto actual
        // .toString()                                                          Devuelve una representación de cadena del Objeto
        /**
         * .equals(Object obj) (return boolean) Compara el objeto actual con el
         * objeto dado y devuelve verdadero si ambos objetos son iguales. Por
         * defecto compara la referencia en memoria de los objetos, para
         * comparar si tienen los mismos valores de atributos estos objetos hay
         * que SOBREESCRIBIR el método .equals()
         */
        /**
         * .hasCode() Devuelve un código hash único para el objeto actual, es
         * IMPORTANTE para la implementación de estructuras de datos,
         * colecciones como HashMap, HashSet
         *
         * - El numero hasCode debe basarse en el contenido del objeto
         */
    }

}
