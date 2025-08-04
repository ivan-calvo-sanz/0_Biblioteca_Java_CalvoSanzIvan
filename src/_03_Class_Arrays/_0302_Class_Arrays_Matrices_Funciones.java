package _03_Class_Arrays;

import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0302_Class_Arrays_Matrices_Funciones {

    static Scanner entrada = new Scanner(System.in);

    // int[][] matriz = new int[i][j];
    // i = filas
    // j = columnas
    //
    // FUNCIONES MATRICES
    // 01-Mostrar los valores que contiene una Matriz
    // 02-Suma dos Matrices
    // 03-Rellena una Matriz con valores pedidos al usuario
    // 04-Rellena una Matriz con un valor
    // 05-Suma los elementos de una fila [i] de una Matriz
    // 06-Suma los elementos de una columna [j] de una Matriz
    // 07-Suma los elementos de la Diagonal Principal de una Matriz
    // 08-Suma los elementos de la Diagonal Inversa de una Matriz
    // 09-Suma los elementos de una Matriz
    // 10-Calcula la media de una Matriz
    // 11-Generar la Matriz transpuesta
    // 12-Obtener las posiciones adyacentes de una matriz dada una posicion, devuelve una matriz con las posiciones adyacentes a la posición indicada
    // 
    // 
    // 
    /**
     * 01-Mostrar los valores que contiene una Matriz
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * 02-Suma dos Matrices
     *
     * @return devuelve una matriz
     */
    public static int[][] sumaMatriz(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    /**
     * 03-Rellena una Matriz con valores pedidos al usuario
     */
    public static void rellenaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Introduce nuevo valor de la matriz posición:" + i + " " + j);
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    /**
     * 04-Rellena una Matriz con un valor
     */
    public static void rellenarMatriz(int[][] matriz, int num) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = num;
            }
        }
    }

    /**
     * 05-Suma los elementos de una fila [i] de una Matriz
     */
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    /**
     * 06-Suma los elementos de una columna [j] de una Matriz
     */
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    /**
     * 07-Suma los elementos de la Diagonal Principal de una Matriz
     */
    public static int sumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0, j = 0; i < matriz.length; i++, j++) {
            suma += matriz[i][j];
        }
        return suma;
    }

    /**
     * 08-Suma los elementos de la Diagonal Inversa de una Matriz
     */
    public static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0, j = matriz[0].length - 1; i < matriz.length; i++, j--) {
            suma += matriz[i][j];
        }
        return suma;
    }

    /**
     * 09-Suma los elementos de una Matriz
     */
    public static int sumaElementos(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    /**
     * 10-Calcula la media de una Matriz
     */
    public static double media(int[][] matriz) {
        int suma = sumaElementos(matriz);
        double media = (double) suma / (matriz.length * matriz[0].length);
        return media;
    }

    /**
     * 11-Generar la Matriz transpuesta
     */
    public static int[][] trasponerMatriz(int[][] matriz) {
        // EJEMPLO DE UNA MATRIZ CUARADDA
        // 00 01 02     MATRIZ TRANSPUESTA      // 00 10 20
        // 10 11 12     ----------------->      // 01 11 21
        // 20 21 22                             // 02 12 22
        // EJEMPLO DE UNA MATRIZ NO CUARADDA        
        // 00 01 02 03     MATRIZ TRANSPUESTA       // 00 10
        // 10 11 12 13     ----------------->       // 01 11
        //                                          // 02 12
        //                                          // 03 13
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }

    /**
     * 12-Obtener las posiciones adyacentes de una matriz dada una posicion,
     * devuelve una matriz con las posiciones adyacentes a la posición indicada
     */
    // POSICIONES DE UNA MATRIZ
    // {00, 01, 02, 03},
    // {10, 11, 12, 13},
    // {20, 21, 22, 23},
    // {30, 31, 32, 33}
    //Indicamos que devuelva las posciones adyacentes de la posicion 00
    // devuelve: 01 10 11
    //Indicamos que devuelva las posciones adyacentes de la posicion 33
    // devuelve: 22 23 32
    //Indicamos que devuelva las posciones adyacentes de la posicion 11
    // devuelve: 00 01 02 10 12 20 21 22
    public static int[][] adyacentesA(int filas, int columnas, int filaOrigen, int columnaOrigen) {
        if (!(filaOrigen >= 0 && filaOrigen <= (filas - 1) && columnaOrigen >= 0 && columnaOrigen <= (columnas - 1))) {
            return null;
        }

        int numPosiciones;
        if (filaOrigen == 0 || filaOrigen == (filas - 1)) {
            if (columnaOrigen == 0 || columnaOrigen == (columnas - 1)) {
                numPosiciones = 3;
            } else {
                numPosiciones = 5;
            }
        } else {
            if (columnaOrigen == 0 || columnaOrigen == (columnas - 1)) {
                numPosiciones = 5;
            } else {
                numPosiciones = 8;
            }
        }
        int posiciones[][] = new int[numPosiciones][2];

        int indiePosicion = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {

                if ((i != 0 || j != 0)
                        && (filaOrigen + i) >= 0
                        && (filaOrigen + i) <= (filas - 1)
                        && (columnaOrigen + j) >= 0
                        && (columnaOrigen + j) <= (columnas - 1)) {
                    posiciones[indiePosicion][0] = filaOrigen + i;
                    posiciones[indiePosicion][1] = columnaOrigen + j;
                    indiePosicion++;
                }
            }
        }
        return posiciones;
    }

}
