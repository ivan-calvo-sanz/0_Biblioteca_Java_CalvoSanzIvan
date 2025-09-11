package _03_Class_Arrays;

import static _03_Class_Arrays._0301_Class_Arrays_Funciones.arrayValoresMax;
import static _03_Class_Arrays._0301_Class_Arrays_Funciones.generaArrayNumerosAleatorios;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0302_Class_Arrays_Matrices_Funciones {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // main para realizar pruebas de las funciones
        int[][] matriz = {{0, 1, 2, 3, 4}, {11}, {11, 22, 33, 44, 55, 80}};

        int[][] matrizA = {{1, 10, 1}, {2, 2, 20}, {30, 3, 3}};
        int[][] matrizB = {{4, 4, 4}, {5, 5, 5}, {6, 6, 6}};

        int[][] matrizC = {{1, 2}, {7, 7, 8}, {10, 8}};
        int[][] matrizD = {{5, 1, 4}, {6, 3}, {11}, {1, 2}};

        int[][] z = matrizMayorElemento(matrizC, matrizD);

        mostrarMatriz(z);
    }

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
    // 13-Dadas 2 matrices las compara elemento a elemento y devuelva otra matriz con el elemento mas grande
    // 14-Dadas 2 matrices verifica si tienen las mismas dimensiones
    // 15-Genera matriz con elementos aleatorios
    // 
    /**
     * 01-Mostrar los valores que contiene una Matriz
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println("\b}");
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

    /**
     * 13-Dadas 2 matrices las compara elemento a elemento y devuelva otra
     * matriz con el elemento mas grande
     */
    public static int[][] matrizMayorElemento(int[][] a, int[][] b) {
        int[][] devuelve;
        if (a.length > b.length) {
            devuelve = new int[a.length][];
        } else {
            devuelve = new int[b.length][];
        }

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                devuelve[i] = arrayValoresMax(a[i], b[i]);
            }
        }
        if (a.length > b.length) {
            for (int i = 0; i < b.length; i++) {
                devuelve[i] = arrayValoresMax(a[i], b[i]);
            }
            for (int i = b.length; i < a.length; i++) {
                devuelve[i] = Arrays.copyOf(a[i], a[i].length);
            }
        }
        if (b.length > a.length) {
            for (int i = 0; i < a.length; i++) {
                devuelve[i] = arrayValoresMax(a[i], b[i]);
            }
            for (int i = a.length; i < b.length; i++) {
                devuelve[i] = Arrays.copyOf(b[i], b[i].length);
            }
        }
        return devuelve;
    }

    /**
     * 14-Dadas 2 matrices verifica si tienen las mismas dimensiones
     */
    public static boolean esMismoTamañoMatrices(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
        }
        return true;
    }

    /**
     * 15-Genera matriz con elementos aleatorios
     */
    public static int[][] generaMatrizNumerosAleatorios(int filas, int col) {
        int[][] devuelve = new int[filas][col];
        for (int i = 0; i < devuelve.length; i++) {
            devuelve[i] = generaArrayNumerosAleatorios(col);
        }
        return devuelve;
    }

}
