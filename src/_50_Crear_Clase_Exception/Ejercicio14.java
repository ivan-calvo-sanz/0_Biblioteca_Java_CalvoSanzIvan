package _50_Crear_Clase_Exception;

/**
 *
 * @author ivanc 14. Vamos a validar un DNI. El formato es: • 7 u 8 dígitos
 * numéricos • Una letra entre las siguientes 0 T 1 R 2 W 3 A 4 G 5 M 6 Y 7 F 8
 * P 9 D 10 X 11 B 12 N 13 J 14 Z 15 S 16 Q 17 V 18 H 19 L 20 C 21 K 22 E
 *
 * La letra se genera según el número del DNI. Para calcular la letra, cogeremos
 * el resto de dividir nuestro DNI entre 23, el resultado debe estar entre 0 y
 * 22, donde será la posición de la letra (piensa en un array de char). No
 * utilices expresiones regulares para este ejercicio. Todos los errores deben
 * ser capturados por excepciones mediante tu propia clase (heredada de
 * exception
 *
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        try {
            // 70588387F    correcto
            // 08941001G    correcto
            validarDNI("08941001G");
            System.out.println("DNI CORRECTO");
        } catch (DNIException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void validarDNI(String DNI) throws DNIException {

        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (!(DNI.length() >= 8 && DNI.length() <= 9)) {
            // lanzamos una excepcion
            // en este caso generamos una Clase propia que hereda de la Clase Excepcion 
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }

        String parte_numerica = DNI.substring(0, DNI.length() - 1);
        int numeroDNI;

        try {
            numeroDNI = Integer.parseInt(parte_numerica);
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }

        char letra = DNI.substring(DNI.length() - 1, DNI.length()).toUpperCase().charAt(0);
        if (!(letra >= 'A') && (letra <= 'Z')) {
            throw new DNIException(DNIException.PARTE_LETRA);
        }

        final int DIVISOR = 23;
        int resto = numeroDNI % DIVISOR;

        String nuevoDNI = numeroDNI + "" + letrasNIF[resto];

        // Hay DNI que comienzan en 0 estos al pasarlos a int se va a perder el 0 para no perderlo
        if (DNI.startsWith("0")) {
            nuevoDNI = "0" + nuevoDNI;
        }

        if (!(nuevoDNI.equalsIgnoreCase(DNI))) {
            throw new DNIException(DNIException.FORMATO_NO_CORRECTO);
        }

    }

}
