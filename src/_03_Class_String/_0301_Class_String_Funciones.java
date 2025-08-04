package _03_Class_String;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_String_Funciones {

    public static void main(String[] args) {

    }

    // FUNCIONES String
    // 01-Cuenta cuantas vocales tiene la frase
    // 02-Indica si una palabra es un heterograma
    // 03-Se le pasa un numero en tipo String y devuelve el numero de la posición del String indicada
    //
    //     
    /**
     * 01-Cuenta cuantas vocales tiene la frase
     */
    public static int cuentaVocales(String frase) {
        String fraseMinusculas = frase.toLowerCase();
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        char caracterActual;
        int contador = 0;
        boolean esVocal;

        for (int i = 0; i < fraseMinusculas.length(); i++) {
            caracterActual = fraseMinusculas.charAt(i);
            esVocal = false;
            for (int j = 0; j < vocales.length; j++) {
                if (caracterActual == vocales[j]) {
                    esVocal = true;
                }
            }
            if (esVocal) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * 02-Indica si una palabra es un heterograma o no. Una palabra heterograma
     * es aquella que no tiene ninguna letra repetida
     */
    public static boolean esHeterograma(String palabra) {
        char caracter;
        for (int i = 0; i < palabra.length(); i++) {
            caracter = palabra.charAt(i);
            if (Character.isLetter(caracter)) {
                for (int j = i + 1; j < palabra.length(); j++) {
                    if (caracter == palabra.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * 03-Se le pasa un numero en tipo String y devuelve el numero de la
     * posición del String indicada
     */
    public static int extraerNumeroDeString(String numero, int pos) {
        int num = Integer.parseInt(numero.substring(pos, pos + 1));
        return num;
    }
}
