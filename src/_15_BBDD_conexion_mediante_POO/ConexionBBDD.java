package _15_BBDD_conexion_mediante_POO;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ivanc
 */
public abstract class ConexionBBDD {

    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultSet;

    public ConexionBBDD(String claseNombre, String cadenaConexion) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion);
            conexion.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ConexionBBDD(String claseNombre, String cadenaConexion, String usuario, String pass) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion, usuario, pass);
            conexion.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * FUNCION devuelve la conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * FUNCION devuelve el resultSet resultSet: mantiene un cursor que apunta a
     * una fila de una tabla. Inicialmente, el cursor apunta antes de la primera
     * fila
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * FUNCION actualiza los cambios realizados en la BBDD
     *
     */
    public void commit() {
        try {
            conexion.commit();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConexionBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * FUNCION vuelve a un estado previo de la BBDD
     *
     */
    public void rollback() {
        try {
            conexion.rollback();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConexionBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * FUNCION cierra resultSet
     *
     */
    public void cerrarResultSet() {
        try {
            resultSet.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConexionBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * FUNCION cierra la sentencia
     *
     */
    public void cerrarSentencia() {
        try {
            sentencia.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConexionBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * FUNCION cierra la conexion
     *
     */
    public void cerrarConexion() {
        try {
            if (resultSet != null) {
                cerrarResultSet();
            }
            if (sentencia != null) {
                cerrarSentencia();
            }
            conexion.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConexionBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * FUNCION devuelve al ResultSet los resultados de una consulta
     *
     */
    public void ejecutarConsulta(String consulta) {
        try {
            sentencia = conexion.createStatement();
            resultSet = sentencia.executeQuery(consulta);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConexionBBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
