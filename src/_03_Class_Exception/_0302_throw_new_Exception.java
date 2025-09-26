package _03_Class_Exception;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0302_throw_new_Exception {

    // ***** throw new Exception ****
    /**
     * throw new Exception lo que hace es crear un Objeto de tipo Exception y lo
     * lanza donde se ha invocado ese método para que lo capture un catch
     *
     * Se sale inmediatamente del bloque de código actual
     *
     * se ejecuta el bloque catch, es necesario tener un catch del tipo de
     * Excepcion lanzada sino el programa rompe
     */
    public static void main(String[] args) {
        try {
            metodo();
        } catch (Exception e) {
            System.out.println("Estoy dentro del catch capturando la Excepcion: " + e.getMessage());
        }
        System.out.println("FIN DEL PROGRAMA");
    }

    public static void metodo() throws Exception {
        throw new Exception("lanzo la Excepcion"); //lanzamos la excepcion
    }
}
