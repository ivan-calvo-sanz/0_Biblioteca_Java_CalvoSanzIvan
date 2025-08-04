package _06_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0600_BBDD_Teoria {

    // pagina web info
    // CONCEPTOS BASICOS BBDD
    public static void main(String[] args) {
        
        // SENTENCIAS MySQL
        // INSERT INTO USUARIO(NOMBRE,APELLIDOS,USUARIO,PASSWORD,TELEFONO,ESTADO) VALUES("Ivan","Calvo","ivan","123","689548714",1);
        // SELECT * FROM USUARIO;
        // SELECT CONCAT(NOMBRE," ",APELLIDOS) AS NOMBRE_y_APELLIDO, USUARIO, PASSWORD FROM USUARIO WHERE USUARIO="ivan" AND PASSWORD="123";

        // CONECTAR A BBDD MySQL
        try {
            // CONECTAR A BBDD MySQL
            // Añadir al proyecto el archivo .jar correspondiente (ruta relativa)
            // Class.forName -> indiamos donde está el Driver
            Class.forName("com.mysql.jdbc.Driver");
            // creamos la conexión on la cadena de conexión
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empleados_departamentos", "root", "root");

            // CREAR PETICIONES A LA BBDD
            // createStatement permite enviar sentencias (SELECT) a la BBDD
            Statement sentencia = conexion.createStatement();
            // de la sentencia la BBDD nos devuelve unos datos resultado
            ResultSet resultSet = sentencia.executeQuery("SELECT * FROM EMPLEADOS");
            // para crear sentencias que moifican la BBDD utilizamos
            // resultSet = sentencia.executeUpdate("INSERT");
            // OBTENER LOS DATOS QUE DEVUELVE LA BBDD TRAS LA SENTENCIA ANTERIOR
            while (resultSet.next()) {
                System.out.println(resultSet.getString("nomemp"));
            }

            // CERRAR
            resultSet.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
