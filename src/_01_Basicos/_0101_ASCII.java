package _01_Basicos;

/**
 *
 * @author Iván Calvo Sans
 *
 */
public class _0101_ASCII {

    // https://elcodigoascii.com.ar/
    // espacio en blanco            32
    // ! " # $ % & ' ( ) * + , . /  33-47
    // 0-9                          48-57
    // : ; < = > ? @                58-64
    // A-Z                          65-90   (longitud del abecedario = 26) (la Ñ no está incluida)
    // [ \ ] ^ _ `                  91-96
    // a-z                          97-122  (longitud del abecedario = 26) (la ñ no está incluida)
    // { | } ~                      123 124 125 126 (pulsando Alt+numero)
    public static void main(String[] args) {
    }

    // FUNCIONES
    /**
     * Genera un Array con las letras del abecedario
     *
     * @param
     * @return char[]
     */
    public static char[] generaAbecedario() {
        char abecedario[] = new char[91 - 65];
        for (int i = 65, indice = 0; i < 91; i++, indice++) {
            abecedario[indice] = (char) i;
        }
        return abecedario;
    }

    /**
     * Genera un Array de char con caracteres con el intervalo de caracteres que
     * indiquemos de la Tabla ASCII
     *
     * @param inicio inicio del intervalo de la Tabla ASCII
     * @param fin fin del intervalo de la Tabla ASCII
     * @return char[]
     */
    // char[] abecedarioMinusculas = generaCaracteres(97, 122);
    public static char[] generaCaracteresTablaASCII(int inicio, int fin) {
        char[] caracteres = new char[fin - inicio + 1];
        for (int i = 0, j = inicio; i < caracteres.length; i++, j++) {
            caracteres[i] = (char) j;
        }
        return caracteres;
    }

}
