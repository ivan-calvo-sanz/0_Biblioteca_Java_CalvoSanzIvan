package _03_Class_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Exception_Teoria {

    /**
     * CONCEPTOS BASICOS EXCEPCIONES
     */

    /* Hay dos tipos de Excepciones: Verificadas y NO Verificadas
            - Verificadas (Checked Exceptions): Java obliga a que las manejes (con try-catch o throws), situaciones que se pueden prever. IOException, SQLException, ClassNotFoundException
            - NO Verificadas (Unchecked Exceptions):  No es obligatorio capturarlas ni declararlas con throws pero son Recomendables capturarlas. ArrayIndexOutOfBoundsException, ArithmeticException
     */
    public static void main(String[] args) {

        // ***** Exception ****
        // es la SuperClase del resto de Clases Exception
        // Se lanza cuando ocurre cualquier tipo de excepcion
        try {
            int division = 10 / 0; // lanza ArithmeticException
        } catch (Exception e) {
            System.out.println("Error Exception: no se puede dividir entre 0");
        }

        // ***** ArithmeticException ****
        // Se lanza cuando ocurre un error aritmético durante la ejecución
        try {
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error ArithmeticException: no se puede dividir entre 0");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        // ***** InputMismatchException ****
        // Se lanza cuando el Scanner recibe un valor que no coincide con el tipo esperado
        // ejemplo, si el usuario introdue: 25 → funciona correctamente.
        // si el usuario introdue: hola → lanza InputMismatchException.
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un numero entero: ");
            int numero = sc.nextInt(); // espera un int
            System.out.println("Numero ingresado: " + numero);
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Error InputMismatchException: el valor introducido no es un numero entero.");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        // ***** NumberFormatException ****
        // Se lanza cuando intentas convertir un String a un número, pero la cadena no tiene un formato válido.
        // si el usuario introdue: 25 → funciona correctamente.
        // si el usuario introdue: hola → lanza InputMismatchException.
        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error NumberFormatException: el texto no es un numero valido.");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        // ***** ArrayIndexOutBoundsException ****
        // Se lanza cuando intentas aaceder a una posición que no existe de un array .
        // (Los arrays empiezan en el índice 0 y el último índice es longitud - 1)
        // Si accedes a un índice negativo o mayor/igual a la longitud, Java lanza esta excepción.
        int[] numeros = {10, 20, 30};
        try {
            System.out.println(numeros[5]); // ❌ Índice fuera de rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error ArrayIndexOutBoundsException: posicion NO valida del array");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        System.out.println("EL PROGRAMA FINALIZA CORRECTAMENTE CONTROLANDO LAS EXCEPCIONES");
    }
}
