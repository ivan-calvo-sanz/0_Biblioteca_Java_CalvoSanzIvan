package _00_Ejercicios_Curso_Java_desde_0;

import static _03_Class_Arrays._0301_Class_Arrays_Funciones.generaArrayNumerosAleatorios;
import java.util.Arrays;

/**
 * Ejercicio 18
 * https://www.youtube.com/watch?v=CPXwJ0Top90&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=87
 *
 * @author ivanc
 */
/**
 * 18- Genera matriz cuadrada con elementos aleatorios
 */
public class ejercicio_018_Arrays {

    public static void main(String[] args) {
         int[][] z=generaMatrizNumerosAleatorios(2,5);
         
         for (int i = 0; i < z.length; i++) {
             for (int j = 0; j < z[i].length; j++) {
                 System.out.print(z[i][j]+" ");
             }
             System.out.println("");
        }

    }

    public static int[][] generaMatrizNumerosAleatorios(int filas, int col) {
        int[][] devuelve = new int[filas][col];
        for (int i = 0; i < devuelve.length; i++) {
            devuelve[i] = generaArrayNumerosAleatorios(col);
        }
        return devuelve;
    }

}
