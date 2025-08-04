package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0202_switch {

    // https://www.w3schools.com/java/java_switch.asp
    // CONCEPTOS BASICOS switch
    // break    palabra clave, sale del bloque
    // default  palabra clave, se ejecutará si no hay coincidencia de casos
    public static void main(String[] args) {
        // Sintaxis if-else
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        } // Output "Tuesday" (day 2)
    }

}
