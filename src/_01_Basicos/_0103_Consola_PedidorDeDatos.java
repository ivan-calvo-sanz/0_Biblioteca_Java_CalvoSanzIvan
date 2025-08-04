package _01_Basicos;

import java.util.Scanner;

/**
 *
 * @author IVAN
 */
public class _0103_Consola_PedidorDeDatos {

    static Scanner entrada = new Scanner(System.in);
    static final String DATO_ERRONEO = "Dato introducido erroneo.";

    // FUNCIONES CONSOLA PEDIDOR DE DATOS
    // 01-Pide un numero int
    // 02-Pide una cadena String
    // 03-Pide un double
    // 
    // 
    // 
    /**
     * 01-Pide un numero int
     */
    public static int pedirInt(String pregunta) {
        System.out.print(pregunta);
        int dato = 0;
        try {
            dato = entrada.nextInt();
            entrada.nextLine();
        } catch (Exception e) {
            entrada.nextLine();
            System.out.println(e + " | " + DATO_ERRONEO);
        }
        return dato;
    }

    /**
     * 02-Pide una cadena String
     */
    public static String pedirString(String pregunta) {
        System.out.print(pregunta);
        String dato = entrada.nextLine();
        return dato;
    }

    /**
     * 03-Pide un double
     */
    public static double pedirDouble(String pregunta) {
        System.out.print(pregunta);
        double dato = 0;
        try {
            dato = entrada.nextDouble();
            entrada.nextLine();
        } catch (Exception e) {
            entrada.nextLine();
            System.out.println(e + " | " + DATO_ERRONEO);
        }
        return dato;
    }

}
