package _03_Class_Math;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_Math_Funciones {

    // FUNCIONES Math
    // 01-Calula el maximo comun divisor de dos numeros
    // 02-Calula el minimo comun multiplo de dos numeros
    //
    //
    // 
    /**
     * 01-Calula el maximo comun divisor de dos numeros. Se define el máximo
     * común divisor (mcd o m. c. d.) de dos o más números enteros al mayor
     * número entero que los divide sin dejar residuo alguno.
     */
    public static int mcd(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;

        } while (b != 0);
        return resultado;
    }

    /**
     * 02-Calula el minimo comun multiplo de dos numeros. El mínimo común
     * múltiplo (mcm o m. c. m.) de dos o más números naturales es el menor
     * múltiplo común de todos ellos.
     */
    public static int mcm(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int resultado = (a / mcd(num1, num2)) * b;

        return resultado;
    }

}
