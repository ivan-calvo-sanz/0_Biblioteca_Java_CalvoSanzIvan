package _00_Ejercicios_Curso_Java_desde_0;

import java.util.Scanner;

/**
 * Ejercicio 13
 * https://www.youtube.com/watch?v=kKryKJUThhQ&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=56
 *
 * @author ivanc
 *
 * Implementa un método que dado un numero diga si es par o impar
 *
 */
public class ejercicio_013 {

    public static void main(String[] args) {
        mostrarPar(5);
    }

    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static void mostrarPar(int n) {
        if (esPar(n)) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }
}
