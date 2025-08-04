package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0203_while {

    // https://www.w3schools.com/java/java_while_loop.asp
    // CONCEPTOS BASICOS while
    // 
    public static void main(String[] args) {
        // Sintaxis while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do-while
        // ejecuta el bloque de código una vez SIEMPRE, antes de verificar si la condición es verdadera, luego repetirá el bucle mientras la condición sea verdadera
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // break   
        // se utiliza para salir del bucle
        // Este ejemplo se sale del bucle cuando k es igual a 4:
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 4) {
                break;
            }
        }

        // continue   
        // interrumpe una iteración, si se produce la condición, y continúa con la siguiente iteración
        // Este ejemplo omite el valor de 4:
        int z = 0;
        while (z < 10) {
            if (z == 4) {
                z++;
                continue;
            }
            System.out.println(z);
            z++;
        }

    }
}
