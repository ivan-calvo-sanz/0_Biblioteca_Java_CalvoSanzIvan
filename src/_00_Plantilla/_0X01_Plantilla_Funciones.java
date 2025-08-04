package _00_Plantilla;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0X01_Plantilla_Funciones {

    // FUNCIONES Plantilla
    // 01-Cuenta cuantas vocales tiene la frase
    // 
    // 
    // 
    //    
    /**
     * 01-Invertir un array
     */
    public static int[] invertirArray(int[] array) {
        int invertido[] = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            invertido[i] = array[j];
        }
        return invertido;
    }

}
