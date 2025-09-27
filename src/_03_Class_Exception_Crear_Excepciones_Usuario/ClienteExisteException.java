package _03_Class_Exception_Crear_Excepciones_Usuario;

/**
 *
 * @author ivanc
 */
public class ClienteExisteException extends Exception {

    private Cliente cliente;

    public ClienteExisteException(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "El cliente de nombre " + this.cliente.getNombre() + " ya existe";
    }
}
