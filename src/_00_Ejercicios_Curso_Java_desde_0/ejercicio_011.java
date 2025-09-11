package _00_Ejercicios_Curso_Java_desde_0;

import java.util.Scanner;

/**
 * Ejercicio 11
 * https://www.youtube.com/watch?v=kKryKJUThhQ&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=56
 *
 * @author ivanc
 *
 * Implementa un método que dado un nombre muestre un saludo
 *
 */
public class ejercicio_011 {

    public static void main(String[] args) {
        saludar("Ivan");
    }

    static void saludar(String nombre) {
        System.out.println("Hola " + nombre + "!");
    }
}
