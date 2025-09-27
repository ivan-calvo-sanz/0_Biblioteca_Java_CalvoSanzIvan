package _03_Class_Exception_Crear_Excepciones_Usuario;

import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Carlos"));
        clientes.add(new Cliente("Tom"));
        clientes.add(new Cliente("Kal"));

        try {
            nuevoCliente("Tom", clientes); // aqui se crea una excepcion ya que Tom ya existe como cliente
            nuevoCliente("Nico", clientes);
        } catch (ClienteExisteException e) {
            System.out.println("ERROR ClienteExisteException " + e.toString());
        }

        System.out.println(clientes);  // aqui vemos que en Tom ha saltado la excepción y Nico NO se ha añadido al ArrayList
    }

    public static void nuevoCliente(String nombre, ArrayList<Cliente> clientes) throws ClienteExisteException {
        for (Cliente c : clientes) {
            if (c.getNombre().equals(nombre)) {
                throw new ClienteExisteException(c);
            }
        }
        clientes.add(new Cliente(nombre));
        System.out.println("Cliente añadido correctamente");
    }
}
