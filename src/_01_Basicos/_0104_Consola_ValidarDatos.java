package _01_Basicos;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _0104_Consola_ValidarDatos {

    static final String DATO_NO_VALIDO = "El dato introducido no es válido.\nVuelva a introducir el dato: ";
    static final String DATO_VACIO = "ERROR: No se permiten valores nulos o espacios en blanco. \nVuelva a introducir el dato: ";
    static Pattern pDni = Pattern.compile("^[A-Za-z]?[0-9]{1,9}[A-Za-z]$");
    static Pattern pMatricula = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
    static Pattern pIBAN = Pattern.compile("^[E][S][0-9]{20}$");

    // FUNCIONES VALIDAN DATOS INTRODUCIDOS POR CONSOLA
    // 01-Verifica que es numero entero y mayor que 0
    // 02-Verifica que es numero double y mayor que 0
    // 03-Verifica que el String no está vacio
    // 04-Verifica que el texto NO está vacio NI contiene espacios en blanco
    // 05-Valida que la fecha de matriculación es anterior a la fecha actual
    // 06-DNI valida que el formato es válido
    // 07-Verifica que el año es correcto
    // 08-Verifica que el mes es correcto
    // 09-Verifica que el dia es correcto
    // 10-DNI verifica patron correcto
    // 11-IBAN verifica si el numero de IBAN sigue el patron
    // 12-Calcula los dígitos de control de una Cuenta
    /**
     * 01-Verifica que es numero entero y mayor que 0
     */
    public static int validarEntero(int num) {
        int numDevuelto = -1;
        try {
            numDevuelto = num;
            if (numDevuelto <= 0) {
                numDevuelto = -1;
                System.out.println("El número debe ser mayor que 0. Vuelva a introducir de nuevo.");
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e + "\n" + DATO_NO_VALIDO);
        }
        return numDevuelto;
    }

    /**
     * 02-Verifica que es numero double y mayor que 0
     */
    public static double validarDouble(double num) {
        double numDevuelto = -1;
        try {
            numDevuelto = num;
            if (numDevuelto <= 0) {
                numDevuelto = -1;
                System.out.println("El número debe ser mayor que 0. Vuelva a introducir de nuevo.");
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e + "\n" + DATO_NO_VALIDO);
        }
        return numDevuelto;
    }

    /**
     * 03-Verifica que el String no está vacio
     */
    public static boolean validarString(String dato) {
        if (!dato.equals("")) {
            return true;
        }
        System.out.println("El dato no puede ser vacio. Vuelva a introducir de nuevo.");
        return false;
    }

    /**
     * 04-Verifica que el texto NO está vacio NI contiene espacios en blanco
     */
    public static String validarTexto(String texto) {
        String textoDevuelto = null;
        try {
            if (texto.isEmpty() || texto.contains(" ")) {
                System.err.println(DATO_VACIO);
            } else {
                textoDevuelto = texto;
            }
        } catch (Exception e) {
            System.err.println(DATO_NO_VALIDO + " |Error: " + e);
        }
        return textoDevuelto;
    }

    /**
     * 05-Valida que la fecha de matriculación es anterior a la fecha actual
     */
    public static boolean validarFechaMatriculacion(int año, int mes, int dia) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fecha = LocalDate.of(año, mes, dia);
        if (fecha.isBefore(fechaActual)) {
            return true;
        }
        System.out.println("La fecha de matriculación tiene que ser anterior a la actual");
        return false;
    }

    /**
     * 06-DNI valida que el formato es válido
     */
    public static boolean validarDNI(String dni) throws Exception {
        try {
            //validar que tiene 9 caracteres
            if (dni.length() != 9) {
                return false;
            }
            //Validar que los 8 primeros son todos numeros
            String numero = dni.substring(0, dni.length() - 1);

            int num = Integer.valueOf(numero);

            //Validar que el ultimo caracter es una letra
            char letra = dni.charAt(dni.length() - 1);
            if (!Character.isAlphabetic(letra)) {
                return false;
            }
        } catch (NumberFormatException e) {
            throw new Exception("dni NO valido" + " |Error: " + e);
        }
        return true;
    }

    /**
     * 07-Verifica que el año es correcto
     */
    public static boolean añoCorrecto(int año) {
        if (año > 0 && año < 9999) {
            return true;
        }
        System.out.println("Año no es correcto. Tiene que ser entre (0-9999). Vuelva a introducir de nuevo.");
        return false;
    }

    /**
     * 08-Verifica que el mes es correcto
     */
    public static boolean mesCorrecto(int mes) {
        if (mes >= 1 && mes <= 12) {
            return true;
        }
        System.out.println("Mes no es correcto. Tiene que estar ente (1-12). Vuelva a introducir de nuevo.");
        return false;
    }

    /**
     * 09-Verifica que el dia es correcto
     */
    public static boolean diaCorrecto(int dia) {
        if (dia >= 1 && dia <= 31) {
            return true;
        }
        System.out.println("Dia no es correcto. Tiene que estar ente (1-31). Vuelva a introducir de nuevo.");
        return false;
    }

    /**
     * 10-DNI verifica patron correcto
     */
    public static boolean validaDNI(String dni) {
        Matcher mDni;
        mDni = pDni.matcher(dni);
        if (mDni.matches()) {
            return true;
        }
        System.out.print("Formato del DNI no es válido. Introduzcalo de nuevo:");
        return false;
    }

    /**
     * 11-IBAN verifica si el numero de IBAN sigue el patron
     */
    public static boolean validarIBAN(String iban) {
        Matcher mIBAN;
        mIBAN = pIBAN.matcher(iban);
        if (mIBAN.matches()) {
            return true;
        }
        System.out.print("Formato de la cuenta IBAN no es válido. Introduzcalo de nuevo:\n");
        return false;
    }

    /**
     * 12-Calcula los dígitos de control de una Cuenta PAGINA QUE GENERA CCC
     * https://www.generador-de-dni.com/generador-de-cuentas-bancarias#google_vignette
     *
     */
    // ejemplo
    //3879 3860 61 0229756913 
    //61 es el digito de Control 
    //3879 3860 tiene que dar 06 
    //0229756913 tiene que dar 1
    public static int obtenerDigitoControl(String valor_cuenta) {
        int[] factores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        int digito_control = 0;

        int digito_cuenta;
        for (int i = 0; i < valor_cuenta.length(); i++) {
            digito_cuenta = Integer.parseInt(String.valueOf(valor_cuenta.charAt(i)));
            digito_control += digito_cuenta * factores[i];
        }
        digito_control = 11 - (digito_control % 11);
        if (digito_control == 11) {
            digito_control = 0;
        } else if (digito_control == 10) {
            digito_control = 1;
        }
        return digito_control;
    }

}
