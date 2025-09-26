package _03_Class_Exception;

import java.util.InputMismatchException;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_finally {

    // el codigo dentro de finally SIEMPRE se ejecuta si el programa ha llegado a entrar dentro del try
    public static void main(String[] args) {

        /**
         * si controlamos las excepciones correctamente el programa entra dentro
         * del try, lanza la excepcion y entramos en el catch correctamente,
         * luego realiza el finally y por ultimo sigue con el programa
         */
        try {
            System.out.println("ENTRA DENTRO DEL try_1");
            int a = 1 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("ENTRA DENTRO DEL catch_1, NO se puede dividir entre cero");
        } finally {
            System.out.println("ENTRA DENTRO DEL finally_1");
        }
        System.out.println("EL PROGRAMA FINALIZA CORRECTAMENTE CONTROLANDO LAS EXCEPCIONES_1" + "\n");

        /**
         * sin embargo si NO controlamos la excepcion correcta, en este caso
         * Utilizamos la excepcion InputMismatchException (controla cuando
         * Scanner recibe un valor que no coincide con el tipo esperado)
         * realmente en este caso NO estamos controlando la excepción que se
         * produce, por lo tanto entra dentro del try, el catch se lo salta
         * porque no estamos controlando ese tipo de excepcion y ejecuta el
         * finally y ahí acaba el programa, NO sigue ya que se ha producido una
         * excepción que NO estamos controlando
         */
        try {
            System.out.println("ENTRA DENTRO DEL try_1");
            int a = 1 / 0;
            System.out.println(a);
        } catch (InputMismatchException e) {
            System.out.println("ENTRA DENTRO DEL catch_2, NO se puede dividir entre cero");
        } finally {
            System.out.println("ENTRA DENTRO DEL finally_2");
        }
        System.out.println("EL PROGRAMA FINALIZA CORRECTAMENTE CONTROLANDO LAS EXCEPCIONES_2" + "\n");

    }
}
