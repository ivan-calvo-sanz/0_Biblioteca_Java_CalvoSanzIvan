package _01_Basicos;

import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0100_Basicos {

    public static void main(String[] args) {

        /**
         * Llama a función que envia una excepcion si ocurre un error
         */
        try {
            validarCCC(CCC);
            System.out.println("CCC correcto");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    /**
     * Convierte un String de numeros a numero int si tiene alguna letra da
     * fallo y devuelve un mensaje en la Excepcion
     */
    public static void validarCCC(String CCC) throws Exception {
        try {
            aux = CCC.substring(0, 4);
            mensajeError = "Lo dígitos de la Entidad NO son numeros.";
            Integer.parseInt(aux);
        } catch (NumberFormatException e) {
            throw new Exception(mensajeError);
        }
    }

}
