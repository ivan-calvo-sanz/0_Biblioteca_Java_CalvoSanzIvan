package _03_Class_Calendar;

import java.util.Calendar;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_Calendar_Funciones {

    // FUNCIONES Calendar
    // 01-Calcula la edad (años)
    // 02-Calcula los dias entre una fecha y la fecha actual
    // 
    // 
    // 
    /**
     * 01-Calcula la edad (años)
     */
    public static int calculaEdad(int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anioNacimiento, mesNacimiento - 1, diaNacimiento);

        Calendar fechaActual = Calendar.getInstance();

        int diferencia = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

        // DAY_OF_YEAR  es el dia (del año del 1 al 365)
        if (fechaNacimiento.get(Calendar.DAY_OF_YEAR) > fechaActual.get(Calendar.DAY_OF_YEAR)) {
            diferencia--;
        }
        return diferencia;
    }

    /**
     * 02-Calcula los dias entre una fecha y la fecha actual
     */
    public static int diasEntreFechas(int dia, int mes, int anio, boolean incluirDiaFinal) {
        Calendar fechaInicial = Calendar.getInstance();
        fechaInicial.set(anio, mes - 1, dia);
        // para evitar que la hora yava de pm o am, para que vaya de 0 a 23 y no de 0 a 11
        fechaInicial.set(Calendar.HOUR, 0);
        fechaInicial.set(Calendar.HOUR_OF_DAY, 0);
        fechaInicial.set(Calendar.MINUTE, 0);
        fechaInicial.set(Calendar.SECOND, 0);

        Calendar fechaActual = Calendar.getInstance();
        // para evitar que la hora yava de pm o am, para que vaya de 0 a 23 y no de 0 a 11
        fechaActual.set(Calendar.HOUR, 0);
        fechaActual.set(Calendar.HOUR_OF_DAY, 0);
        fechaActual.set(Calendar.MINUTE, 0);
        fechaActual.set(Calendar.SECOND, 0);

        // restando los milisegundos
        long milisegundos = Math.abs(fechaActual.getTimeInMillis() - fechaInicial.getTimeInMillis());
        int dias = (int) (milisegundos / (1000 * 60 * 60 * 24)); //86.400.000

        if (incluirDiaFinal) {
            dias++;
        }

        return dias;
    }

}
