package _00_Ejercicios_Curso_Java_desde_0;

import java.util.Scanner;

/**
 * Ejercicio 12
 * https://www.youtube.com/watch?v=kKryKJUThhQ&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=56
 *
 * @author ivanc
 *
 * Implementa un método que dado un numero calcule el cubo
 *
 */
public class ejercicio_012 {

    public static void main(String[] args) {
        int num = calculaCubo(5);
        System.out.println("El cubo de 5 es: " + num);
    }

    static int calculaCubo(int n) {
        return n * n * n;
    }
}
