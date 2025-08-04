package _03_Class_Date;

import java.util.Date;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_Date_Funciones {

    // FUNCIONES Date
    // 01-Calcula la edad (años)
    // 
    // 
    // 
    // 
    /**
     * 01-Calcula la edad (años)
     */
    public static int calculaEdad(int dia, int mes, int anio) {
        Date actual = new Date();

        int diaActual = actual.getDate();
        int mesActual = actual.getMonth() + 1;
        int anioActual = actual.getYear() + 1900;

        int diferencia = anioActual - anio;

        if (mesActual <= mes) {
            if (mesActual == mes) {
                if (dia > diaActual) {
                    diferencia--;
                }
            } else {
                diferencia--;
            }
        }
        return diferencia;
    }

}
