package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0204_for {

    // https://www.w3schools.com/java/java_for_loop.asp
    // CONCEPTOS BASICOS for
    // Bucle   for   se utiliza cuando se sabe exactamente cuántas veces desea recorrer un bloque de código, en lugar de while
    // 
    // for (declaración 1; declaración 2; declaración 3) {
    // declaración 1 se ejecuta (una vez) antes de la ejecución del bloque de código.
    // declaración 2 define la condición para ejecutar el bloque de código.
    // declaración 3 se ejecuta (cada vez) después de que se haya ejecutado el bloque de código.
    public static void main(String[] args) {
        // Sintaxis for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // for anidados
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        // break   
        // se utiliza para salir del bucle
        // Este ejemplo se sale del bucle cuando i es igual a 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // continue   
        // interrumpe una iteración, si se produce la condición, y continúa con la siguiente iteración
        // Este ejemplo omite el valor de 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}
