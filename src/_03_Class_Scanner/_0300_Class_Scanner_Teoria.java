package _03_Class_Scanner;

import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Scanner_Teoria {

    // 
    // CONCEPTOS BASICOS CLASE Scanner
    // 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // creamos el objeto   scanner.

        // METODOS CLASE Scanner
        // .nextInt()                               (return char)       Introducimos un valor entero.
        int num = entrada.nextInt();

        // .nextDouble()                            (return double)     Scans the next token of the input as a double
        // .nextFloat()                             (return float)      Scans the next token of the input as a float
        // .useDelimiter(Pattern pattern)           (return)            Sets this scanner's delimiting pattern to the specified pattern
    }

}
