package _04_Expresiones_Regulares;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0401_Expresiones_Regulares_Funciones {

    // FUNCIONES ARRAYS
    // 01- Validar formato de un DNI.
    // 02- Validar formato de un nombre.
    // 03- Valida un numero entero
    // 04- Valida un numero entero positivo.
    // 05- Valida un numero entero negativo.
    // 06- Validar un numero binario.
    // 07- Validar un numero octal.
    // 08- Validar un numero hexadecimal.
    // 09- Validar numero real.
    // 10- Validar numero real positivo.
    // 11- Validar numero real negativo.
    // 12- Validar numero real con x decimales.
    // 13- Validar formato de una matricula de coche con formato 0000XXX
    // 14- Validar formato de una fecha con formato dd/mm/aaaa
    // 15- Validar formato de una dirección IP.
    // 16- Validar el formato de codigo ISBN 13 digitos, empieza 978 o 979
    // 17- Validar el nombre de usuario de twitter (empieza por @ y puede contener letras mayusculas y minusculas, numeros, guiones y guiones bajos)
    //
    //
    //
    /**
     * 01- Validar formato de un DNI.
     */
    public static boolean validaDNI(String dni) {
        // ^ ... $  OBLIGA que la expresion cumpla la expresion indicada 
        // [0-9]    está incluido numeros de 0 a 9
        // [A-Z]    está incluido las letras de A a la Z 
        // {8}      indica cuantas repeticiones

        return dni.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }

    /**
     * 02- Validar formato de un nombre.
     */
    public static boolean validaNombre(String nombre) {
        // +        indica que tiene que estar una o mas veces
        // ?        indica que es opcional
        // {1,2}    indica que todo lo anteior se repita entre 1 o 2 veces

        return nombre.matches("^([A-Z]{1}[a-z]+[ ]*){1,2}$");
    }

    /**
     * 03- Valida un numero entero
     */
    public static boolean validaNumeroEntero(String numero) {
        // -?       indica que puede o no llevar un "-"
        // [0-9]+   tienen que ser valores del 0 al 9
        return numero.matches("^-?[0-9]+$");
    }

    /**
     * 04- Valida un numero entero positivo.
     */
    public static boolean validaNumeroEnteroPositivo(String numero) {
        // [0-9]+   tienen que ser valores del 0 al 9
        return numero.matches("^[0-9]+$");
    }

    /**
     * 05- Valida un numero entero negativo.
     */
    public static boolean validaNumeroEnteroNegativo(String numero) {
        // -        tiene que llevar -        
        // [0-9]+   tienen que ser valores del 0 al 9
        return numero.matches("^-[0-9]+$");
    }

    /**
     * 06- Validar un numero binario.
     */
    public static boolean validaNumeroBinario(String binario) {
        // [01]+    tiene que ser "0" o "1" y debe repetirse al menos una vez        
        return binario.matches("^[01]+$");
    }

    /**
     * 07- Validar un numero octal.
     */
    public static boolean validaNumeroOctal(String octal) {
        // [0-7]+   tiene que ser valores entre "0" y "7" y debe repetirse al menos una vez        
        return octal.matches("^[0-7]+$");
    }

    /**
     * 08- Validar un numero hexadecimal.
     */
    public static boolean validaNumeroHexadecimal(String hexadecimal) {
        // [0-9A-Fa-f]+   tiene que ser entre intervalos de 0 a 9 o de la "A" a la "F" o de l "a" a la "f" y debe repetirse al menos una vez        
        return hexadecimal.matches("^[0-9A-Fa-f]+$");
    }

    /**
     * 09- Validar numero real.
     */
    public static boolean validaNumeroReal(String numReal) {
        // -?       puede o no iniciar con "-" 
        // [0-9]+   tiene que haber minimo uno de entre 0 y 9
        // ()?      signiica ue todo lo que vaya dentro del parentesis es opcional
        // [\\.,]   significa que v o un punto o una coma
        return numReal.matches("^-?[0-9]+([\\.,][0-9]+)?$");
    }

    /**
     * 10. Validar numero real positivo.
     */
    public static boolean validaNumeroRealPositivo(String numRealPos) {
        // [0-9]+   tiene que haber minimo uno de entre 0 y 9
        // ()?      signiica ue todo lo que vaya dentro del parentesis es opcional
        // [\\.,]   significa que v o un punto o una coma
        return numRealPos.matches("^[0-9]+([\\.,][0-9]+)?$");
    }

    /**
     * 11. Validar numero real negativo.
     */
    public static boolean validaNumeroRealNegativo(String numRealNegativo) {
        // -        tiene  que llevar un "-"        
        // [0-9]+   tiene que haber minimo uno de entre 0 y 9
        // ()?      signiica ue todo lo que vaya dentro del parentesis es opcional
        // [\\.,]   significa que v o un punto o una coma
        return numRealNegativo.matches("^-[0-9]+([\\.,][0-9]+)?$");
    }

    /**
     * 12. Validar numero real con x decimales.
     */
    public static boolean validaNumReal(String numReal, int numDecimales) {
        // -?       puede o no llevar un "-"        
        // [0-9]+   tiene que haber minimo uno de entre 0 y 9
        // [\\.,]   significa que lleva o un punto o una coma
        // [0-9]{1," + numDecimales + "})?      tiene que haber "0" o "9" al menos una vez y tantas veces como "numDecimales"
        if (numDecimales > 0) {
            return numReal.matches("^-?[0-9]+[\\.,][0-9]{" + numDecimales + "}$");
        } else {
            return false;
        }
    }

    /**
     * 13. Validar formato de una matricula de coche con formato 0000XXX
     */
    public static boolean validaMatricula(String matricula) {
        // [0-9]{4} indicamos que tiene que tener 4 numeros        
        // [A-Z]{3} tiene que tener 3 letras
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");
    }

    /**
     * 14. Validar formato de una fecha con formato dd/mm/aaaa
     */
    public static boolean validaFecha(String fecha) {
        // (0?[1-9]|[12][0-9]|3[01])    puede ir un 0 luego un 1 al 9 (haciendo del 0 al 9 o del 00 al 09), o... un 1 o 2 luego un 0 al 9 (haciendo del 10 al 19), o un 3 luego un 0 o un 1 (haciendo el 30 o 31)      
        // [\\/]                        indica que tiene que ir el caracter especial "/"
        // (0?[1-9]|1[012])             puede ir un 0 luego un 1 al 9 (haciendo del 0 al 9 o del 00 al 09), o...un 1 luego un 0 o 1 o 2 (haciendo 10, 11 o 12)
        // [\\/]                        indica que tiene que ir el caracter especial "/"
        // ([012][0-9]\\d{2})           puede ir un 0 o un 1 o un 2 luego del 0 al 9 y luego dos digitos cualquiera (haciendo del 0000 al 2999)
        return fecha.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/]([012][0-9]\\d{2})$");
    }

    /**
     * 15. Validar formato de una dirección IP.
     */
    public static boolean validaIP(String ip) {
        return ip.matches("^([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])$");
    }

    /**
     * 16. Validar el formato de codigo ISBN 13 digitos, empieza 978 o 979
     */
    public static boolean validaISBN(String isbn) {
        return isbn.matches("^(978|979)[0-9]{10}$");
    }

    /**
     * 17. Validar el nombre de usuario de twitter (empieza por @ y puede
     * contener letras mayusculas y minusculas, numeros, guiones y guiones
     * bajos)
     */
    public static boolean validaUsuarioTwitter(String usuario) {
        return usuario.matches("^@([A-Za-z0-9_-]){1,15}$");
    }

}
