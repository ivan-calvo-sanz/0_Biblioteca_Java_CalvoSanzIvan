package _01_Basicos;

import _01_Basicos._0103_Consola_PedidorDeDatos;
import _01_Basicos._0104_Consola_ValidarDatos;
import java.util.Scanner;

/**
 *
 * @author Iván Calvo Sans
 *
 */
public class _0102_Consola_Menu {

    static Scanner entrada = new Scanner(System.in);
    static final String MENU_PRINCIPAL
            = "\n************************\n"
            + "***MAQUINA EXPENDEDORA**\n"
            + "*****MENU PRINCIPAL*****\n"
            + "************************\n"
            + "1-NUEVO VEHICULO\n"
            + "2-LISTAR VEHICULOS\n"
            + "3-BUSCAR VEHICULO\n"
            + "4-MODIFICAR KMs VEHICULO\n"
            + "5-ELIMINAR VEHICULO\n"
            + "6-SALIR\n"
            + "\nIntroduce opción del Menú: ";

    /**
     * METODO main genera el menu del programa
     */
    public static void main(String[] args) {

        System.out.print(MENU_PRINCIPAL);
        boolean validar;
        int opcion;

        do {
            // sin comprobar opcion
            // opcion = entrada.nextInt();
            do {
                opcion = _0103_Consola_PedidorDeDatos.pedirInt("");
            } while (_0104_Consola_ValidarDatos.validarEntero(opcion) == -1);

            validar = true;
            switch (opcion) {
                case 1:
                    // metodo
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 2:
                    // metodo
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 3:
                    // metodo
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 4:
                    // metodo
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 5:
                    // metodo
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 6:
                    System.out.println("***La aplicacion se ha cerrado***");
                    break;
                default:
                    validar = false;
                    System.out.println("La opcion tiene que ser entre 1 y 6");
                    System.out.println("Introduce opción del Menú:");
            }
        } while (opcion != 6 || !validar);
    }

}
