package _03_Class_Character;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_Character_Funciones {

    // FUNCIONES Character
    // 01-Determina si existe o no numeros en la cadena
    // 
    // 
    // 
    // 
    /**
     * 01-Determina si existe o no numeros en la cadena o la cadena es solo de
     * caracteres alfabeticos
     *
     * @return true si el String es solo de caracteres alfabeticos (NO contiene
     * numeros)
     */
    public static boolean esCadenaAlfabetica(String cadena) {
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (!Character.isAlphabetic(caracter)) {
                return false;
            }
        }
        return true;
    }

}
