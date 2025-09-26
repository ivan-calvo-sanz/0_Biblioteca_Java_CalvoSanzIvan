package _03_Class_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0302_throw_new_Exception_2 {

    // ***** throw new Exception ****
    // Ejemplo lanzando varias Excepciones
    // (hay prioridad al lanzar los catch, lanza el primero que captura por lo tanto hay que posicionar primero las excepciones más específicas y al final la excepción mas genérica)
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        int pos;
        int[] array = {15, 2, 8, 19, 8};

        do {
            try {
                pos = obtenerDato(array);
                System.out.println("array[" + pos + "]=" + array[pos]);
                salir = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Error InputMismatchException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error Desconocido: " + e.getMessage());
            }
        } while (!salir);
    }

    public static int obtenerDato(int[] array) throws ArrayIndexOutOfBoundsException, InputMismatchException {
        System.out.println("Dime una posicion entre 0 y " + (array.length - 1));
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n < 0 || n >= array.length) {
                throw new ArrayIndexOutOfBoundsException("el valor introducido es mayor que la longitud del array.");
            }
        } else {
            throw new InputMismatchException("el valor introducido no es un numero entero.");
        }
        return n;
    }
}
