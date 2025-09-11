package _15_BBDD_conexion_mediante_POO;

/**
 *
 * @author ivanc
 */
public class ConexionMySQL extends ConexionBBDD {

    public ConexionMySQL(String host, String puerto, String basedatos, String usuario, String password) {
        super("com.mysql.cj.jdbc.Driver", "jdbc:mysql://" + host + ":" + puerto + "/" + basedatos, usuario, password);
    }

    public ConexionMySQL(String host, String baseatos, String usuario, String password) {
        super("com.mysql.cj.jdbc.Driver", "jdbc:mysql://" + host + "/" + baseatos, usuario, password);
    }

}
