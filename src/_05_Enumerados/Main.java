package _05_Enumerados;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {

        String diasSemana = "";
        DiaSemana diaActual = DiaSemana.JUEVES;
        Mes mesActual = Mes.ENERO;

        for (DiaSemana d : DiaSemana.values()) {
            diasSemana += d.toString() + ", ";
        }

        System.out.println("Los dias de la semana son: " + diasSemana);
        System.out.println("Hoy es " + diaActual + " y el mes actual es " + mesActual);
        System.out.println(mesActual + " tiene " + mesActual.getDias() + " dias");

        /**
         * PARA GUARDAR UN enum que introducimos por consola
         *
         * hay que convertir el String que se introduce por consola a un enum
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un mes " + Arrays.toString(Mes.values()));
        String s = sc.nextLine();
        mesActual = Mes.valueOf(s);   // s deberá ser un tipo enumerado valido
        System.out.println(mesActual + " tiene " + mesActual.getDias() + " dias");
    }

}
