package _15_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _1501_BBDD_Funciones {

    private static Connection miConexion;
    final static String SERVIDOR = "localhost";
    final static int PUERTO = 3307;
    final static String BASE_DATOS = "programacion";
    final static String USUARIO = "root";
    final static String CLAVE = "root";

    public static void main(String[] args) {

    }

    // FUNCIONES BBDD
    // 01-Conectar a BBDD
    // 02-Cerrar conexion
    //
    //
    //
    // 
    // 
    /**
     * 01-Conectar a BBDD
     */
    public static void conectarBBDD() {
        try {
            //Conexion mysql
            //miConexion = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            //Conexion mariadb
            miConexion = DriverManager.getConnection("jdbc:mariadb://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            System.out.println("Conexion correcta a la BBDD");
        } catch (SQLException ex) {
            System.err.println("Se ha producido un problema en la conexión. [Codigo]:" + ex.getErrorCode() + " [Error]:" + ex.getMessage());
        }
    }

    /**
     * 02-Cerrar conexion
     */
    public static void cerrarConexion() {
        try {
            if (miConexion != null) {
                if (!miConexion.isClosed()) {
                    miConexion.close();
                    System.out.println("Desconexión de la BBDD realizada correctamente");
                }
            } else {
                System.out.println("La conexión no ha sido realizada");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido cerrar la conexión con la BBDD: " + ex.getErrorCode() + " " + ex.getMessage());
        }
    }

    /**
     * 03-Petición SELECT a BBDD
     */
    public static String[] devuelveEmpleado(int num) {
        String[] devuelve = new String[4];
        String sql = "SELECT E.APELLIDO,E.OFICIO,E.SALARIO,D.DNOMBRE "
                + " FROM DEPARTAMENTOS D JOIN EMPLEADOS E "
                + " ON D.DEPT_NO=E.DEPT_NO"
                + " WHERE E.EMP_NO=?";
        try {
            PreparedStatement ps = miConexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, num);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                devuelve[0] = rs.getString(1);
                devuelve[1] = rs.getString(2);
                devuelve[2] = rs.getString(3);
                devuelve[3] = rs.getString(4);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.err.println("Error SQL\n[Codigo]:" + ex.getErrorCode() + " [Error]:" + ex.getMessage());
        }
        return devuelve;
    }

}
