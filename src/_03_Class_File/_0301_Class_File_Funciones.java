package _03_Class_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_File_Funciones {

    // FUNCIONES File
    // 01-Pedir un archivo al Usuario (Usuario introducir el nombre del archivo mediante consola)
    // 02-Leer un archivo .txt que contiene los valores de una matriz, genera y devuelve la matriz
    // 
    // 
    // 
    // FUNCIONES PrintWriter
    // 01-Guardar en un archivo .txt ua matriz
    // 
    // 
    // 
    // 
    // FUNCIONES File
    /**
     * 01-Pedir un archivo al Usuario (Usuario introducir el nombre del archivo
     * mediante consola)
     */
    public static File pedirNombreFichero() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el nombre del fichero: ");
        String nombre = sn.next();

        File f = new File(nombre);

        if (f.exists()) {
            return f;
        } else {
            return null;
        }
    }

    /**
     * 02-Leer un archivo .txt que contiene los valores de una matriz, genera y
     * devuelve la matriz
     */
    // EJEMPLO DE LA MTRIZ EN EL ARCHIVO .txt
    // 4 2 1 2 3 4 5 6 7 8
    // El Primer valor indica el nº de Filas    ->  4
    // El Segundo valor indica el nº de Filas   ->  2
    // La Matriz seria:
    // 1    2
    // 3    4
    // 5    6
    // 7    8
    // EJEMPLO DE LA MTRIZ EN EL ARCHIVO .txt
    // 2 4 1 2 3 4 5 6 7 8
    // El Primer valor indica el nº de Filas    ->  2
    // El Segundo valor indica el nº de Filas   ->  4
    // La Matriz seria:
    // 1    2   3   4
    // 5    6   7   8
    public static int[][] leerFichero(File f) {
        int[][] matriz = null;
        try {
            Scanner sn = new Scanner(f);

            int filas = 0, columnas = 0, contador = 0;
            while (sn.hasNextInt()) {
                switch (contador) {
                    case 0:
                        filas = sn.nextInt();
                        break;
                    case 1:
                        columnas = sn.nextInt();
                        matriz = new int[filas][columnas];
                        break;
                    default:
                        matriz[(contador - 2) / columnas][(contador - 2) % columnas] = sn.nextInt();
                }
                contador++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(_0301_Class_File_Funciones.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return matriz;
    }

    // FUNCIONES PrintWriter
    /**
     * 01-Guardar en un archivo .txt una matriz
     */
    public static void guardarMatrizFichero(File f, int[][] matriz) {
        try {
            PrintWriter pw = new PrintWriter(f);
            // Guardamos nº Filas
            pw.print(matriz.length + " ");
            // Guardamos nº Columnas
            pw.print(matriz[0].length + " ");
            // Guardamos los valores de la matriz en una sola linea
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    pw.print(matriz[i][j] + " ");
                }
            }
            // Se ciera el archivo para que se guarden los cambios
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(_0301_Class_File_Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
