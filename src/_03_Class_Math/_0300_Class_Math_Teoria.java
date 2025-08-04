package _03_Class_Math;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Math_Teoria {

    // https://docs.oracle.com/javase/7/docs/api/
    // CONCEPTOS BASICOS CLASE Math
    // 
    public static void main(String[] args) {

        // METODOS CLASE Math
        // .random()                                        (return double)     devuelve un numero aleatorio comprendido entre 0.0 and less than 1.0
        double num = Math.random() * 30;                // Numero aleatorio comprendido entre 0 y 29
        double num_v2 = Math.random() * (5 - 20) + 20;  // Numero aleatorio comprendido entre 5 y 19 (Para indicar un rango sólo esponerle Math.random()*(mínimo-máximo)+máximo)
        // .sqrt()                                          (return double)     devuelve la raiz cuadrada
        double num_v3 = Math.sqrt(9);
        // .round()                                         (return int)        devuelve el int mas cercano, redondeando hacia arriba
        int num_v4 = (int) Math.round(2.45);
        // .abs()                                           (return)            Returns the absolute value of a double value.
        // .max(a, b)                                       (return)            Returns the greater of two double values.
        // .min(a, b)                                       (return)            Returns the smaller of two double values.
        // .pow(a, b)                                       (return double)     Returns the value of the first argument raised to the power of the second argument.
        // .toRadians(double angdeg)                        (return double)     Converts an angle measured in degrees to an approximately equivalent angle measured in radians.
    }

}
