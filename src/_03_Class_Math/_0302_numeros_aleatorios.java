package _03_Class_Math;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0302_numeros_aleatorios {

    public static void main(String[] args) {
        // main para realizar pruebas de los metodos
        System.out.println(generaNumAleatorio());
    }

    // FUNCIONES Numeros aleatorios
    // 01-Genera numero aleatorio
    // 02-Genera un numero entero aleatorio entre dos valores
    // 03-Genera un numero Real aleatorio entre dos valores
    // 04-Genera un array con numeros aleatorios no repetidos
    // 05-Genera una Matriz con numeros aleatorios no repetidos
    // 
    /**
     * 01-Genera numero aleatorio
     */
    public static int generaNumAleatorio() {
        return (int) (Math.random() * 10);
    }

    /**
     * 02-Genera un numero aleatorio entre dos valores
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

    /**
     * 03-Genera un numero Real aleatorio entre dos valores
     */
    public static double generaNumeroRealAleatorio(int minimo, int maximo) {
        double num = Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

    /**
     * 04-Genera un array con numeros aleatorios no repetidos (El valor 0 no se
     * contempla que sea un posible valor en el array de numeros aleatorios)
     *
     * @param valorAleatorioMinimo intervalo-valor minimo del numero aleatorio
     * generado
     * @param valorAleatorioMaximo intervalo-valor maximo del numero aleatorio
     * generado
     * @param longitudArray longitud del Array
     * @return int[]
     */
    public static int[] generaArrayNumerosAleatoriosSinRepetir(int longitudArray, int valorAleatorioMinimo, int valorAleatorioMaximo) {
        int[] numeros = new int[longitudArray];
        // si usuario introduce intercambiado el maximo y minimo lo ordenamos
        if (valorAleatorioMaximo < valorAleatorioMinimo) {
            int aux = valorAleatorioMaximo;
            valorAleatorioMaximo = valorAleatorioMinimo;
            valorAleatorioMinimo = aux;
        }
        // el numero de valores entre el valor minimo y el maximo tiene que ser mayor que la longitud deseada del array
        if ((valorAleatorioMaximo - valorAleatorioMinimo) >= (longitudArray - 1)) {
            int numero_elementos = 0;
            boolean encontrado;
            int aleatorio;

            while (numero_elementos < longitudArray) {
                encontrado = false;
                aleatorio = generaNumeroAleatorio(valorAleatorioMinimo, valorAleatorioMaximo);
                for (int i = 0; i < numeros.length && !encontrado; i++) {
                    if (aleatorio == numeros[i]) {
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    numeros[numero_elementos] = aleatorio;
                    numero_elementos++;
                }
            }
        } else {
            System.out.println("Números aleatorios disponibles es menor que la longitud del array. No se puede generar el array");
        }
        return numeros;
    }

    /**
     * 05-Genera una Matriz con numeros aleatorios no repetidos (El valor 0 no
     * se contempla que sea un posible valor en el array de numeros aleatorios)
     *
     * @param numFilasMatriz numero de filas que tendra la Matriz generada
     * @param numColumnasMatriz numero de filas que tendra la Matriz generada
     * @param valorAleatorioMinimo intervalo-valor minimo del numero aleatorio
     * generado
     * @param valorAleatorioMaximo intervalo-valor minimo del numero aleatorio
     * generado
     * @return int[][]
     */
    public static int[][] generaNumeroAleatorio(int numFilasMatriz, int numColumnasMatriz, int valorAleatorioMinimo, int valorAleatorioMaximo) {
        int matriz[][] = new int[numFilasMatriz][numColumnasMatriz];
        int[] numeros = generaArrayNumerosAleatoriosSinRepetir(matriz.length * matriz[0].length, valorAleatorioMinimo, valorAleatorioMaximo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numeros[(matriz[0].length * i) + j];
            }
        }
        return matriz;
    }

}
