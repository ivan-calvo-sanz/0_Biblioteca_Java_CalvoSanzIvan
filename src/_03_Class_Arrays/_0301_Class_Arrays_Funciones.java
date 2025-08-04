package _03_Class_Arrays;

import java.util.Arrays;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0301_Class_Arrays_Funciones {

    // FUNCIONES ARRAYS
    // 01-Mostrar los valores que contiene un array
    // 02-Calcula el valor de la suma de los elementos del array
    // 03-Calcula la media de los valores de los elementos del array
    // 04-Invertir un array
    // 05-Determina si es capicua
    // 06-Ordena array mediante el metodo "Burbuja"
    // 07-Ordena array de numeros forma ascendente mediante el metodo "Quicksrot"
    // 08-Ordena array de String de forma ascendente mediante el metodo "Quicksrot"
    // 09-Busqueda Binaria devuelve en que posición está un valor
    // 10-Devuelve un array de numeros entre dos intervalos dados por parametros
    // 11-Devuelve un array con los valores mayor y menor de un array.
    // 12-Devuelve un array con los divisores de un numero pasado por parametro
    // 13-Devuelve un array con el Mayor y Menor divisor de un numero
    // 14-Determina si hay algun elemento repetido en 1 array
    // 15-Determina si hay algun elemento repetido en 2 arrays
    // 16-Indica el numero de veces que se repite un numero
    // 17-Indica el numero de veces que se repite un numero en 2 arrays en posiciones diferentes
    // 18-Indica el numero de veces que se repite un numero en 2 arrays en la misma posicion
    //
    //
    /**
     * 01-Mostrar los valores que contiene un array
     */
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 02-Calcula el valor de la suma de los elementos del array
     */
    public static int sumaArray(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    /**
     * 03-Calcula la media de los valores de los elementos del array
     */
    public static double mediaArray(int[] numeros) {
        int suma = sumaArray(numeros);
        double media = (double) suma / numeros.length;
        return media;
    }

    /**
     * 04-Invertir un array
     */
    public static int[] invertirArray(int[] array) {
        int invertido[] = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            invertido[i] = array[j];
        }
        return invertido;
    }

    /**
     * 05-Determina si es capicua
     */
    public static boolean esCapicua(int[] array) {
        int aux[] = invertirArray(array);
        return Arrays.equals(array, aux);
    }

    /**
     * 06-Ordena array mediante el metodo "Burbuja"
     *
     * @return NO devuelve nada ya que ordena el propio array que se le pasa por
     * parámetro (arrays realiza paso por referencia)
     */
    public static void ordenacionBurbuja(int[] array) {
        //metodo Burbuja va comparando un elemento con el siguiente elemento
        int cuentaIntercambios = 0;
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < array.length - 1; i++) {
                // cambiando el signo > por < la ordenacion pasa de Ascendente a Descendente
                if (array[i] > array[i + 1]) {
                    int variableAuxiliar = array[i];
                    // intercambia los valores
                    array[i] = array[i + 1];
                    array[i + 1] = variableAuxiliar;
                    cuentaIntercambios++;
                }
            }
            // si NO se ha sumado a cuentaIntercambios significa que ha recorrido el array y no ha encontrado elemento desordenado por lo tanto ordenado=true para que no vuelva al bucle for
            if (cuentaIntercambios == 0) {
                ordenado = true;
            }
            // si llega aqui es que cuentaIntercambios ha sumado ++ se iguala a 0 y vuelve a recorrer el array
            cuentaIntercambios = 0;
        }
    }

    /**
     * 07-Ordena array de numeros forma ascendente mediante el metodo
     * "Quicksrot". Quicksrot utiliza la Recursividad por lo que es mas optimo
     * que el método "Burbuja" Recusividad es que una función se llama a si
     * misma un numero determinado de veces
     *
     * @return NO devuelve nada ya que ordena el propio array que se le pasa por
     * parámetro (arrays realiza paso por referencia)
     */
    // ordenacionQuicksort(numeros, 0, numeros.length - 1);
    public static void ordenacionQuicksortNumeros(int[] array, int izq, int der) {
        // Quicksort ordena por trozos, coge un pivote (centro)
        int i = izq;
        int j = der;
        int pivote = array[(i + j) / 2];
        do {
            // ordena de forma ascendente para descendente cambiar a >
            while (array[i] < pivote) {
                i++;
            }
            // ordena de forma ascendente para descendente cambiar a <
            while (array[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            ordenacionQuicksortNumeros(array, izq, j);
        }
        if (i < der) {
            ordenacionQuicksortNumeros(array, i, der);
        }
    }

    /**
     * 08-Ordena array de String de forma ascendente mediante el metodo
     * "Quicksrot". Quicksrot utiliza la Recursividad por lo que es mas optimo
     * que el método "Burbuja" Recusividad es que una función se llama a si
     * misma un numero determinado de veces
     *
     * @return NO devuelve nada ya que ordena el propio array que se le pasa por
     * parámetro (arrays realiza paso por referencia)
     */
    // ordenacionQuicksort(cadenas, 0, cadenas.length - 1);
    public static void ordenacionQuicksortCadenas(String[] array, int izq, int der) {
        // Quicksort ordena por trozos, coge un pivote (centro)
        int i = izq;
        int j = der;
        int pivote = (i + j) / 2;
        do {
            // ordena de forma ascendente para descendente cambiar a >
            while (array[i].compareToIgnoreCase(array[pivote]) < 0) {
                i++;
            }
            // ordena de forma ascendente para descendente cambiar a <
            while (array[j].compareToIgnoreCase(array[pivote]) > 0) {
                j--;
            }
            if (i <= j) {
                String aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            ordenacionQuicksortCadenas(array, izq, j);
        }
        if (i < der) {
            ordenacionQuicksortCadenas(array, i, der);
        }
    }

    /**
     * 09-Busqueda Binaria devuelve en que posición está un valor Necesita que
     * el array esté ordenado Va cogiendo mitades del array, va acortando
     * acortando acortando el array hasta que solo quede 1 y es ese el buscado.
     * Si el numero Buscado no existe en el array devuelve -1
     *
     * @return posición del numero
     */
    public static int busquedaBinaria(int[] array, int numeroBuscado) {
        int izq = 0;
        int der = array.length;
        boolean encontrado = false;
        int pos = -1;

        for (int i = 0; !encontrado && i < array.length; i++) {
            int central = array[(izq + der) / 2];
            if (central <= numeroBuscado) {
                if (central == numeroBuscado) {
                    encontrado = true;
                    pos = (izq + der) / 2;
                } else {
                    izq = (izq + der) / 2;
                }
            } else {
                der = (izq + der) / 2;
            }
        }
        return pos;
    }

    /**
     * 10-Devuelve un array de numeros entre dos intervalos dados por
     * parametros. Si introduzco de 5 a 7, el array tendrá los números 5,6,7
     * pero si inserto de 7 a 5, el array tendrá los números de 7,6,5
     */
    public static int[] serie(int numInicial, int numFinal) {
        int tamanio = Math.abs(numFinal - numInicial) + 1;
        int[] serie = new int[tamanio];
        if (numInicial < numFinal) {
            for (int i = 0, j = numInicial; i < serie.length; i++, j++) {
                serie[i] = j;
            }
        } else {
            for (int i = 0, j = numInicial; i < serie.length; i++, j--) {
                serie[i] = j;
            }
        }
        return serie;
    }

    /**
     * 11-Devuelve un array con los valores mayor y menor de un array. Posicion
     * [0] valor mayor, posicion [1] valor menor
     */
    public static int[] mayorMenorArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        int[] mayor_menor = new int[2];

        mayor_menor[0] = array[0];
        mayor_menor[1] = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor_menor[0]) {
                mayor_menor[0] = array[i];
            }
            if (array[i] < mayor_menor[1]) {
                mayor_menor[1] = array[i];
            }
        }
        return mayor_menor;
    }

    /**
     * 12-Devuelve un array con los divisores de un numero pasado por parametro
     */
    public static int[] divisores(int num) {
        int contador = 0;

        for (int i = (int) (num / 2); i > 1; i--) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador == 0) {
            return null;
        } else {
            int[] divisores = new int[contador];
            for (int i = (int) (num / 2), j = 0; i > 1; i--) {
                if (num % i == 0) {
                    divisores[j] = i;
                    j++;
                }
            }
            return divisores;
        }
    }

    /**
     * 13-Devuelve un array con el Mayor y Menor divisor de un numero pasado por
     * parametro
     */
    public static int[] mayorMenorDivisor(int numero) {
        int[] divisores = divisores(numero);
        if (divisores == null || divisores.length == 0) {
            return null;
        } else {
            int[] mayorMenorDivisor = mayorMenorArray(divisores);
            return mayorMenorDivisor;
        }
    }

    /**
     * 14-Determina si hay algun elemento repetido en 1 array
     */
    public static boolean elementoRepetido(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 15-Determina si hay algun elemento repetido en 2 arrays
     */
    public static boolean elementoRepetido(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 16-Indica el numero de veces que se repite un numero
     */
    public static int numeroElementosRepetido(int[] array, int num) {
        int repetido = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                repetido++;
            }
        }
        return repetido;
    }

    /**
     * 17-Indica el numero de veces que se repite un numero en 2 arrays en
     * posiciones diferentes
     */
    public static int numeroElementosRepetidosDistintaPosicion(int[] array1, int[] array2) {
        int repetido = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (i != j && array1[i] == array2[j]) {
                    repetido++;
                }
            }
        }
        return repetido;
    }

    /**
     * 18-Indica el numero de veces que se repite un numero en 2 arrays en la
     * misma posicion
     */
    public static int numeroElementosRepetidosMismaPosicion(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return -1;
        }
        int repetido = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                repetido++;

            }
        }
        return repetido;
    }

}
