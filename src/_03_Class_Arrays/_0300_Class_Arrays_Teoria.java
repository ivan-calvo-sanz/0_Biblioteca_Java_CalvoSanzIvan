package _03_Class_Arrays;

import java.util.Arrays;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Arrays_Teoria {

    // https://www.w3schools.com/java/java_arrays.asp
    // CONCEPTOS BASICOS CLASE Arrays
    // arrays   paso por Referencia
    // Array se genera inicialmente con elementos null
    public static void main(String[] args) {
        // DECLARAR ARRAY
        String[] cars_v0;
        String[] cars_v1 = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        char[] caracteres = new char[10];
        int[] numeros = {9, 0, 0, 9};
        int[] aux;

        // Acceder a los elementos de un Array
        String[] cars_v2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars_v2[0]); // Outputs Volvo

        //Cambiar un elemento de un array
        cars_v2[0] = "Opel";

        // Longitud de un Array
        int longitud = cars_v1.length; // Output 4

        //Recorrer un Array
        for (int i = 0; i < cars_v1.length; i++) {
            System.out.println(cars_v1[i]);
        }

        //Recorrer una matriz con For-Each
        for (String c : cars_v1) {
            System.out.println(c);
        }

        // ARRAY MULTIDIMENSIONALES
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]); // Output 7
        myNumbers[1][2] = 9;
        //Recorrer un Array multidimensional
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // METODOS CLASE ARRAY
        // equals       compara si el contenido de los Arrays son iguales
        // DIFERENCIAR equals de ==   ,equals compara el contenido, ==  compara la referencia (a donde apunta en la memoria)
        numeros = myNum;    // iguala la referencia
        boolean iguales = Arrays.equals(numeros, myNum);
        // fill         rellena el array con el valor indicado
        Arrays.fill(numeros, -1);
        // fill         rellena el array desde una posicion hasta otra con el valor indicado
        Arrays.fill(numeros, 3, 5, -1);
        // copyOf       copia en un array otro array y se indica la longitud del nuevo array generado
        int[] num2 = Arrays.copyOf(numeros, 12);
        // copyOfRange  copia en un array otro array desde una posicion hasta otra indicadas
        int[] num3 = Arrays.copyOfRange(num2, 2, 9);
        // sort         ordena array (ascendente)
        Arrays.sort(numeros);
        // toString         Genera una cadena String para impresión.
        Arrays.toString(cars_v1);
    }

}
