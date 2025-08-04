package _01_Basicos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0100_Basicos_Funciones {

    public static void main(String[] args) {

    }

    // FUNCIONES Basios
    // 01-Calcula el factorial de un numero
    // 02-Calcula si es PRIMO o NO
    // 03-Calcula cuantos dígitos tiene un numero
    // 04-Calcula si es Bisiesto
    // 05-Calcula el numero de dias que tiene el mes
    // 
    // 
    // 
    /**
     * 01-Calcula el factorial de un numero Cuidado con desbordamiento, con int
     * no puede almacenar el factorial de un numero > 31
     */
    public static int factorial(int numero) {
        if (numero < 0) {
            System.out.println("No se puede calcular el facturial de un numero negativo");
            return -1;
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        int resultado = numero;

        for (int i = (numero - 1);
                i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * 02-Calcula si es PRIMO o NO
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        // TRUCO, NO hace falta empezar desde el propio numero, empezando desde su raiz es suficiente
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 03-Calcula cuantos dígitos tiene un numero
     */
    public static int cuentaCifras(int numero) {
        int numeroAbs = Math.abs(numero);
        int cifras = 1;
        for (int i = numeroAbs; i >= 10; i /= 10) {
            cifras++;
        }
        return cifras;
    }

    /**
     * 04-Calcula si es Bisiesto
     */
    public static boolean esBisiesto(int anio) {
        if (anio <= 0) {
            return false;
        }
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }

    /**
     * 05-Calcula el numero de dias que tiene el mes
     */
    public static int numDiasMes(int mes) {
        int numDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                numDias = 28;
                int anioActual = new Date().getYear() + 1900;
                if (esBisiesto(anioActual)) {
                    numDias = 29;
                }
                break;
            default:
                numDias = -1;
        }
        return numDias;
    }

}
