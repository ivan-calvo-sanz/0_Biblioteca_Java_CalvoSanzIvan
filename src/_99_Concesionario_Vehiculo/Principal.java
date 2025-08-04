package _99_Concesionario_Vehiculo;


import _01_Basicos._0103_Consola_PedidorDeDatos;
import _01_Basicos._0104_Consola_ValidarDatos;
import java.util.Scanner;

/**
 * CLASE Principal contiene el método main del programa
 *
 * @author Iván Calvo Sanz / 1ºDAW
 * @version 1.0, 2022/01/12
 */
public class Principal {

    static Scanner entrada = new Scanner(System.in);
    static final String MENU_PRINCIPAL
            = "\n************************\n"
            + "*****MENU PRINCIPAL*****\n"
            + "************************\n"
            + "1-NUEVO VEHICULO\n"
            + "2-LISTAR VEHICULOS\n"
            + "3-BUSCAR VEHICULO\n"
            + "4-MODIFICAR KMs VEHICULO\n"
            + "5-ELIMINAR VEHICULO\n"
            + "6-SALIR\n"
            + "\nIntroduce opción del Menú: ";

    /**
     * METODO main genera el menu del programa
     */
    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario();
        System.out.print(MENU_PRINCIPAL);
        boolean validar;
        int opcion;

        do {  //para salir del programa               
            do {
                opcion = _0103_Consola_PedidorDeDatos.pedirInt("");
            } while (_0104_Consola_ValidarDatos.validarEntero(opcion) == -1);

            validar = true;
            switch (opcion) {
                case 1:
                    nuevoVehiculo(concesionario);
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 2:
                    concesionario.listaVehículos();
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 3:
                    buscarVehiculos(concesionario);
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 4:
                    modificarKmsVehiculo(concesionario);
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 5:
                    eliminaVehiculo(concesionario);
                    System.out.println("*************************");
                    System.out.print(MENU_PRINCIPAL);
                    break;
                case 6:
                    System.out.println("***La aplicacion se ha cerrado***");
                    break;
                default:
                    validar = false;
                    System.out.println("La opcion tiene que ser entre 1 y 6");
                    System.out.println("Introduce opción del Menú:");
            }
        } while (opcion != 6 || !validar);
    }

    /**
     * METODO case 1 genera un objeto Concesionario, realiza la comprobación de
     * los datos insertados por consola
     */
    private static void nuevoVehiculo(Concesionario concesionario) {

        String marca;
        do {
            marca = _0103_Consola_PedidorDeDatos.pedirString("Marca del Vehiculo:");
        } while (!_0104_Consola_ValidarDatos.validarString(marca));

        String matricula;
        do {
            matricula = _0103_Consola_PedidorDeDatos.pedirString("Matrícula del Vehiculo:");
        } while (!_0104_Consola_ValidarDatos.validaMatricula(matricula));

        int numKm;
        do {
            numKm = _0103_Consola_PedidorDeDatos.pedirInt("Número de kilómetros (km):");
        } while (_0104_Consola_ValidarDatos.validarEntero(numKm) == -1);

        int añoMatriculacion;
        do {
            añoMatriculacion = _0103_Consola_PedidorDeDatos.pedirInt("Año de matriculación (yyyy):");
        } while (!_0104_Consola_ValidarDatos.añoCorrecto(añoMatriculacion));

        int mesMatriculacion;
        do {
            mesMatriculacion = _0103_Consola_PedidorDeDatos.pedirInt("Mes de matriculación (MM):");
        } while (!_0104_Consola_ValidarDatos.mesCorrecto(mesMatriculacion));

        int diaMatriculacion;
        do {
            diaMatriculacion = _0103_Consola_PedidorDeDatos.pedirInt("Dia de matriculación (dd):");
        } while (!_0104_Consola_ValidarDatos.diaCorrecto(diaMatriculacion));

        String descripcion;
        do {
            descripcion = _0103_Consola_PedidorDeDatos.pedirString("Descripcion del Vehiculo:");
        } while (!_0104_Consola_ValidarDatos.validarString(descripcion));

        double precio;
        do {
            precio = _0103_Consola_PedidorDeDatos.pedirDouble("Precio del Vehiculo (€):");
        } while (_0104_Consola_ValidarDatos.validarDouble(precio) == -1);

        String nombrePropietario;
        do {
            nombrePropietario = _0103_Consola_PedidorDeDatos.pedirString("Nombre del propietario:");
        } while (!_0104_Consola_ValidarDatos.validaNombrePropietario(nombrePropietario));

        String dniPropietario;
        do {
            dniPropietario = _0103_Consola_PedidorDeDatos.pedirString("DNI del propietario:");
        } while (!_0104_Consola_ValidarDatos.validaDNI(dniPropietario));

        int insertado = concesionario.insertarVehiculo(marca, matricula, numKm, añoMatriculacion, mesMatriculacion, diaMatriculacion, descripcion, precio, nombrePropietario, dniPropietario);
        if (insertado == -2) {
            System.out.println("El vehículo ya existe en el concesionario NO se ha insertado al Concesionario");
        } else if (insertado == 0) {
            System.out.println("Vehiculo se ha insertado correctamente");
        }

    }

    /**
     * METODO case 3 lanza una búsqueda de un Vehículo en el Concesionario
     */
    private static void buscarVehiculos(Concesionario concesionario) {
        String matricula = _0103_Consola_PedidorDeDatos.pedirString("Matrícula del Vehiculo:");
        int i = concesionario.buscaVehiculo(matricula);
        if (i != -1) {
            System.out.println(concesionario.muestraVehiculo(i));
        } else {
            System.out.println("No existe vehículo con la matrícula introducida");
        }
    }

    /**
     * METODO case 4 lanza para modificar los kms de un Vehículo perteneciente
     * al Concesionario
     */
    private static void modificarKmsVehiculo(Concesionario concesionario) {
        String matricula;
        do {
            matricula = _0103_Consola_PedidorDeDatos.pedirString("Matrícula del Vehiculo:");
        } while (!_0104_Consola_ValidarDatos.validaMatricula(matricula));

        int numKm;
        do {
            numKm = _0103_Consola_PedidorDeDatos.pedirInt("Número de kilómetros (km):");
        } while (_0104_Consola_ValidarDatos.validarEntero(numKm) == -1);

        if (concesionario.actualizaKms(matricula, numKm)) {
            System.out.println("Kms actualizados");
        } else {
            System.out.println("El vehículo no existe");
        }
    }

    /**
     * METODO case 5 lanza para borrar un Vehículo del Concesionario
     */
    private static void eliminaVehiculo(Concesionario concesionario) {
        String matricula;
        do {
            matricula = _0103_Consola_PedidorDeDatos.pedirString("Matrícula del Vehiculo:");
        } while (!_0104_Consola_ValidarDatos.validaMatricula(matricula));

        if (concesionario.eliminaVehiculoV2(matricula)) {
            System.out.println("Vehículo eliminado correctamente");
        } else {
            System.out.println("El vehículo no existe");
        }
    }

}
