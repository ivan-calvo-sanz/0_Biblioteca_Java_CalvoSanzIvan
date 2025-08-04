package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0201_if {

    // https://www.w3schools.com/java/java_conditions.asp
    // CONCEPTOS BASICOS if
    public static void main(String[] args) {
        // Sintaxis if
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        // Sintaxis if-else
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Outputs "Good evening."

        // Sintaxis if-else if
        int time_v1 = 22;
        if (time_v1 < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Outputs "Good evening."

        // Operador ternario
        int time_v2 = 20;
        if (time_v2 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        String result = (time_v2 < 18) ? "Good day." : "Good evening."; // Operador ternario
        System.out.println(result);
    }

}
