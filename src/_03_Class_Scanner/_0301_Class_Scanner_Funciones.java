package _03_Class_Scanner;

import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_Scanner_Funciones {

    public static void main(String[] args) {

        // pedir al usuario un numero int
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        int num = sn.nextInt();

        // pedir al usuario una frase String
        // Scanner sn = new Scanner(System.in);
        //useDelimiter  indica hasta donde considera que reconoce como un elemento y el siguiente
        sn.useDelimiter("\n");
        System.out.println("Escriba una frase: ");
        String frase = sn.next();
    }

    // FUNCIONES
    /**
     * Pedir datos al usuario
     *
     * @param sn
     * @param mensaje
     * @return String
     */
    public static String pedirStringAUsuario(Scanner sn, String mensaje) {
        System.out.println(mensaje);
        return sn.next();
    }
}
