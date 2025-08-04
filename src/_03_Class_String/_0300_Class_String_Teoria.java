package _03_Class_String;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_String_Teoria {

    // https://www.javatpoint.com/java-string
    // CONCEPTOS BASICOS CLASE String
    // 
    public static void main(String[] args) {
        String texto_v0 = "Hola Mundo";
        String texto_v1 = " en Java";

        // METODOS CLASE String
        // .charAt(int index)                               (return char)      Devuelve el carácter en el índice index
        texto_v0.charAt(3); // devuelve 'a'
        char letra = texto_v0.substring(texto_v0.length() - 1, texto_v0.length()).toUpperCase().charAt(0);  // Devuelve la ultima letra del String

        // .length()                                        (return int)       Devuelve la cantidad de caracteres del String
        texto_v0.length(); // devuelve 10

        // .substring(int beginIndex)                       (return String)    Devuelve la cadena a partir del índice beginIndex
        texto_v0.substring(4); //devuelve "Mundo"

        // .substring(int beginIndex, int endIndex)         (return String)    Devuelve la cadeana del índice beginIndex a endIndex-1.
        texto_v0.subSequence(2, 5); // devuelve "la Mu"

        // .contains(CharSequence s)                        (return boolean)   It returns true or false after matching the sequence of char value.
        // .compareTo(String texto2)                        (return int)   Compara dos cadenas lexicográficamente, es decir, cuenta los caracteres que tienen los String y averigua cual es menor, mayor o igual
        int salida_v7 = texto_v0.compareTo(texto_v1);     //Esto devuelve la diferencia texto1 - texto2. Si:
        //salida< 0 // texto1 es menor que texto2
        //salida = 0 // texto1 y texto2 son iguales
        //salida > 0 // texto1 es mayor que texto2
        // .compareToIgnoreCase(String texto2)              (return int)       Hace lo mismo que .compareTo pero ignorando mayúsculas y minúsculas

        // .equals(String another)                          (return boolean)   Compara dos cadenas
        Boolean salida_v3 = "Java".equals("Java"); // devuelve true
        Boolean salida_v4 = "Java".equals("java"); // devuelve false

        // .equalsIgnoreCase(String another)                (return boolean)   Compara dos cadenas ignorando mayúsculas y minúsculas.
        Boolean salida_v5 = "Java".equalsIgnoreCase("Java"); // devuelve true
        Boolean salida_v6 = "Java".equalsIgnoreCase("java"); // devuelve true

        // .isEmpty()                                       (return boolean)   It checks if string is empty.
        // .concat(String str)                              (return String)    Concatena la cadena especificada al final de esta cadena
        String texto_v2 = texto_v0.concat(texto_v1); //devuelve "Hola Mundo en Java"

        // .replace(char old, char new)                     (return String)    Reemplaza un carácter o cadena por otra
        String texto_v8 = texto_v1.replace('a', 'i'); // Devuelve "en Jivi"

        // .replace(CharSequence old, CharSequence new)     (return String)    It replaces all occurrences of the specified CharSequence.
        // .equalsIgnoreCase(String another)                (return String)    It compares another string. It doesn't check case.
        // .split(String regex)                             (return String)    It returns a split string matching regex.
        // .split(String regex, int limit)                  (return String)    It returns a split string matching regex and limit.
        // .indexOf(int ch)                                 (return int)       Devuelve el índice a partir de cual aparece la cadena especificada
        int salida = texto_v0.indexOf("Mundo"); // devuelve 5

        // .indexOf(int ch, int fromIndex)                  (return int)       It returns the specified char value index starting with given index.
        // .indexOf(String substring)                       (return int)       It returns the specified substring index.
        // .indexOf(String substring, int fromIndex)        (return int)       Devuelve el índice a partir del cual aparece la cadena especificada comenzando en el índice especificado.
        String texto = "El Mundo de Java";
        int salida_v2 = texto.indexOf('a', 3); // devuelve 13

        // .toLowerCase()                                   (return String)    Convierte todos los caracteres de una cadena a minúsculas
        String texto_v3 = texto_v0.toLowerCase(); // devuelve "hola mundo"

        // .toUpperCase()                                   (return String)    Convierte todos los caracteres de una cadena a mayúsculas
        String texto_v4 = texto_v0.toUpperCase(); // devuelve "HOLA MUNDO"

        // .trim()                                          (return String)    Devuelve la copia de la cadena, eliminando espacios en blanco en ambos extremos. No afecta los espacios en blanco en el medio.
        String texto_v7 = texto_v1.trim(); // devuelve "en Java"

    }

}
